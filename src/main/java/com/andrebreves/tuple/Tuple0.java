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

/**
 * A Tuple that has no values.
 * @author Andre Breves
 */
public final class Tuple0 implements Tuple, Comparable<Tuple0> {

    private Tuple0() { 
    }

    /** Returns a Tuple that has no values. */
    public static  Tuple0 of() {
        return new Tuple0();
    }

    @Override
    public int degree() { return 0; }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        return true;
    }

    @Override
    public int compareTo(Tuple0 other) {
        if (other == null) throw new NullPointerException();
        return 0;
    }

}
