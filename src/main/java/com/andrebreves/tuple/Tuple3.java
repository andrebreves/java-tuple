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
 * A Tuple that has 3 values.
 * @author Andre Breves
 */
public final class Tuple3<T1, T2, T3> implements Tuple, Comparable<Tuple3<T1, T2, T3>> {

    private final T1 v1;
    private final T2 v2;
    private final T3 v3;

    private Tuple3(T1 v1, T2 v2, T3 v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    /** Returns a Tuple that has 3 values. */
    public static <T1, T2, T3> Tuple3<T1, T2, T3> of(T1 v1, T2 v2, T3 v3) {
        return new Tuple3<>(v1, v2, v3);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public Tuple3<T1, T2, T3> concat() {
        return this;
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4> Tuple4<T1, T2, T3, T4> concat(T4 v4) {
        return Tuple4.of(v1, v2, v3, v4);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5> Tuple5<T1, T2, T3, T4, T5> concat(T4 v4, T5 v5) {
        return Tuple5.of(v1, v2, v3, v4, v5);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> concat(T4 v4, T5 v5, T6 v6) {
        return Tuple6.of(v1, v2, v3, v4, v5, v6);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> concat(T4 v4, T5 v5, T6 v6, T7 v7) {
        return Tuple7.of(v1, v2, v3, v4, v5, v6, v7);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> concat(T4 v4, T5 v5, T6 v6, T7 v7, T8 v8) {
        return Tuple8.of(v1, v2, v3, v4, v5, v6, v7, v8);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> concat(T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9) {
        return Tuple9.of(v1, v2, v3, v4, v5, v6, v7, v8, v9);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> concat(T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10) {
        return Tuple10.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> concat(T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11) {
        return Tuple11.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> concat(T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12) {
        return Tuple12.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> concat(T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13) {
        return Tuple13.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> concat(T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14) {
        return Tuple14.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> concat(T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14, T15 v15) {
        return Tuple15.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15);
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4> Tuple4<T1, T2, T3, T4> concat(Tuple1<T4> t) {
        return Tuple4.of(v1, v2, v3, t.v1());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5> Tuple5<T1, T2, T3, T4, T5> concat(Tuple2<T4, T5> t) {
        return Tuple5.of(v1, v2, v3, t.v1(), t.v2());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> concat(Tuple3<T4, T5, T6> t) {
        return Tuple6.of(v1, v2, v3, t.v1(), t.v2(), t.v3());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> concat(Tuple4<T4, T5, T6, T7> t) {
        return Tuple7.of(v1, v2, v3, t.v1(), t.v2(), t.v3(), t.v4());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> concat(Tuple5<T4, T5, T6, T7, T8> t) {
        return Tuple8.of(v1, v2, v3, t.v1(), t.v2(), t.v3(), t.v4(), t.v5());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> concat(Tuple6<T4, T5, T6, T7, T8, T9> t) {
        return Tuple9.of(v1, v2, v3, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> concat(Tuple7<T4, T5, T6, T7, T8, T9, T10> t) {
        return Tuple10.of(v1, v2, v3, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> concat(Tuple8<T4, T5, T6, T7, T8, T9, T10, T11> t) {
        return Tuple11.of(v1, v2, v3, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> concat(Tuple9<T4, T5, T6, T7, T8, T9, T10, T11, T12> t) {
        return Tuple12.of(v1, v2, v3, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> concat(Tuple10<T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> t) {
        return Tuple13.of(v1, v2, v3, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9(), t.v10());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> concat(Tuple11<T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> t) {
        return Tuple14.of(v1, v2, v3, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9(), t.v10(), t.v11());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> concat(Tuple12<T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> t) {
        return Tuple15.of(v1, v2, v3, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9(), t.v10(), t.v11(), t.v12());
    }

    /** Returns the 1st value of this Tuple. */
    public T1 v1() { return v1; }
    /** Returns the 2nd value of this Tuple. */
    public T2 v2() { return v2; }
    /** Returns the 3rd value of this Tuple. */
    public T3 v3() { return v3; }

    @Override
    public int degree() { return 3; }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        final Tuple3 other = (Tuple3) obj;
        return Objects.equals(v1, other.v1)
            && Objects.equals(v2, other.v2)
            && Objects.equals(v3, other.v3);
    }

    @SuppressWarnings("unchecked")
    private static <T> int compare(T t1, T t2) {
        if (t1 == t2) return 0;
        if (t1 == null) return -1;
        if (t2 == null) return 1;
        return ((Comparable<T>) t1).compareTo(t2);
    }

    @Override
    public int compareTo(Tuple3<T1, T2, T3> other) {
        if (other == null) throw new NullPointerException();
        int result;
        result = compare(v1, other.v1); if (result != 0) return result;
        result = compare(v2, other.v2); if (result != 0) return result;
        result = compare(v3, other.v3); if (result != 0) return result;
        return 0;
    }

}
