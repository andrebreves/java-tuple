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
import java.util.function.Function;

/**
 * A Tuple that has 2 values.
 * @author Andre Breves
 */
public final class Tuple2<T1, T2> implements Tuple, Comparable<Tuple2<T1, T2>> {

    private final T1 v1;
    private final T2 v2;

    private Tuple2(T1 v1, T2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    /** Returns a Tuple that has 2 values. */
    public static <T1, T2> Tuple2<T1, T2> of(T1 v1, T2 v2) {
        return new Tuple2<>(v1, v2);
    }

    /** Returns the 1st value of this Tuple. */
    public T1 v1() { return v1; }
    /** Returns the 2nd value of this Tuple. */
    public T2 v2() { return v2; }

    @Override
    public int degree() { return 2; }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        final Tuple2 other = (Tuple2) obj;
        return Objects.equals(v1, other.v1)
            && Objects.equals(v2, other.v2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('[');
        sb.append(v1).append(',').append(' ');
        sb.append(v2);
        return sb.append(']').toString();
    }

    @SuppressWarnings("unchecked")
    private static <T> int compare(T t1, T t2) {
        if (t1 == t2) return 0;
        if (t1 == null) return -1;
        if (t2 == null) return 1;
        return ((Comparable<T>) t1).compareTo(t2);
    }

    @Override
    public int compareTo(Tuple2<T1, T2> other) {
        if (other == null) throw new NullPointerException();
        int result;
        result = compare(v1, other.v1); if (result != 0) return result;
        result = compare(v2, other.v2); if (result != 0) return result;
        return 0;
    }

    /** Returns a Tuple mapping the 1st value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple2<R, T2> mapV1(Function<T1, R> mapper) {
        return Tuple2.of(mapper.apply(v1), v2);
    }

    /** Returns a Tuple mapping the 2nd value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple2<T1, R> mapV2(Function<T2, R> mapper) {
        return Tuple2.of(v1, mapper.apply(v2));
    }

    @FunctionalInterface
    public interface ValuesConsumer<T1, T2> {
        void accept(T1 v1, T2 v2);
    }

    /** Consumes the values of this Tuple using the giving Consumer. */
    public void consumeValues(ValuesConsumer<T1, T2> consumer) {
        consumer.accept(v1, v2);
    }

    @FunctionalInterface
    public interface ValuesFunction<T1, T2, R> {
        R apply(T1 v1, T2 v2);
    }

    /** Maps the values of this Tuple using the giving Function. */
    public <R> R mapValues(ValuesFunction<T1, T2, R> function) {
        return function.apply(v1, v2);
    }

    @FunctionalInterface
    public interface ValuesPredicate<T1, T2> {
        boolean test(T1 v1, T2 v2);
    }

    /** Test the values of this Tuple using the giving Predicate. */
    public boolean testValues(ValuesPredicate<T1, T2> predicate) {
        return predicate.test(v1, v2);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T3> Tuple3<T1, T2, T3> append(T3 v3) {
        return Tuple3.of(v1, v2, v3);
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public Tuple2<T1, T2> concat(Tuple0 t) {
        return this;
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3> Tuple3<T1, T2, T3> concat(Tuple1<T3> t) {
        return Tuple3.of(v1, v2, t.v1());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4> Tuple4<T1, T2, T3, T4> concat(Tuple2<T3, T4> t) {
        return Tuple4.of(v1, v2, t.v1(), t.v2());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> concat(Tuple3<T3, T4, T5> t) {
        return Tuple5.of(v1, v2, t.v1(), t.v2(), t.v3());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> concat(Tuple4<T3, T4, T5, T6> t) {
        return Tuple6.of(v1, v2, t.v1(), t.v2(), t.v3(), t.v4());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> concat(Tuple5<T3, T4, T5, T6, T7> t) {
        return Tuple7.of(v1, v2, t.v1(), t.v2(), t.v3(), t.v4(), t.v5());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> concat(Tuple6<T3, T4, T5, T6, T7, T8> t) {
        return Tuple8.of(v1, v2, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> concat(Tuple7<T3, T4, T5, T6, T7, T8, T9> t) {
        return Tuple9.of(v1, v2, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> concat(Tuple8<T3, T4, T5, T6, T7, T8, T9, T10> t) {
        return Tuple10.of(v1, v2, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> concat(Tuple9<T3, T4, T5, T6, T7, T8, T9, T10, T11> t) {
        return Tuple11.of(v1, v2, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> concat(Tuple10<T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> t) {
        return Tuple12.of(v1, v2, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9(), t.v10());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> concat(Tuple11<T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> t) {
        return Tuple13.of(v1, v2, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9(), t.v10(), t.v11());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> concat(Tuple12<T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> t) {
        return Tuple14.of(v1, v2, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9(), t.v10(), t.v11(), t.v12());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> concat(Tuple13<T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> t) {
        return Tuple15.of(v1, v2, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9(), t.v10(), t.v11(), t.v12(), t.v13());
    }

}
