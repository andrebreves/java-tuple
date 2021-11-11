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
package com.andrebreves.tuple.generator;

import static com.andrebreves.tuple.generator.ClassGenerator.args;
import static com.andrebreves.tuple.generator.ClassGenerator.range;
import static com.andrebreves.tuple.generator.ClassGenerator.rangeClosed;
import static com.andrebreves.tuple.generator.ClassGenerator.to;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static java.util.stream.Collectors.joining;
import java.util.stream.Stream;

/**
 * Generates unit tests for the Tuple classes.
 * @author Andre Breves
 */
public class TupleClassTestGenerator implements ClassGenerator {

    private final int degree;
    private final int maxDegree;
    private final StringBuilder code;

    public TupleClassTestGenerator(int degree, int maxDegree) {
        if (degree < 0) throw new IllegalArgumentException("Invalid degree: " + degree);
        this.degree = degree;
        this.maxDegree = maxDegree;
        code = new StringBuilder();
        generateSourceCode();
    }

    private Stream<Integer> degrees() { return rangeClosed(1, degree); }

    @Override
    public String code() {
        return code.toString();
    }

    @Override
    public String packageName() { return "com.andrebreves.tuple"; }

    @Override
    public String className() { return testedClass() + "Test"; }

    private String testedClass() { return "Tuple" + degree; }

    private String stringValues() { return degrees().map(to("\"v%0\"")).collect(joining(", ", "(", ")")); }
    private String intValues() { return degrees().map(to("%0")).collect(joining(", ", "(", ")")); }
    private String repeatValue(String value) { return degrees().map(to(value)).collect(joining(", ", "(", ")")); }

    private String mixedValues() {
        return degrees().map(degree -> {
            switch (degree % 3) {
                case 0: return "\"v" + degree + "\"";
                case 1: return String.valueOf(degree);
                default: return "null";
            }
        }).collect(joining(", ", "(", ")"));
    }

    private String genericType(String type) {
        if (degree == 0) return "";
        return rangeClosed(1, degree).map(to(type)).collect(joining(", ", "<", ">"));
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
        code.append("import nl.jqno.equalsverifier.EqualsVerifier;\n");
        code.append("import org.junit.*;\n");
        code.append("import static org.junit.Assert.*;\n");
        code.append("\n");
    }

    private void generateClass() {
        code.append(generatedNotice(this.getClass()));
        code.append("\n");
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
        generateVxTests();
        generateEqualsTests();
        generateHashCodeTests();
        generateCompareToTests();
        generateToStringTests();
        generateMapVxTests();
        generateAppendTests();
        generateConcatTests();
        generateTestValuesTests();
        generateMapValuesTests();
        generateConsumeValuesTests();
    }

    private void generateTestValuesTests() {
        code.append("    @Test\n");
        code.append("    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicate() {\n");
        code.append("        assertTrue(tuple.testValues(").append(args(degree)).append(" -> true")
                .append(degrees().map(to(" && \"v%0\".equals(v%0)")).collect(joining()))
                .append("));\n");
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateMapValuesTests() {
        code.append("    @Test\n");
        code.append("    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunction() {\n");
        code.append("        assertEquals(\"test").append(degrees().map(to("v%0")).collect(joining())).append("\", tuple.mapValues(")
                .append(args(degree)).append(" -> \"test\"")
                .append(degrees().map(to(" + v%0")).collect(joining()))
                .append("));\n");        
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateConsumeValuesTests() {
        code.append("    @Test\n");
        code.append("    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumer() {\n");
        code.append("        final StringBuilder s = new StringBuilder();\n");
        code.append("        tuple.consumeValues(").append(args(degree)).append(" -> s.append(\"test\")").append(degrees().map(to(".append(v%0)")).collect(joining())).append(");\n");
        code.append("        assertEquals(s.toString(), \"test").append(degrees().map(to("v%0")).collect(joining())).append("\");\n");
        code.append("    }\n");
        code.append("\n");
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

    private String stringValues(int start, int end) { return rangeClosed(start, end).map(to("\"v%0\"")).collect(joining(", ", "(", ")")); }

    private void generateToStringTests() {
        code.append("    @Test\n");
        code.append("    public void toString_shouldReturnCorrectValue_whenCalled() {\n");
        code.append("        assertEquals(\"").append(
                rangeClosed(1, degree).map(to("v%0")).collect(joining(", ", "[", "]")))
                .append("\", tuple.toString());\n");
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateAppendTests() {
        if (degree == maxDegree) return;
        code.append("    @Test\n");
        code.append("    public void append_shouldReturnNonNullTuple").append(degree + 1).append("Instance_whenCalledWithArgument").append("() {\n");
        code.append("        assertEquals(Tuple").append(degree + 1).append(".of").append(stringValues(1, degree + 1)).append(", tuple.append").append(stringValues(degree + 1, degree + 1)).append(");\n");
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateConcatTests() {
        code.append("    @Test\n");
        code.append("    public void concat_shouldReturnEqualTuple").append(degree).append("_whenCalledWithTuple0Argument() {\n");
        code.append("        assertEquals(tuple, tuple.concat(Tuple0.of()));\n");
        code.append("    }\n");
        code.append("\n");
        for (int i = degree + 1; i <= maxDegree; i++) {
            code.append("    @Test\n");
            code.append("    public void concat_shouldReturnNonNullTuple").append(i).append("Instance_whenCalledWithTuple").append(i - degree).append("Argument() {\n");
            code.append("        assertEquals(Tuple").append(i).append(".of").append(stringValues(1, i)).append(", tuple.concat(Tuple").append(i - degree).append(".of").append(stringValues(degree + 1, i)).append("));\n");
            code.append("    }\n");
            code.append("\n");
        }
    }
    
    private void generateMapVxTests() {
        degrees().forEachOrdered(d -> {
            code.append("    @Test\n");
            code.append("    public void mapV").append(d).append("_shouldReturnCorrectValue_whenCalled() {\n");
            code.append("        assertEquals(").append(testedClass()).append(".of").append(Stream.of(
                    range(1, d).map(to("\"v%0\"")),
                    Stream.of("\"v" + d + "M\""),
                    rangeClosed(d + 1, degree).map(to("\"v%0\"")))
                    .flatMap(s -> s)
                    .collect(joining(", ", "(", ")")))
                    .append(", tuple.mapV").append(d).append("(v -> v + \"M\"));\n");
            code.append("    }\n");
            code.append("\n");
        });
    }

    private void generateVxTests() {
        degrees().forEachOrdered(d -> {
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
        code.append("    public void equals_shouldFollowContract() {\n");
        code.append("        EqualsVerifier.forClass(").append(testedClass()).append(".class).verify();\n");
        code.append("    }\n");
        code.append("\n");
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
            code.append("\n");
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
