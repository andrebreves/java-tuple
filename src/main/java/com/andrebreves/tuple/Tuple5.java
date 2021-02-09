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
 * A Tuple that has 5 values.
 * @author Andre Breves
 */
public final class Tuple5<T1, T2, T3, T4, T5> implements Tuple, Comparable<Tuple5<T1, T2, T3, T4, T5>> {

    private final T1 v1;
    private final T2 v2;
    private final T3 v3;
    private final T4 v4;
    private final T5 v5;

    private Tuple5(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v5 = v5;
    }

    /** Returns a Tuple that has 5 values. */
    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5) {
        return new Tuple5<>(v1, v2, v3, v4, v5);
    }

    /** Returns the 1st value of this Tuple. */
    public T1 v1() { return v1; }
    /** Returns the 2nd value of this Tuple. */
    public T2 v2() { return v2; }
    /** Returns the 3rd value of this Tuple. */
    public T3 v3() { return v3; }
    /** Returns the 4th value of this Tuple. */
    public T4 v4() { return v4; }
    /** Returns the 5th value of this Tuple. */
    public T5 v5() { return v5; }

    @Override
    public int degree() { return 5; }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3, v4, v5);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        final Tuple5 other = (Tuple5) obj;
        return Objects.equals(v1, other.v1)
            && Objects.equals(v2, other.v2)
            && Objects.equals(v3, other.v3)
            && Objects.equals(v4, other.v4)
            && Objects.equals(v5, other.v5);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('[');
        sb.append(v1).append(',').append(' ');
        sb.append(v2).append(',').append(' ');
        sb.append(v3).append(',').append(' ');
        sb.append(v4).append(',').append(' ');
        sb.append(v5);
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
    public int compareTo(Tuple5<T1, T2, T3, T4, T5> other) {
        if (other == null) throw new NullPointerException();
        int result;
        result = compare(v1, other.v1); if (result != 0) return result;
        result = compare(v2, other.v2); if (result != 0) return result;
        result = compare(v3, other.v3); if (result != 0) return result;
        result = compare(v4, other.v4); if (result != 0) return result;
        result = compare(v5, other.v5); if (result != 0) return result;
        return 0;
    }

    /** Returns a Tuple mapping the 1st value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple5<R, T2, T3, T4, T5> mapV1(Function<T1, R> mapper) {
        return Tuple5.of(mapper.apply(v1), v2, v3, v4, v5);
    }

    /** Returns a Tuple mapping the 2nd value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple5<T1, R, T3, T4, T5> mapV2(Function<T2, R> mapper) {
        return Tuple5.of(v1, mapper.apply(v2), v3, v4, v5);
    }

    /** Returns a Tuple mapping the 3rd value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple5<T1, T2, R, T4, T5> mapV3(Function<T3, R> mapper) {
        return Tuple5.of(v1, v2, mapper.apply(v3), v4, v5);
    }

    /** Returns a Tuple mapping the 4th value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple5<T1, T2, T3, R, T5> mapV4(Function<T4, R> mapper) {
        return Tuple5.of(v1, v2, v3, mapper.apply(v4), v5);
    }

    /** Returns a Tuple mapping the 5th value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple5<T1, T2, T3, T4, R> mapV5(Function<T5, R> mapper) {
        return Tuple5.of(v1, v2, v3, v4, mapper.apply(v5));
    }

    @FunctionalInterface
    public interface ValuesConsumer<T1, T2, T3, T4, T5> {
        void accept(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5);
    }

    /** Consumes the values of this Tuple using the giving Consumer. */
    public void consumeValues(ValuesConsumer<T1, T2, T3, T4, T5> consumer) {
        consumer.accept(v1, v2, v3, v4, v5);
    }

    @FunctionalInterface
    public interface ValuesFunction<T1, T2, T3, T4, T5, R> {
        R apply(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5);
    }

    /** Maps the values of this Tuple using the giving Function. */
    public <R> R mapValues(ValuesFunction<T1, T2, T3, T4, T5, R> function) {
        return function.apply(v1, v2, v3, v4, v5);
    }

    @FunctionalInterface
    public interface ValuesPredicate<T1, T2, T3, T4, T5> {
        boolean test(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5);
    }

    /** Test the values of this Tuple using the giving Predicate. */
    public boolean testValues(ValuesPredicate<T1, T2, T3, T4, T5> predicate) {
        return predicate.test(v1, v2, v3, v4, v5);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T6> Tuple6<T1, T2, T3, T4, T5, T6> append(T6 v6) {
        return Tuple6.of(v1, v2, v3, v4, v5, v6);
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public Tuple5<T1, T2, T3, T4, T5> concat(Tuple0 t) {
        return this;
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T6> Tuple6<T1, T2, T3, T4, T5, T6> concat(Tuple1<T6> t) {
        return Tuple6.of(v1, v2, v3, v4, v5, t.v1());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> concat(Tuple2<T6, T7> t) {
        return Tuple7.of(v1, v2, v3, v4, v5, t.v1(), t.v2());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> concat(Tuple3<T6, T7, T8> t) {
        return Tuple8.of(v1, v2, v3, v4, v5, t.v1(), t.v2(), t.v3());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> concat(Tuple4<T6, T7, T8, T9> t) {
        return Tuple9.of(v1, v2, v3, v4, v5, t.v1(), t.v2(), t.v3(), t.v4());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> concat(Tuple5<T6, T7, T8, T9, T10> t) {
        return Tuple10.of(v1, v2, v3, v4, v5, t.v1(), t.v2(), t.v3(), t.v4(), t.v5());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> concat(Tuple6<T6, T7, T8, T9, T10, T11> t) {
        return Tuple11.of(v1, v2, v3, v4, v5, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> concat(Tuple7<T6, T7, T8, T9, T10, T11, T12> t) {
        return Tuple12.of(v1, v2, v3, v4, v5, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> concat(Tuple8<T6, T7, T8, T9, T10, T11, T12, T13> t) {
        return Tuple13.of(v1, v2, v3, v4, v5, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> concat(Tuple9<T6, T7, T8, T9, T10, T11, T12, T13, T14> t) {
        return Tuple14.of(v1, v2, v3, v4, v5, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> concat(Tuple10<T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> t) {
        return Tuple15.of(v1, v2, v3, v4, v5, t.v1(), t.v2(), t.v3(), t.v4(), t.v5(), t.v6(), t.v7(), t.v8(), t.v9(), t.v10());
    }

}
