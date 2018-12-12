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

import java.util.Objects;

/**
 * A Tuple that has 1 value.
 * @author Andre Breves
 */
public final class Tuple1<T1> implements Tuple, Comparable<Tuple1<T1>> {

    private final T1 v1;

    private Tuple1(T1 v1) { 
        this.v1 = v1;
    }

    /** Returns a Tuple that has 1 value. */
    public static <T1> Tuple1<T1> of(T1 v1) {
        return new Tuple1<>(v1);
    }

    /** Returns the 1st value of this Tuple. */
    public T1 v1() { return v1; }

    @Override
    public int degree() { return 1; }

    @Override
    public int hashCode() {
        return Objects.hash(v1);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        final Tuple1 other = (Tuple1) obj;
        return Objects.equals(v1, other.v1);
    }

    @SuppressWarnings("unchecked")
    private static <T> int compare(T t1, T t2) {
        if (t1 == t2) return 0;
        if (t1 == null) return -1;
        if (t2 == null) return 1;
        return ((Comparable<T>) t1).compareTo(t2);
    }

    @Override
    public int compareTo(Tuple1<T1> other) {
        int result;
        result = compare(v1, other.v1); if (result != 0) return result;
        return 0;
    }

}
