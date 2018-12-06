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
package com.andrebreves.java.tuple;

import java.util.function.Function;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

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

    @Override
    public String code() {
        return code.toString();
    }

    @Override
    public String packageName() { return "com.andrebreves.java.tuple"; }

    @Override
    public String className() { return "TupleTest"; }

    private static <T> Function<T, String> to(String format, Object... args) {
        return t -> String.format(format.replaceAll("%0", t.toString()), args);
    }

    private String genericType(int degree, String type) {
        if (degree == 0) return "";
        return IntStream.rangeClosed(1, degree).boxed().map(to(type)).collect(joining(", ", "<", ">"));
    }

    private String stringValues(int degree) {
        return IntStream.rangeClosed(1, degree).boxed().map(to("\"v%0\"")).collect(joining(", ", "(", ")"));
    }

    private String fullStringValues(int degree) {
        return IntStream.rangeClosed(1, degree).boxed().map(to("\"t%d.v%0\"", degree)).collect(joining(", ", "(", ")"));
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
        generateTests();
        code.append("}\n");
    }

    private void generateTests() {
        generateOfTests();
        generateVxTests();
    }

    private void generateOfTests() {
        IntStream.rangeClosed(0, maxDegree).boxed().forEachOrdered(degree -> {
            code.append("    @Test\n");
            code.append("    public void of_shouldReturnNonNullTuple").append(degree).append("Instance_whenCalledWith").append(degree == 0 ? "No" : String.valueOf(degree)).append("Argument").append(degree == 1 ? "" : "s").append("() {\n");
            code.append("        assertEquals(Tuple").append(degree).append(".class, Tuple.of").append(stringValues(degree)).append(".getClass());\n");
            code.append("    }\n");
            code.append("\n");
        });
    }

    private void generateVxTests() {
        IntStream.rangeClosed(1, maxDegree).boxed().forEachOrdered(this::generateVxTest);
    }

    private void generateVxTest(int degree) {
        IntStream.rangeClosed(1, degree).boxed().forEachOrdered(value -> {
            code.append("    @Test\n");
            code.append("    public void v").append(value).append("_shouldReturnCorrectValue_whenCalledWithTuple").append(degree).append("() {\n");
            code.append("        assertEquals(\"v").append(value).append("\", Tuple.of").append(stringValues(degree)).append(".v").append(value).append("());\n");
            code.append("    }\n");
            code.append("\n");
        });
    }

}
