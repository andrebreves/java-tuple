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
    public String packageName() { return "com.andrebreves.java.tuple"; }

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
    
}
