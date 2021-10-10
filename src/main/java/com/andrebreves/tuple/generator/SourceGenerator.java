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
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Generates de source code for the Tuple library.
 * @author Andre Breves
 */
public class SourceGenerator {

    public static void main(String[] args) throws Exception {
        String kind = args[0];
        int degrees = Integer.parseInt(args[1]);
        String folder = args[2];

        switch (kind) {
            case "code":
                maybeSaveIn(folder, new TupleInterfaceCodeGenerator(degrees), ClassGenerator.class, TupleInterfaceCodeGenerator.class);
                for (int degree = 0; degree <= degrees; degree++)
                    maybeSaveIn(folder, new TupleClassCodeGenerator(degree, degrees), ClassGenerator.class, TupleClassCodeGenerator.class);
                break;

            case "test":
                maybeSaveIn(folder, new TupleInterfaceTestGenerator(degrees), ClassGenerator.class, TupleInterfaceTestGenerator.class);
                for (int degree = 0; degree <= degrees; degree++)
                    maybeSaveIn(folder, new TupleClassTestGenerator(degree, degrees), ClassGenerator.class, TupleClassTestGenerator.class);
                break;

            default:
                System.out.println("Invalid source kind: \"" + kind + "\"");
                System.out.println("Should be \"code\" or \"test\"");
        }


    }

    private static void maybeSaveIn(String folder, ClassGenerator code, Class... generatorClasses) throws IOException, URISyntaxException {
        File codeFile = Paths.get(folder, code.fullFileName()).toFile();
        boolean generatorChanged = !codeFile.exists();

        // Verify if the generated code is OLDER than the classes used to generate it
        Iterator<Class> generators = Arrays.asList(generatorClasses).iterator();
        while (!generatorChanged && generators.hasNext()) generatorChanged = codeFile.lastModified() < getClassFile(generators.next()).lastModified();

        System.out.printf("%-15s - ", code.fileName());
        if (generatorChanged) {
            System.out.printf("generating %s\n", codeFile);
            code.saveIn(folder);
        } else {
            System.out.printf("no changes detected, skipping code generation\n");
        }
    }

    private static File getClassFile(Class clazz) throws URISyntaxException {
        URI classLocation = clazz.getProtectionDomain().getCodeSource().getLocation().toURI();
        String classFile = clazz.getCanonicalName().replaceAll("\\.", File.separator) + ".class";
        File f = Paths.get(classLocation).resolve(classFile).toFile();
        return f;
    }

}
