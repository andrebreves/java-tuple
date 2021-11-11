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
import static com.andrebreves.tuple.generator.ClassGenerator.rangeClosed;
import static com.andrebreves.tuple.generator.ClassGenerator.to;
import static java.util.stream.Collectors.joining;
import java.util.stream.Stream;

/**
 * Generates unit tests for the Tuple interface.
 * @author Andre Breves
 */
public class TupleInterfaceTestGenerator implements ClassGenerator {

    private final int maxDegree;
    private final StringBuilder code;

    public TupleInterfaceTestGenerator(int maxDegree) {
        this.maxDegree = maxDegree;
        this.code = new StringBuilder();
        generateSourceCode();
    }

    private static Stream<Integer> degrees(int degree) {
        return rangeClosed(1, degree);
    }
    
    @Override
    public String code() {
        return code.toString();
    }

    @Override
    public String packageName() { return "com.andrebreves.tuple"; }

    @Override
    public String className() { return "TupleTest"; }

    private String genericType(int degree, String type) {
        if (degree == 0) return "";
        return rangeClosed(1, degree).map(to(type)).collect(joining(", ", "<", ">"));
    }

    private String stringValues(int degree) {
        return rangeClosed(1, degree).map(to("\"v%0\"")).collect(joining(", ", "(", ")"));
    }

    private String fullStringValues(int degree) {
        return rangeClosed(1, degree).map(to("\"t%d.v%0\"", degree)).collect(joining(", ", "(", ")"));
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
        code.append(generatedNotice(this.getClass()));
        code.append("\n");
        code.append("public class ").append(className()).append(" {\n");
        code.append("\n");
        generateTests();
        code.append("}\n");
    }

    private void generateTests() {
        generateOfTests();
        generateVxTests();
        generateTestValuesTests();
        generateMapValuesTests();
        generateConsumeValuesTests();
    }

    private void generateTestValuesTests() {
        rangeClosed(0, maxDegree).forEachOrdered(degree -> {
            code.append("    @Test\n");
            code.append("    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple").append(degree).append("() {\n");
            code.append("        assertTrue(Tuple.testValues(").append(args(degree)).append(" -> true")
                    .append(degrees(degree).map(to(" && \"v%0\".equals(v%0)")).collect(joining()))
                    .append(").test(Tuple.of").append(stringValues(degree)).append("));\n");
            code.append("        assertFalse(Tuple.testValues(").append(args(degree)).append(" -> false")
                    .append(degrees(degree).map(to(" || \"x%0\".equals(v%0)")).collect(joining()))
                    .append(").test(Tuple.of").append(stringValues(degree)).append("));\n");
            code.append("    }\n");
            code.append("\n");
        });
    }
    
    private void generateMapValuesTests() {
        rangeClosed(0, maxDegree).forEachOrdered(degree -> {
            code.append("    @Test\n");
            code.append("    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple").append(degree).append("() {\n");
            code.append("        assertEquals(\"test").append(degrees(degree).map(to("v%0")).collect(joining())).append("\", Tuple.mapValues(")
                    .append(args(degree)).append(" -> \"test\"")
                    .append(degrees(degree).map(to(" + v%0")).collect(joining()))
                    .append(").apply(Tuple.of").append(stringValues(degree)).append("));\n");
            code.append("    }\n");
            code.append("\n");
        });
    }
    
    private void generateConsumeValuesTests() {
        rangeClosed(0, maxDegree).forEachOrdered(degree -> {
            code.append("    @Test\n");
            code.append("    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple").append(degree).append("() {\n");
            code.append("        final StringBuilder s = new StringBuilder();\n");
            code.append("        Tuple.consumeValues(").append(args(degree)).append(" -> s.append(\"test\")").append(degrees(degree).map(to(".append(v%0)")).collect(joining()))
                    .append(").accept(Tuple.of").append(stringValues(degree)).append(");\n");
            code.append("        assertEquals(s.toString(), \"test").append(degrees(degree).map(to("v%0")).collect(joining())).append("\");\n");
            code.append("    }\n");
            code.append("\n");
        });
    }
    
    private void generateOfTests() {
        rangeClosed(0, maxDegree).forEachOrdered(degree -> {
            code.append("    @Test\n");
            code.append("    public void of_shouldReturnNonNullTuple").append(degree).append("Instance_whenCalledWith").append(degree == 0 ? "No" : String.valueOf(degree)).append("Argument").append(degree == 1 ? "" : "s").append("() {\n");
            code.append("        assertEquals(Tuple").append(degree).append(".class, Tuple.of").append(stringValues(degree)).append(".getClass());\n");
            code.append("    }\n");
            code.append("\n");
        });
    }

    private void generateVxTests() {
        rangeClosed(1, maxDegree).forEachOrdered(this::generateVxTest);
    }

    private void generateVxTest(int degree) {
        rangeClosed(1, degree).forEachOrdered(value -> {
            code.append("    @Test\n");
            code.append("    public void v").append(value).append("_shouldReturnCorrectValue_whenCalledWithTuple").append(degree).append("() {\n");
            code.append("        assertEquals(\"v").append(value).append("\", Tuple.v").append(value).append("(Tuple.of").append(stringValues(degree)).append("));\n");
            code.append("    }\n");
            code.append("\n");
        });
    }

}
