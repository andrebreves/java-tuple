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
 * A Tuple that has 10 values.
 * @author Andre Breves
 */
public final class Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> implements Tuple, Comparable<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> {

    private final T1 v1;
    private final T2 v2;
    private final T3 v3;
    private final T4 v4;
    private final T5 v5;
    private final T6 v6;
    private final T7 v7;
    private final T8 v8;
    private final T9 v9;
    private final T10 v10;

    private Tuple10(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v5 = v5;
        this.v6 = v6;
        this.v7 = v7;
        this.v8 = v8;
        this.v9 = v9;
        this.v10 = v10;
    }

    /** Returns a Tuple that has 10 values. */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10) {
        return new Tuple10<>(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
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
    /** Returns the 6th value of this Tuple. */
    public T6 v6() { return v6; }
    /** Returns the 7th value of this Tuple. */
    public T7 v7() { return v7; }
    /** Returns the 8th value of this Tuple. */
    public T8 v8() { return v8; }
    /** Returns the 9th value of this Tuple. */
    public T9 v9() { return v9; }
    /** Returns the 10th value of this Tuple. */
    public T10 v10() { return v10; }

    @Override
    public int degree() { return 10; }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        final Tuple10 other = (Tuple10) obj;
        return Objects.equals(v1, other.v1)
            && Objects.equals(v2, other.v2)
            && Objects.equals(v3, other.v3)
            && Objects.equals(v4, other.v4)
            && Objects.equals(v5, other.v5)
            && Objects.equals(v6, other.v6)
            && Objects.equals(v7, other.v7)
            && Objects.equals(v8, other.v8)
            && Objects.equals(v9, other.v9)
            && Objects.equals(v10, other.v10);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('[');
        sb.append(v1).append(',').append(' ');
        sb.append(v2).append(',').append(' ');
        sb.append(v3).append(',').append(' ');
        sb.append(v4).append(',').append(' ');
        sb.append(v5).append(',').append(' ');
        sb.append(v6).append(',').append(' ');
        sb.append(v7).append(',').append(' ');
        sb.append(v8).append(',').append(' ');
        sb.append(v9).append(',').append(' ');
        sb.append(v10);
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
    public int compareTo(Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> other) {
        if (other == null) throw new NullPointerException();
        int result;
        result = compare(v1, other.v1); if (result != 0) return result;
        result = compare(v2, other.v2); if (result != 0) return result;
        result = compare(v3, other.v3); if (result != 0) return result;
        result = compare(v4, other.v4); if (result != 0) return result;
        result = compare(v5, other.v5); if (result != 0) return result;
        result = compare(v6, other.v6); if (result != 0) return result;
        result = compare(v7, other.v7); if (result != 0) return result;
        result = compare(v8, other.v8); if (result != 0) return result;
        result = compare(v9, other.v9); if (result != 0) return result;
        result = compare(v10, other.v10); if (result != 0) return result;
        return 0;
    }

    /** Returns a Tuple mapping the 1st value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple10<R, T2, T3, T4, T5, T6, T7, T8, T9, T10> mapV1(Function<T1, R> mapper) {
        return Tuple10.of(mapper.apply(v1), v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }

    /** Returns a Tuple mapping the 2nd value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple10<T1, R, T3, T4, T5, T6, T7, T8, T9, T10> mapV2(Function<T2, R> mapper) {
        return Tuple10.of(v1, mapper.apply(v2), v3, v4, v5, v6, v7, v8, v9, v10);
    }

    /** Returns a Tuple mapping the 3rd value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple10<T1, T2, R, T4, T5, T6, T7, T8, T9, T10> mapV3(Function<T3, R> mapper) {
        return Tuple10.of(v1, v2, mapper.apply(v3), v4, v5, v6, v7, v8, v9, v10);
    }

    /** Returns a Tuple mapping the 4th value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple10<T1, T2, T3, R, T5, T6, T7, T8, T9, T10> mapV4(Function<T4, R> mapper) {
        return Tuple10.of(v1, v2, v3, mapper.apply(v4), v5, v6, v7, v8, v9, v10);
    }

    /** Returns a Tuple mapping the 5th value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple10<T1, T2, T3, T4, R, T6, T7, T8, T9, T10> mapV5(Function<T5, R> mapper) {
        return Tuple10.of(v1, v2, v3, v4, mapper.apply(v5), v6, v7, v8, v9, v10);
    }

    /** Returns a Tuple mapping the 6th value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple10<T1, T2, T3, T4, T5, R, T7, T8, T9, T10> mapV6(Function<T6, R> mapper) {
        return Tuple10.of(v1, v2, v3, v4, v5, mapper.apply(v6), v7, v8, v9, v10);
    }

    /** Returns a Tuple mapping the 7th value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple10<T1, T2, T3, T4, T5, T6, R, T8, T9, T10> mapV7(Function<T7, R> mapper) {
        return Tuple10.of(v1, v2, v3, v4, v5, v6, mapper.apply(v7), v8, v9, v10);
    }

    /** Returns a Tuple mapping the 8th value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple10<T1, T2, T3, T4, T5, T6, T7, R, T9, T10> mapV8(Function<T8, R> mapper) {
        return Tuple10.of(v1, v2, v3, v4, v5, v6, v7, mapper.apply(v8), v9, v10);
    }

    /** Returns a Tuple mapping the 9th value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, R, T10> mapV9(Function<T9, R> mapper) {
        return Tuple10.of(v1, v2, v3, v4, v5, v6, v7, v8, mapper.apply(v9), v10);
    }

    /** Returns a Tuple mapping the 10th value using the giving mapper function, and keeping the remaining values unchanged. */
    public <R> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> mapV10(Function<T10, R> mapper) {
        return Tuple10.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, mapper.apply(v10));
    }

    @FunctionalInterface
    public interface ValuesConsumer<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {
        void accept(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10);
    }

    /** Consumes the values of this Tuple using the giving Consumer. */
    public void consumeValues(ValuesConsumer<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> consumer) {
        consumer.accept(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }

    @FunctionalInterface
    public interface ValuesFunction<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> {
        R apply(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10);
    }

    /** Maps the values of this Tuple using the giving Function. */
    public <R> R mapValues(ValuesFunction<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> function) {
        return function.apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }

    @FunctionalInterface
    public interface ValuesPredicate<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {
        boolean test(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10);
    }

    /** Test the values of this Tuple using the giving Predicate. */
    public boolean testValues(ValuesPredicate<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> predicate) {
        return predicate.test(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }

    /** Returns a Tuple containing the values of this Tuple and the values passed as parameters. */
    public <T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> append(T11 v11) {
        return Tuple11.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11);
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> concat(Tuple0 t) {
        return this;
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> concat(Tuple1<T11> t) {
        return Tuple11.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, t.v1());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> concat(Tuple2<T11, T12> t) {
        return Tuple12.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, t.v1(), t.v2());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> concat(Tuple3<T11, T12, T13> t) {
        return Tuple13.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, t.v1(), t.v2(), t.v3());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> concat(Tuple4<T11, T12, T13, T14> t) {
        return Tuple14.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, t.v1(), t.v2(), t.v3(), t.v4());
    }

    /** Returns a Tuple containing the values of this Tuple and the values of the Tuple passed as parameter. */
    public <T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> concat(Tuple5<T11, T12, T13, T14, T15> t) {
        return Tuple15.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, t.v1(), t.v2(), t.v3(), t.v4(), t.v5());
    }

}
