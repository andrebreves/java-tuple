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

import java.util.List;
import java.util.function.Function;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

/**
 * Generates a Tuple class of a specific degree.
 * @author Andre Breves
 */
public final class TupleClassCodeGenerator implements ClassGenerator {

    private final int degree;
    private final int maxDegree;
    private final List<Integer> degrees;
    private final StringBuilder code;

    public TupleClassCodeGenerator(int degree, int maxDegree) {
        if (degree < 0) throw new IllegalArgumentException("Invalid degree: " + degree);
        this.degree = degree;
        this.maxDegree = maxDegree;
        this.degrees = IntStream.rangeClosed(1, degree).boxed().collect(toList());
        code = new StringBuilder();
        generateSourceCode();
    }

    @Override
    public String code() { return code.toString(); }

    @Override
    public String packageName() { return "com.andrebreves.tuple"; }

    @Override
    public String className() { return "Tuple" + degree; }

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

    private String genericTypes() {
        if (degree == 0) return "";
        else return degrees.stream().map(to("T%0")).collect(joining(", ", "<", ">"));
    }
    
    private String args() {
        return degrees.stream().map(to("v%0")).collect(joining(", ", "(", ")"));
    }
    private String typedArgs() {
        return degrees.stream().map(to("T%0 v%0")).collect(joining(", ", "(", ")"));
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
        if (degree == 0) return;
        code.append("import java.util.Objects;\n");
        code.append("\n");
    }
    
    private void generateClass() {
        code.append("/**\n");
        code.append(" * A Tuple that has ").append((degree == 0) ? "no" : degree).append(" value").append((degree == 1) ? "" : "s").append(".\n");
        code.append(" * @author Andre Breves\n");
        code.append(" */\n");
        code.append("public final class ").append(className()).append(genericTypes()).append(" implements Tuple, Comparable<").append(className()).append(genericTypes()).append("> {\n");
        code.append("\n");
        generateFields();
        generateConstructors();
        generateMethods();
        code.append("}");
        code.append("\n");
    }
    
    private void generateFields() {
        if (degree == 0) code.append("    private static final Tuple0 INSTANCE = new Tuple0();\n");
        else code.append(degrees.stream().map(to("    private final T%0 v%0;\n")).collect(joining()));
        code.append("\n");
    }
    
    private void generateConstructors() {
        code.append("    private ").append(className()).append(typedArgs()).append(" {\n");
        code.append(degrees.stream().map(to("        this.v%0 = v%0;\n")).collect(joining()));
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateMethods() {
        generateOfMethod();
        generateConcatMethods();
        generateGetters();
        generateDegreeMethod();
        generateHashCodeMethod();
        generateEqualsMethod();
        generateCompareToMethod();
    }
    
    private void generateOfMethod() {
        code.append("    /** Returns a Tuple that has ").append((degree == 0) ? "no" : degree).append(" value").append((degree == 1) ? "" : "s").append(". */\n");;
        code.append("    public static ").append(genericTypes()).append((degree == 0) ? "" : " ").append(className()).append(genericTypes()).append(" of").append(typedArgs()).append(" {\n");
        if (degree == 0) {
            code.append("        return INSTANCE;\n");
        } else {
            code.append("        return new ").append(className()).append((degree == 0) ? "" : "<>").append(args()).append(";\n");
        }
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateConcatMethods() {
        IntStream.rangeClosed(degree, maxDegree).forEachOrdered(i -> generateConcatValuesMethod(i));
        IntStream.rangeClosed(degree + 1, maxDegree).forEachOrdered(i -> generateConcatTupleMethod(i));
    }
    
    private static List<Integer> range(int start, int end) { return IntStream.rangeClosed(start, end).boxed().collect(toList()); }
    
    private static <T> CharSequence format(List<T> list, Function<? super T,? extends CharSequence> mapper, CharSequence delimiter, CharSequence prefix, CharSequence suffix) {
        if (list.isEmpty()) return "";
        else return list.stream().map(mapper).collect(joining(delimiter, prefix, suffix));
    }
    
    private void generateConcatValuesMethod(int lastDegree) {
        code.append("    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */\n");
        code.append("    public ").append(format(range(degree + 1, lastDegree), to("T%0"), ", ", "<", "> ")).append("Tuple").append(lastDegree).append(format(range(1, lastDegree), to("T%0"), ", ", "<", ">"));
        code.append(" concat").append(range(degree + 1, lastDegree).stream().map(to("T%0 v%0")).collect(joining(", ", "(", ")"))).append(" {\n");
        if (lastDegree == degree) code.append("        return this;\n");
        else code.append("        return Tuple").append(lastDegree).append(".of").append(range(1, lastDegree).stream().map(to("v%0")).collect(joining(", ", "(", ")"))).append(";\n");
        code.append("    }\n");
        code.append("\n");
    }

    private void generateConcatTupleMethod(int lastDegree) {
        code.append("    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */\n");
        code.append("    public ").append(format(range(degree + 1, lastDegree), to("T%0"), ", ", "<", "> ")).append("Tuple").append(lastDegree).append(format(range(1, lastDegree), to("T%0"), ", ", "<", ">"));
        code.append(" concat(Tuple").append(lastDegree - degree).append(range(degree + 1, lastDegree).stream().map(to("T%0")).collect(joining(", ", "<", ">"))).append(" t) {\n");
        code.append("        return Tuple").append(lastDegree).append(".of(");
        code.append(format(range(1, degree), to("v%0"), ", ", "", ", "));
        code.append(format(range(1, lastDegree - degree), to("t.v%0()"), ", ", "", ""));
        code.append(");\n");
        code.append("    }\n");
        code.append("\n");
    }

    private void generateGetters() {
        if (degree == 0) return;
        degrees.stream().forEachOrdered(this::generateGetter);
        code.append("\n");
    }

    private void generateGetter(int v) {
        code.append("    /** Returns the ").append(ordinal(v)).append(" value of this Tuple. */\n");
        code.append("    public T").append(v).append(" v").append(v).append("() { return v").append(v).append("; }\n");
    }
    
    private void generateDegreeMethod() {
        code.append("    @Override\n");
        code.append("    public int degree() { return ").append(degree).append("; }\n");
        code.append("\n");
    }
    
    private void generateHashCodeMethod() {
        code.append("    @Override\n");
        code.append("    public int hashCode() {\n");
        if (degree == 0) {
            code.append("        return 0;\n");
        } else {
            code.append("        return Objects.hash").append(args()).append(";\n");
        }
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateEqualsMethod() {
        code.append("    @Override\n");
        code.append("    public boolean equals(Object obj) {\n");
        code.append("        if (this == obj) return true;\n");
        code.append("        if (obj == null || getClass() != obj.getClass()) return false;\n");
        code.append("\n");
        if (degree == 0) {
            code.append("        return true;\n");
        } else {
            code.append("        final ").append(className()).append(" other = (").append(className()).append(") obj;\n");
            code.append("        return ").append(degrees.stream().map(to("Objects.equals(v%0, other.v%0)")).collect(joining("\n            && ", "", ";\n")));
        }
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateCompareStaticMethod() {
        code.append("    @SuppressWarnings(\"unchecked\")\n");
        code.append("    private static <T> int compare(T t1, T t2) {\n");
        code.append("        if (t1 == t2) return 0;\n");
        code.append("        if (t1 == null) return -1;\n");
        code.append("        if (t2 == null) return 1;\n");
        code.append("        return ((Comparable<T>) t1).compareTo(t2);\n");
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateCompareToMethod() {
        if (degree > 0) generateCompareStaticMethod();
        code.append("    @Override\n");
        code.append("    public int compareTo(").append(className()).append(genericTypes()).append(" other) {\n");
        code.append("        if (other == null) throw new NullPointerException();\n");
        if (degree > 0) {
            code.append("        int result;\n");
            code.append(degrees.stream().map(to("        result = compare(v%0, other.v%0); if (result != 0) return result;\n")).collect(joining()));
        }
        code.append("        return 0;\n");
        code.append("    }\n");
        code.append("\n");
    }
    
}
