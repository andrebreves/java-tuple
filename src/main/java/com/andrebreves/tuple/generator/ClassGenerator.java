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

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Function;
import static java.util.stream.Collectors.joining;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface ClassGenerator {

    /**
     * Returns the License of the library in javadoc format.
     * @return the License javadoc
     */
    default String license() {
        StringBuilder code = new StringBuilder();
        code.append("/**\n");
        code.append(" * Licensed under the Apache License, Version 2.0 (the \"License\");\n");
        code.append(" * you may not use this file except in compliance with the License.\n");
        code.append(" * You may obtain a copy of the License at\n");
        code.append(" *\n");
        code.append(" *     http://www.apache.org/licenses/LICENSE-2.0\n");
        code.append(" *\n");
        code.append(" * Unless required by applicable law or agreed to in writing, software\n");
        code.append(" * distributed under the License is distributed on an \"AS IS\" BASIS,\n");
        code.append(" * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n");
        code.append(" * See the License for the specific language governing permissions and\n");
        code.append(" * limitations under the License.\n");
        code.append(" */\n");
        return code.toString();
    }

    default String generatedNotice(Class<?> generator) {
        StringBuilder code = new StringBuilder();
        code.append("/* * * * * DO NOT MODIFY THIS FILE * * * *\n");
        code.append(" * This source code is auto-generated").append(generator == null ? "" : (" by " + generator.getCanonicalName())).append("\n");
        code.append(" * Changes will be overwritten in the compilation process\n");
        code.append(" */\n");
        return code.toString();
    }

    /**
     * Returns the package className.
     * @return the package className
     */
    String packageName();

    /**
     * Returns the class className.
     * @return the class className
     */
    String className();

    /**
     * Returns the source code text of the class.
     * @return the source code text of the class
     */
    String code();

    /**
     * Returns the source file className.
     * @return the source file className
     */
    default String fileName() { return className() + ".java"; }

    /**
     * Returns de fully qualified file className, considering the package folder.
     * @return the fully qualified file className
     */
    default String fullFileName() { return packageName().replaceAll("\\.", File.separator) + File.separator + fileName(); }

    /**
     * Saves the source code.
     * @param folder the folder path to save into
     * @return the {@code java.nio.file.Path} object of the saved file
     * @throws IOException
     */
    default Path saveIn(String folder) throws IOException {
        Path path = Paths.get(folder, fullFileName());
        Files.createDirectories(path.getParent());
        return Files.write(path, code().getBytes(StandardCharsets.UTF_8));
    };

    // Utility Methods
    
    static Stream<Integer> range(int start, int end) {
        return IntStream.range(start, end).boxed();
    }

    static Stream<Integer> rangeClosed(int start, int end) {
        return IntStream.rangeClosed(start, end).boxed();
    }
    
    static <T> Function<T, String> to(String format, Object... args) {
        return t -> String.format(format.replaceAll("%0", t.toString()), args);
    }

    static String ordinal(int cardinal) {
        switch (cardinal) {
            case 1 : return cardinal + "st";
            case 2 : return cardinal + "nd";
            case 3 : return cardinal + "rd";
            default: return cardinal + "th";
        }
    }

    static String args(int degree) {
        return IntStream.rangeClosed(1, degree).boxed().map(to("v%0")).collect(joining(", ", "(", ")"));
    }

    static String typedArgs(int degree) {
        return IntStream.rangeClosed(1, degree).boxed().map(to("T%0 v%0")).collect(joining(", ", "(", ")"));
    }

    static String genericTypes(int degree) {
        if (degree == 0) return "";
        else return IntStream.rangeClosed(1, degree).boxed().map(to("T%0")).collect(joining(", ", "<", ">"));
    }
    
    static String genericTypes(int degree, int showDegree) {
        if (degree == 0) return "";
        else return IntStream.rangeClosed(1, degree).boxed().map(d -> (d == showDegree) ? to("T%0").apply(d) : "?").collect(joining(", ", "<", ">"));
    }

}
