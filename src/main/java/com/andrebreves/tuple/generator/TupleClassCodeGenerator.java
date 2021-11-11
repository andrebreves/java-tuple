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
import static com.andrebreves.tuple.generator.ClassGenerator.genericTypes;
import static com.andrebreves.tuple.generator.ClassGenerator.ordinal;
import static com.andrebreves.tuple.generator.ClassGenerator.range;
import static com.andrebreves.tuple.generator.ClassGenerator.rangeClosed;
import static com.andrebreves.tuple.generator.ClassGenerator.to;
import static com.andrebreves.tuple.generator.ClassGenerator.typedArgs;
import static java.util.stream.Collectors.joining;
import java.util.stream.Stream;

/**
 * Generates a Tuple class of a specific degree.
 * @author Andre Breves
 */
public final class TupleClassCodeGenerator implements ClassGenerator {

    private final int degree;
    private final int maxDegree;
    private final StringBuilder code;

    public TupleClassCodeGenerator(int degree, int maxDegree) {
        if (degree < 0) throw new IllegalArgumentException("Invalid degree: " + degree);
        this.degree = degree;
        this.maxDegree = maxDegree;
        code = new StringBuilder();
        generateSourceCode();
    }

    private Stream<Integer> degrees() { return rangeClosed(1, degree); }
    
    @Override
    public String code() { return code.toString(); }

    @Override
    public String packageName() { return "com.andrebreves.tuple"; }

    @Override
    public String className() { return "Tuple" + degree; }

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
        code.append("import java.util.function.Function;\n");
        code.append("\n");
    }
    
    private void generateClass() {
        code.append(generatedNotice(this.getClass()));
        code.append("\n");
        code.append("/**\n");
        code.append(" * A Tuple that has ").append((degree == 0) ? "no" : degree).append(" value").append((degree == 1) ? "" : "s").append(".\n");
        code.append(" * @author Andre Breves\n");
        code.append(" */\n");
        code.append("public final class ").append(className()).append(genericTypes(degree)).append(" implements Tuple, Comparable<").append(className()).append(genericTypes(degree)).append("> {\n");
        code.append("\n");
        generateFields();
        generateConstructors();
        generateMethods();
        code.append("}");
        code.append("\n");
    }
    
    private void generateFields() {
        if (degree == 0) code.append("    private static final Tuple0 INSTANCE = new Tuple0();\n");
        else code.append(degrees().map(to("    private final T%0 v%0;\n")).collect(joining()));
        code.append("\n");
    }
    
    private void generateConstructors() {
        code.append("    private ").append(className()).append(typedArgs(degree)).append(" {\n");
        code.append(degrees().map(to("        this.v%0 = v%0;\n")).collect(joining()));
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateMethods() {
        generateOfMethod();
        generateGetters();
        generateDegreeMethod();
        generateHashCodeMethod();
        generateEqualsMethod();
        generateToStringMethod();
        generateCompareToMethod();
        generateMapMethods();
        generateConsumeValuesMethod();
        generateMapValuesMethod();
        generateTestValuesMethod();
        generateAppendMethod();
        generateConcatMethods();
    }
    
    private void generateOfMethod() {
        code.append("    /** Returns a Tuple that has ").append((degree == 0) ? "no" : degree).append(" value").append((degree == 1) ? "" : "s").append(". */\n");;
        code.append("    public static ").append(genericTypes(degree)).append((degree == 0) ? "" : " ").append(className()).append(genericTypes(degree)).append(" of").append(typedArgs(degree)).append(" {\n");
        if (degree == 0) {
            code.append("        return INSTANCE;\n");
        } else {
            code.append("        return new ").append(className()).append((degree == 0) ? "" : "<>").append(args(degree)).append(";\n");
        }
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateGetters() {
        if (degree == 0) return;
        degrees().forEachOrdered(this::generateGetter);
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
            code.append("        return Objects.hash").append(args(degree)).append(";\n");
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
            code.append("        return ").append(degrees().map(to("Objects.equals(v%0, other.v%0)")).collect(joining("\n            && ", "", ";\n")));
        }
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateToStringMethod() {
        code.append("    @Override\n");
        code.append("    public String toString() {\n");
        if (degree == 0) {
            code.append("        return \"[]\";\n");
        } else {
            code.append("        StringBuilder sb = new StringBuilder().append('[');\n");
            code.append(degrees()
                    .map(to("        sb.append(v%0)"))
                    .collect(joining(".append(',').append(' ');\n", "", ";\n")));
            code.append("        return sb.append(']').toString();\n");
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
        code.append("    public int compareTo(").append(className()).append(genericTypes(degree)).append(" other) {\n");
        code.append("        if (other == null) throw new NullPointerException();\n");
        if (degree > 0) {
            code.append("        int result;\n");
            code.append(degrees().map(to("        result = compare(v%0, other.v%0); if (result != 0) return result;\n")).collect(joining()));
        }
        code.append("        return 0;\n");
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateMapMethods() {
        degrees().forEach(v -> generateMapMethod(v));
    }
    
    private void generateMapMethod(int v) {
        code.append("    /** Returns a Tuple mapping the ").append(ordinal(v)).append(" value using the giving mapper function, and keeping the remaining values unchanged. */\n");
        code.append("    public <R> ")
                .append(className())
                .append(Stream.of(range(1, v).map(to("T%0")), Stream.of("R"), rangeClosed(v + 1, degree).map(to("T%0")))
                        .flatMap(s -> s)
                        .collect(joining(", ", "<", "> ")))
                .append("mapV").append(v).append("(Function<T").append(v).append(", R> mapper) {\n");
        code.append("        return ").append(className()).append(".of(")
                .append(Stream.of(range(1, v).map(to("v%0")), Stream.of("mapper.apply(v" + v + ")"), rangeClosed(v + 1, degree).map(to("v%0")))
                        .flatMap(s -> s)
                        .collect(joining(", ")))
                .append(");\n");
        code.append("    }\n");        
        code.append("\n");
    }

    private void generateConsumeValuesMethod() {
        // TODO: Javadoc
        code.append("    @FunctionalInterface\n");
        code.append("    public interface ValuesConsumer").append(genericTypes(degree)).append(" {\n");
        code.append("        void accept").append(typedArgs(degree)).append(";\n");
        code.append("    }\n");
        code.append("\n");
        code.append("    /** Consumes the values of this Tuple using the giving Consumer. */\n");
        code.append("    public void consumeValues(ValuesConsumer").append(genericTypes(degree)).append(" consumer) {\n");
        code.append("        consumer.accept").append(args(degree)).append(";\n");
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateMapValuesMethod() {
        // TODO: Javadoc
        code.append("    @FunctionalInterface\n");
        code.append("    public interface ValuesFunction<")
                .append(degree > 0 ? degrees().map(to("T%0")).collect(joining(", ", "", ", ")) : "")
                .append("R> {\n");
        code.append("        R apply").append(typedArgs(degree)).append(";\n");
        code.append("    }\n");
        code.append("\n");
        code.append("    /** Maps the values of this Tuple using the giving Function. */\n");
        code.append("    public <R> R mapValues(ValuesFunction<")
                .append(degree > 0 ? degrees().map(to("T%0")).collect(joining(", ", "", ", ")) : "")
                .append("R> function) {\n");
        code.append("        return function.apply").append(args(degree)).append(";\n");
        code.append("    }\n");
        code.append("\n");
    }
        
    private void generateTestValuesMethod() {
        // TODO: Javadoc
        code.append("    @FunctionalInterface\n");
        code.append("    public interface ValuesPredicate").append(genericTypes(degree)).append(" {\n");
        code.append("        boolean test").append(typedArgs(degree)).append(";\n");
        code.append("    }\n");
        code.append("\n");
        code.append("    /** Test the values of this Tuple using the giving Predicate. */\n");
        code.append("    public boolean testValues(ValuesPredicate").append(genericTypes(degree)).append(" predicate) {\n");
        code.append("        return predicate.test").append(args(degree)).append(";\n");
        code.append("    }\n");
        code.append("\n");
    }
    
    private void generateAppendMethod() {
        if (degree == maxDegree) return;
        int nextDegree = degree + 1;
        code.append("    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */\n");
        code.append("    public ")
                .append(rangeClosed(degree + 1, nextDegree).map(to("T%0")).collect(joining(", ", "<", "> ")))
                .append("Tuple").append(nextDegree)
                .append(rangeClosed(1, nextDegree).map(to("T%0")).collect(joining(", ", "<", ">")));
        code.append(" append").append(rangeClosed(degree + 1, nextDegree).map(to("T%0 v%0")).collect(joining(", ", "(", ")"))).append(" {\n");
        code.append("        return Tuple").append(nextDegree).append(".of").append(rangeClosed(1, nextDegree).map(to("v%0")).collect(joining(", ", "(", ")"))).append(";\n");
        code.append("    }\n");
        code.append("\n");
    }

    private void generateConcatMethods() {
        rangeClosed(degree, maxDegree).forEachOrdered(i -> generateConcatMethod(i));
    }

    private void generateConcatMethod(int lastDegree) {
        code.append("    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */\n");
        code.append("    public ")
                .append(lastDegree <= degree ? "" : rangeClosed(degree + 1, lastDegree).map(to("T%0")).collect(joining(", ", "<", "> ")))
                .append("Tuple").append(lastDegree)
                .append(lastDegree == 0 ? "" : rangeClosed(1, lastDegree).map(to("T%0")).collect(joining(", ", "<", ">")));
        code.append(" concat(Tuple").append(lastDegree - degree)
                .append(lastDegree == degree ? "" : rangeClosed(degree + 1, lastDegree).map(to("T%0")).collect(joining(", ", "<", ">"))).append(" t) {\n");
        if (lastDegree == degree) code.append("        return this;\n");
        else code.append("        return Tuple").append(lastDegree).append(".of(")
                .append(degree == 0 ? "" : rangeClosed(1, degree).map(to("v%0")).collect(joining(", ", "", ", ")))
                .append(rangeClosed(1, lastDegree - degree).map(to("t.v%0()")).collect(joining(", ", "", "")))
                .append(");\n");
        code.append("    }\n");
        code.append("\n");
    }

}
