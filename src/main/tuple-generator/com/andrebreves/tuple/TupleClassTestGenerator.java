/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.andrebreves.tuple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Generates unit tests for the Tuple classes.
 * @author Andre Breves
 */
public class TupleClassTestGenerator implements ClassGenerator {

    private final int degree;
    private final int maxDegree;
    private final List<Integer> degrees;
    private final StringBuilder code;

    public TupleClassTestGenerator(int degree, int maxDegree) {
        if (degree < 0) throw new IllegalArgumentException("Invalid degree: " + degree);
        this.degree = degree;
        this.maxDegree = maxDegree;
        this.degrees = IntStream.rangeClosed(1, degree).boxed().collect(toList());
        code = new StringBuilder();
        generateSourceCode();
    }

    @Override
    public String code() {
        return code.toString();
    }

    @Override
    public String packageName() { return "com.andrebreves.tuple"; }

    @Override
    public String className() { return testedClass() + "Test"; }

    private String testedClass() { return "Tuple" + degree; }

    private static <T> Function<T, String> to(String format, Object... args) {
        return t -> String.format(format.replaceAll("%0", t.toString()), args);
    }

    private String stringValues() { return degrees.stream().map(to("\"v%0\"")).collect(joining(", ", "(", ")")); }
    private String intValues() { return degrees.stream().map(to("%0")).collect(joining(", ", "(", ")")); }
    private String repeatValue(String value) { return degrees.stream().map(to(value)).collect(joining(", ", "(", ")")); }

    private String mixedValues() {
        return degrees.stream().map(degree -> {
            switch (degree % 3) {
                case 0: return "\"v" + degree + "\"";
                case 1: return String.valueOf(degree);
                default: return "null";
            }
        }).collect(joining(", ", "(", ")"));
    }

    private String genericType(String type) {
        if (degree == 0) return "";
        return IntStream.rangeClosed(1, degree).boxed().map(to(type)).collect(joining(", ", "<", ">"));
    }

    private void generateSourceCode() {
        code.append(license());
        generatePackage();
        generateImports();
        generateClass();
    }

    private void generatePackage() {
        code.append("package ").append(packageName()).append(";\n");
        code.append("\n");
    }

    private void generateImports() {
        code.append("import org.junit.*;\n");
        code.append("import static org.junit.Assert.*;\n");
        code.append("\n");
    }

    private void generateClass() {
        code.append("public class ").append(className()).append(" {\n");
        code.append("\n");
        generateFields();
        generateBeforeMethods();
        generateTests();
        code.append("}");
        code.append("\n");
    }

    private void generateFields() {
        code.append("    ").append(testedClass()).append(genericType("String")).append(" tuple;\n");
        code.append("\n");
    }

    private void generateBeforeMethods() {
        code.append("    @Before\n");
        code.append("    public void setup() {\n");
        code.append("        tuple = ").append(testedClass()).append(".of").append(stringValues()).append(";\n");
        code.append("    }\n");
        code.append("\n");
    }

    private void generateTests() {
        generateDegreeTests();
        generateOfTests();
//        generateConcatTests();
        generateVxTests();
        generateEqualsTests();
        generateHashCodeTests();
        generateCompareToTests();
        // TODO: Generate tests for new methods
    }

    private void generateOfTests() {
        code.append("    @Test\n");
        code.append("    public void of_shouldReturnNonNull").append(testedClass()).append("Instance_whenCalled() {\n");
        code.append("        assertEquals(").append(testedClass()).append(".class, ").append(testedClass()).append(".of").append(stringValues()).append(".getClass());\n");
        code.append("    }\n");
        code.append("\n");
        if (degree > 0) {
            code.append("    @Test\n");
            code.append("    public void of_shouldReturnNonNullInstance_whenCalledWithNullArguments() {\n");
            code.append("        assertNotNull(").append(testedClass()).append(".of").append(repeatValue("null")).append(");\n");
            code.append("    }\n");
            code.append("\n");
            code.append("    @Test\n");
            code.append("    public void of_shouldReturnNonNullInstance_whenCalledWithMixedTypeArguments() {\n");
            code.append("        assertNotNull(").append(testedClass()).append(".of").append(mixedValues()).append(");\n");
            code.append("    }\n");
            code.append("\n");
        }
    }

    private String stringValues(int start, int end) { return IntStream.rangeClosed(start, end).boxed().map(to("\"v%0\"")).collect(joining(", ", "(", ")")); }

    private void generateConcatTests() {
        code.append("    @Test\n");
        code.append("    public void concat_shouldReturnEqualTuple").append(degree).append("_whenCalledWithNoArguments() {\n");
        code.append("        assertEquals(tuple, tuple.concat());\n");
        code.append("    }\n");
        code.append("\n");
        for (int i = degree + 1; i <= maxDegree; i++) {
            code.append("    @Test\n");
            code.append("    public void concat_shouldReturnNonNullTuple").append(i).append("Instance_whenCalledWith").append(i - degree).append("Value").append(i - degree > 1 ? "s" : "").append("() {\n");
            code.append("        assertEquals(Tuple").append(i).append(".of").append(stringValues(1, i)).append(", tuple.concat").append(stringValues(degree + 1, i)).append(");\n");
            code.append("    }\n");
            code.append("\n");
        }

        for (int i = degree + 1; i <= maxDegree; i++) {
            code.append("    @Test\n");
            code.append("    public void concat_shouldReturnNonNullTuple").append(i).append("Instance_whenCalledWithTuple").append(i - degree).append("Argument() {\n");
            code.append("        assertEquals(Tuple").append(i).append(".of").append(stringValues(1, i)).append(", tuple.concat(Tuple").append(i - degree).append(".of").append(stringValues(degree + 1, i)).append("));\n");
            code.append("    }\n");
            code.append("\n");
        }
    }
    
    private void generateVxTests() {
        degrees.stream().forEachOrdered(d -> {
            String v = "v" + d;
            code.append("    @Test\n");
            code.append("    public void ").append(v).append("_shouldReturnCorrectValue_whenCalled() {\n");
            code.append("        assertEquals(\"").append(v).append("\", tuple.").append(v).append("());\n");
            code.append("    }\n");
            code.append("\n");
        });
    }

    private void generateDegreeTests() {
        code.append("    @Test\n");
        code.append("    public void degree_shouldReturn").append(degree).append("_whenCalled() {\n");
        code.append("        assertEquals(").append(degree).append(", tuple.degree());\n");
        code.append("    }\n");
        code.append("\n");
    }

    private void generateEqualsTests() {
        code.append("    @Test\n");
        code.append("    public void equals_shouldReturnTrue_whenCalledWithTheSameTuple() {\n");
        code.append("        assertTrue(tuple.equals(tuple));\n");
        code.append("    }\n");
        code.append("\n");
        code.append("    @Test\n");
        code.append("    public void equals_shouldReturnFalse_whenCalledWithNull() {\n");
        code.append("        assertFalse(tuple.equals(null));\n");
        code.append("    }\n");
        code.append("\n");
        code.append("    @Test\n");
        code.append("    public void equals_shouldReturnFalse_whenCalledWithObjectOfAnotherType() {\n");
        code.append("        assertFalse(tuple.equals(\"string\"));\n");
        code.append("    }\n");
        code.append("\n");
        code.append("    @Test\n");
        code.append("    public void equals_shouldReturnTrue_whenCalledWithAnotherTupleWithTheSameContent() {\n");
        code.append("        ").append(testedClass()).append(" other = ").append(testedClass()).append(".of").append(stringValues()).append(";\n");
        code.append("        assertTrue(tuple.equals(other));\n");
        code.append("    }\n");
        code.append("\n");
        if (degree != 0) {
            code.append("    @Test\n");
            code.append("    public void equals_shouldReturnFalse_whenCalledWithAnotherTupleWithDifferentContent() {\n");
            code.append("        ").append(testedClass()).append(" other = ").append(testedClass()).append(".of").append(mixedValues()).append(";\n");
            code.append("        assertFalse(tuple.equals(other));\n");
            code.append("\n");
            code.append("        ").append(testedClass()).append(genericType("Integer")).append(" t = ").append(testedClass()).append(".of").append(repeatValue("0")).append(";\n");
            code.append("\n");
            for (int i = 1; i <= degree; i++) {
                String args = Stream.of(Collections.nCopies(i - 1, "0"), Arrays.asList("1"), Collections.nCopies(degree - i, "0")).flatMap(List::stream).collect(joining(", ", "(", ")"));
                code.append("        ").append(testedClass()).append(genericType("Integer")).append(" t").append(i).append(" = ").append(testedClass()).append(".of").append(args).append(";\n");
                code.append("        assertFalse(t.equals(t").append(i).append("));\n");
                code.append("        assertFalse(t").append(i).append(".equals(t));\n");
                code.append("\n");
            }
            code.append("    }\n");

        }
    }

    private void generateHashCodeTests() {
        code.append("    @Test\n");
        code.append("    public void hashCode_shouldReturnTheSameValue_whenCalledWithTheSameTuple() {\n");
        code.append("        assertEquals(tuple.hashCode(), tuple.hashCode());\n");
        code.append("    }\n");
        code.append("\n");
        code.append("    @Test\n");
        code.append("    public void hashCode_shouldReturnTheSameValue_whenCalledWithAnotherTupleWithTheSameContent() {\n");
        code.append("        ").append(testedClass()).append(" other = ").append(testedClass()).append(".of").append(stringValues()).append(";\n");
        code.append("        assertEquals(tuple.hashCode(), other.hashCode());\n");
        code.append("    }\n");
        code.append("\n");
    }

    private void generateCompareToTests() {
        code.append("    @Test\n");
        code.append("    public void compareTo_shouldReturnZero_whenCalledWithTheSameTuple() {\n");
        code.append("        assertEquals(0, tuple.compareTo(tuple));\n");
        code.append("    }\n");
        code.append("\n");
        code.append("    @Test\n");
        code.append("    public void compareTo_shouldReturnZero_whenCalledWithAnotherTupleWithTheSameContent() {\n");
        code.append("        assertEquals(0, tuple.compareTo(").append(testedClass()).append(".of").append(stringValues()).append("));\n");
        code.append("    }\n");
        code.append("\n");
        code.append("    @Test(expected = NullPointerException.class)\n");
        code.append("    public void compareTo_shouldThrowNullPointerException_whenCalledWithNull() {\n");
        code.append("        tuple.compareTo(null);\n");
        code.append("    }\n");
        code.append("\n");
        if (degree != 0) {
            code.append("    @Test\n");
            code.append("    public void compareTo_shouldReturnZero_whenCalledWithTwoTuplesWithNullContent() {\n");
            code.append("        ").append(testedClass()).append(genericType("String")).append(" t1 = ").append(testedClass()).append(".of").append(repeatValue("null")).append(";\n");
            code.append("        ").append(testedClass()).append(genericType("String")).append(" t2 = ").append(testedClass()).append(".of").append(repeatValue("null")).append(";\n");
            code.append("        assertEquals(0, t1.compareTo(t2));\n");
            code.append("    }\n");
            code.append("\n");
            code.append("    @Test(expected = ClassCastException.class)\n");
            code.append("    public void compareTo_shouldThrowClassCastException_whenCalledWithNonComparableContent() {\n");
            code.append("        ").append(testedClass()).append(genericType("Object")).append(" t1 = ").append(testedClass()).append(".of").append(repeatValue("new Object()")).append(";\n");
            code.append("        ").append(testedClass()).append(genericType("Object")).append(" t2 = ").append(testedClass()).append(".of").append(repeatValue("new Object()")).append(";\n");
            code.append("        t1.compareTo(t2);\n");
            code.append("    }\n");
            code.append("\n");
            code.append("    @Test\n");
            code.append("    public void compareTo_shouldPutNullBefore_whenComparedWithNonNullContent() {\n");
            code.append("        ").append(testedClass()).append(genericType("String")).append(" other = ").append(testedClass()).append(".of").append(repeatValue("null")).append(";\n");
            code.append("        assertTrue(other.compareTo(tuple) < 0);\n");
            code.append("        assertTrue(tuple.compareTo(other) > 0);\n");
            code.append("    }\n");
            code.append("\n");
            code.append("    @Test\n");
            code.append("    public void compareTo_shouldReturnCorrectValue_whenComparingTwoCompatibleTuples() {\n");
            code.append("        ").append(testedClass()).append(genericType("Integer")).append(" t = ").append(testedClass()).append(".of").append(repeatValue("0")).append(";\n");
            code.append("\n");
            for (int i = 1; i <= degree; i++) {
                String args = Stream.of(Collections.nCopies(i - 1, "0"), Arrays.asList("1"), Collections.nCopies(degree - i, "0")).flatMap(List::stream).collect(joining(", ", "(", ")"));
                code.append("        ").append(testedClass()).append(genericType("Integer")).append(" t").append(i).append(" = ").append(testedClass()).append(".of").append(args).append(";\n");
                code.append("        assertTrue(t.compareTo(t").append(i).append(") < 0);\n");
                code.append("        assertTrue(t").append(i).append(".compareTo(t) > 0);\n");
                code.append("\n");
            }
            code.append("    }\n");
            code.append("\n");
        }
    }

}
