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

import java.util.function.Function;
import static java.util.stream.Collectors.joining;
import java.util.stream.IntStream;

/**
 * Generates the Tuple interface.
 * @author Andre Breves
 */
public final class TupleInterfaceCodeGenerator implements ClassGenerator {
    
    private final int maxDegree;
    private final StringBuilder code;

    public TupleInterfaceCodeGenerator(int maxDegree) {
        if (maxDegree < 0) throw new IllegalArgumentException("Invalid degree: " + maxDegree);
        this.maxDegree = maxDegree;
        code = new StringBuilder();
        generateSourceCode();
    }
    
    @Override
    public String code() { return code.toString(); }

    @Override
    public String packageName() { return "com.andrebreves.tuple"; }

    @Override
    public String className() { return "Tuple"; }

    private static <T> Function<T, String> to(String format, Object... args) {
        return t -> String.format(format.replaceAll("%0", t.toString()), args);
    }

    private static String ordinal(int cardinal) {
        switch (cardinal) {
            case 1 : return cardinal + "st";
            case 2 : return cardinal + "nd";
            case 3 : return cardinal + "rd";
            default: return cardinal + "th";
        }
    }

    private String genericTypes(int degree) {
        if (degree == 0) return "";
        else return IntStream.rangeClosed(1, degree).boxed().map(to("T%0")).collect(joining(", ", "<", ">"));
    }
    
    private String genericTypes(int degree, int showDegree) {
        if (degree == 0) return "";
        else return IntStream.rangeClosed(1, degree).boxed().map(d -> (d == showDegree) ? to("T%0").apply(d) : "?").collect(joining(", ", "<", ">"));
    }

    private String args(int degree) {
        return IntStream.rangeClosed(1, degree).boxed().map(to("v%0")).collect(joining(", ", "(", ")"));
    }
    
    private String typedArgs(int degree) {
        return IntStream.rangeClosed(1, degree).boxed().map(to("T%0 v%0")).collect(joining(", ", "(", ")"));
    }
    
    private String className(int degree) {
        return "Tuple" + degree;
    }
    
    private String typedClass(int degree) {
        return genericTypes(degree)
                + ((degree == 0) ? "" : " ")
                + className(degree)
                + genericTypes(degree);
    }

    private void generateSourceCode() {
        code.append(license());
        generatePackage();
        generateImports();
        generateInterface();
    }
    
    private void generatePackage() {
        code.append("package ").append(packageName()).append(";\n");
        code.append("\n");
    }
    
    private void generateImports() {
        code.append("import java.util.function.Consumer;\n");
        code.append("import java.util.function.Function;\n");
        code.append("import java.util.function.Predicate;\n");
        code.append("\n");
    }

    private void generateInterface() {
        code.append("/**\n");
        code.append(" * A Tuple that has up to ").append(maxDegree).append(" value").append((maxDegree == 1) ? "" : "s").append(".\n");
        code.append(" * @author Andre Breves\n");
        code.append(" */\n");
        code.append("public interface Tuple {\n");
        code.append("\n");
        generateAbstractMethods();
        generateStaticMethods();
        code.append("}");
        code.append("\n");
    }

    private void generateAbstractMethods() {
        code.append("    /** Returns the value count of this Tuple. */\n");
        code.append("    int degree();\n");
        code.append("\n");
    }

    private void generateStaticMethods() {
        IntStream.rangeClosed(0, maxDegree).boxed().forEachOrdered(i -> generateOfMethod(i));
        IntStream.rangeClosed(1, maxDegree).boxed().forEachOrdered(i -> generateVMethods(i));
        IntStream.rangeClosed(0, maxDegree).boxed().forEachOrdered(i -> generateConsumeValuesMethod(i));
        IntStream.rangeClosed(0, maxDegree).boxed().forEachOrdered(i -> generateMapValuesMethod(i));
        IntStream.rangeClosed(0, maxDegree).boxed().forEachOrdered(i -> generateTestValuesMethod(i));
    }
    
    private void generateOfMethod(int degree) {
        code.append("    /** Returns a Tuple that has ").append((degree == 0) ? "no" : degree).append(" value").append((degree == 1) ? "" : "s").append(". */\n");
        code.append("    static ").append(typedClass(degree)).append(" of").append(typedArgs(degree)).append(" {\n");
        code.append("        return ").append(className(degree)).append(".of").append(args(degree)).append(";\n");
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateVMethods(int degree) {
        IntStream.rangeClosed(1, degree).boxed().forEachOrdered(i -> generateVMethod(i, degree));
        code.append("\n");
    }
    
    private void generateVMethod(int v, int degree) {
        code.append("    /** Returns the ").append(ordinal(v)).append(" value of the Tuple. */\n");
        code.append("    static <T").append(v).append("> T").append(v).append(" v").append(v).append("(").append(className(degree)).append(genericTypes(degree, v)).append(" tuple) { ");
        code.append("return tuple.v").append(v).append("(); ");
        code.append("}\n");
    }
    
    private void generateConsumeValuesMethod(int degree) {
        code.append("    /** Consumes the values of the Tuple using the giving Consumer. */\n");
        code.append("    static ")
                .append(genericTypes(degree))
                .append(degree == 0 ? "" : " ")
                .append("Consumer<")
                .append(className(degree))
                .append(genericTypes(degree))
                .append("> consumeValues(")
                .append(className(degree))
                .append(".ValuesConsumer")
                .append(genericTypes(degree))
                .append(" consumer) {\n");
        code.append("        return tuple -> tuple.consumeValues(consumer);\n");
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateMapValuesMethod(int degree) {
        code.append("    /** Maps the values of the Tuple using the giving Function. */\n");
        code.append("    static <")
                .append(degree > 0 ? IntStream.rangeClosed(1, degree).boxed().map(to("T%0")).collect(joining(", ", "", ", ")) : "")
                .append("R> Function<")
                .append(className(degree))
                .append(genericTypes(degree))
                .append(", R> mapValues(")
                .append(className(degree))
                .append(".ValuesFunction<")
                .append(degree > 0 ? IntStream.rangeClosed(1, degree).boxed().map(to("T%0")).collect(joining(", ", "", ", ")) : "")
                .append("R> function) {\n");
        code.append("        return tuple -> tuple.mapValues(function);\n");
        code.append("    }\n");
        code.append("\n");
    }

    private void generateTestValuesMethod(int degree) {
        code.append("    /** Test the values of the Tuple using the giving Predicate. */\n");
        code.append("    static ")
                .append(genericTypes(degree))
                .append(degree == 0 ? "" : " ")
                .append("Predicate<")
                .append(className(degree))
                .append(genericTypes(degree))
                .append("> testValues(")
                .append(className(degree))
                .append(".ValuesPredicate")
                .append(genericTypes(degree))
                .append(" predicate) {\n");
        code.append("        return tuple -> tuple.testValues(predicate);\n");
        code.append("    }\n");
        code.append("\n");
    }
    
}
