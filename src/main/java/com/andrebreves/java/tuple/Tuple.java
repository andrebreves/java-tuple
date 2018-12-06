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
package com.andrebreves.java.tuple;

/**
 * A Tuple that has up to 15 values.
 * @author Andre Breves
 */
public interface Tuple {

    /** Returns the value count of this Tuple. */
    int degree();

    /** Returns a Tuple that has no values. */
    static Tuple0 of() {
        return Tuple0.of();
    }

    /** Returns a Tuple that has 1 value. */
    static <T1> Tuple1<T1> of(T1 v1) {
        return Tuple1.of(v1);
    }

    /** Returns a Tuple that has 2 values. */
    static <T1, T2> Tuple2<T1, T2> of(T1 v1, T2 v2) {
        return Tuple2.of(v1, v2);
    }

    /** Returns a Tuple that has 3 values. */
    static <T1, T2, T3> Tuple3<T1, T2, T3> of(T1 v1, T2 v2, T3 v3) {
        return Tuple3.of(v1, v2, v3);
    }

    /** Returns a Tuple that has 4 values. */
    static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> of(T1 v1, T2 v2, T3 v3, T4 v4) {
        return Tuple4.of(v1, v2, v3, v4);
    }

    /** Returns a Tuple that has 5 values. */
    static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5) {
        return Tuple5.of(v1, v2, v3, v4, v5);
    }

    /** Returns a Tuple that has 6 values. */
    static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6) {
        return Tuple6.of(v1, v2, v3, v4, v5, v6);
    }

    /** Returns a Tuple that has 7 values. */
    static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7) {
        return Tuple7.of(v1, v2, v3, v4, v5, v6, v7);
    }

    /** Returns a Tuple that has 8 values. */
    static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8) {
        return Tuple8.of(v1, v2, v3, v4, v5, v6, v7, v8);
    }

    /** Returns a Tuple that has 9 values. */
    static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9) {
        return Tuple9.of(v1, v2, v3, v4, v5, v6, v7, v8, v9);
    }

    /** Returns a Tuple that has 10 values. */
    static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10) {
        return Tuple10.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }

    /** Returns a Tuple that has 11 values. */
    static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11) {
        return Tuple11.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11);
    }

    /** Returns a Tuple that has 12 values. */
    static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12) {
        return Tuple12.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12);
    }

    /** Returns a Tuple that has 13 values. */
    static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13) {
        return Tuple13.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13);
    }

    /** Returns a Tuple that has 14 values. */
    static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14) {
        return Tuple14.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14);
    }

    /** Returns a Tuple that has 15 values. */
    static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> of(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14, T15 v15) {
        return Tuple15.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15);
    }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple1<T1> tuple) { return tuple.v1(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple2<T1, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple2<?, T2> tuple) { return tuple.v2(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple3<T1, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple3<?, T2, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple3<?, ?, T3> tuple) { return tuple.v3(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple4<T1, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple4<?, T2, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple4<?, ?, T3, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple4<?, ?, ?, T4> tuple) { return tuple.v4(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple5<T1, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple5<?, T2, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple5<?, ?, T3, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple5<?, ?, ?, T4, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple5<?, ?, ?, ?, T5> tuple) { return tuple.v5(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple6<T1, ?, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple6<?, T2, ?, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple6<?, ?, T3, ?, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple6<?, ?, ?, T4, ?, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple6<?, ?, ?, ?, T5, ?> tuple) { return tuple.v5(); }
    /** Returns the 6th value of the Tuple. */
    static <T6> T6 v6(Tuple6<?, ?, ?, ?, ?, T6> tuple) { return tuple.v6(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple7<T1, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple7<?, T2, ?, ?, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple7<?, ?, T3, ?, ?, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple7<?, ?, ?, T4, ?, ?, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple7<?, ?, ?, ?, T5, ?, ?> tuple) { return tuple.v5(); }
    /** Returns the 6th value of the Tuple. */
    static <T6> T6 v6(Tuple7<?, ?, ?, ?, ?, T6, ?> tuple) { return tuple.v6(); }
    /** Returns the 7th value of the Tuple. */
    static <T7> T7 v7(Tuple7<?, ?, ?, ?, ?, ?, T7> tuple) { return tuple.v7(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple8<T1, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple8<?, T2, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple8<?, ?, T3, ?, ?, ?, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple8<?, ?, ?, T4, ?, ?, ?, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple8<?, ?, ?, ?, T5, ?, ?, ?> tuple) { return tuple.v5(); }
    /** Returns the 6th value of the Tuple. */
    static <T6> T6 v6(Tuple8<?, ?, ?, ?, ?, T6, ?, ?> tuple) { return tuple.v6(); }
    /** Returns the 7th value of the Tuple. */
    static <T7> T7 v7(Tuple8<?, ?, ?, ?, ?, ?, T7, ?> tuple) { return tuple.v7(); }
    /** Returns the 8th value of the Tuple. */
    static <T8> T8 v8(Tuple8<?, ?, ?, ?, ?, ?, ?, T8> tuple) { return tuple.v8(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple9<T1, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple9<?, T2, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple9<?, ?, T3, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple9<?, ?, ?, T4, ?, ?, ?, ?, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple9<?, ?, ?, ?, T5, ?, ?, ?, ?> tuple) { return tuple.v5(); }
    /** Returns the 6th value of the Tuple. */
    static <T6> T6 v6(Tuple9<?, ?, ?, ?, ?, T6, ?, ?, ?> tuple) { return tuple.v6(); }
    /** Returns the 7th value of the Tuple. */
    static <T7> T7 v7(Tuple9<?, ?, ?, ?, ?, ?, T7, ?, ?> tuple) { return tuple.v7(); }
    /** Returns the 8th value of the Tuple. */
    static <T8> T8 v8(Tuple9<?, ?, ?, ?, ?, ?, ?, T8, ?> tuple) { return tuple.v8(); }
    /** Returns the 9th value of the Tuple. */
    static <T9> T9 v9(Tuple9<?, ?, ?, ?, ?, ?, ?, ?, T9> tuple) { return tuple.v9(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple10<T1, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple10<?, T2, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple10<?, ?, T3, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple10<?, ?, ?, T4, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple10<?, ?, ?, ?, T5, ?, ?, ?, ?, ?> tuple) { return tuple.v5(); }
    /** Returns the 6th value of the Tuple. */
    static <T6> T6 v6(Tuple10<?, ?, ?, ?, ?, T6, ?, ?, ?, ?> tuple) { return tuple.v6(); }
    /** Returns the 7th value of the Tuple. */
    static <T7> T7 v7(Tuple10<?, ?, ?, ?, ?, ?, T7, ?, ?, ?> tuple) { return tuple.v7(); }
    /** Returns the 8th value of the Tuple. */
    static <T8> T8 v8(Tuple10<?, ?, ?, ?, ?, ?, ?, T8, ?, ?> tuple) { return tuple.v8(); }
    /** Returns the 9th value of the Tuple. */
    static <T9> T9 v9(Tuple10<?, ?, ?, ?, ?, ?, ?, ?, T9, ?> tuple) { return tuple.v9(); }
    /** Returns the 10th value of the Tuple. */
    static <T10> T10 v10(Tuple10<?, ?, ?, ?, ?, ?, ?, ?, ?, T10> tuple) { return tuple.v10(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple11<T1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple11<?, T2, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple11<?, ?, T3, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple11<?, ?, ?, T4, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple11<?, ?, ?, ?, T5, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v5(); }
    /** Returns the 6th value of the Tuple. */
    static <T6> T6 v6(Tuple11<?, ?, ?, ?, ?, T6, ?, ?, ?, ?, ?> tuple) { return tuple.v6(); }
    /** Returns the 7th value of the Tuple. */
    static <T7> T7 v7(Tuple11<?, ?, ?, ?, ?, ?, T7, ?, ?, ?, ?> tuple) { return tuple.v7(); }
    /** Returns the 8th value of the Tuple. */
    static <T8> T8 v8(Tuple11<?, ?, ?, ?, ?, ?, ?, T8, ?, ?, ?> tuple) { return tuple.v8(); }
    /** Returns the 9th value of the Tuple. */
    static <T9> T9 v9(Tuple11<?, ?, ?, ?, ?, ?, ?, ?, T9, ?, ?> tuple) { return tuple.v9(); }
    /** Returns the 10th value of the Tuple. */
    static <T10> T10 v10(Tuple11<?, ?, ?, ?, ?, ?, ?, ?, ?, T10, ?> tuple) { return tuple.v10(); }
    /** Returns the 11th value of the Tuple. */
    static <T11> T11 v11(Tuple11<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T11> tuple) { return tuple.v11(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple12<T1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple12<?, T2, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple12<?, ?, T3, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple12<?, ?, ?, T4, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple12<?, ?, ?, ?, T5, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v5(); }
    /** Returns the 6th value of the Tuple. */
    static <T6> T6 v6(Tuple12<?, ?, ?, ?, ?, T6, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v6(); }
    /** Returns the 7th value of the Tuple. */
    static <T7> T7 v7(Tuple12<?, ?, ?, ?, ?, ?, T7, ?, ?, ?, ?, ?> tuple) { return tuple.v7(); }
    /** Returns the 8th value of the Tuple. */
    static <T8> T8 v8(Tuple12<?, ?, ?, ?, ?, ?, ?, T8, ?, ?, ?, ?> tuple) { return tuple.v8(); }
    /** Returns the 9th value of the Tuple. */
    static <T9> T9 v9(Tuple12<?, ?, ?, ?, ?, ?, ?, ?, T9, ?, ?, ?> tuple) { return tuple.v9(); }
    /** Returns the 10th value of the Tuple. */
    static <T10> T10 v10(Tuple12<?, ?, ?, ?, ?, ?, ?, ?, ?, T10, ?, ?> tuple) { return tuple.v10(); }
    /** Returns the 11th value of the Tuple. */
    static <T11> T11 v11(Tuple12<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T11, ?> tuple) { return tuple.v11(); }
    /** Returns the 12th value of the Tuple. */
    static <T12> T12 v12(Tuple12<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T12> tuple) { return tuple.v12(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple13<T1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple13<?, T2, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple13<?, ?, T3, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple13<?, ?, ?, T4, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple13<?, ?, ?, ?, T5, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v5(); }
    /** Returns the 6th value of the Tuple. */
    static <T6> T6 v6(Tuple13<?, ?, ?, ?, ?, T6, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v6(); }
    /** Returns the 7th value of the Tuple. */
    static <T7> T7 v7(Tuple13<?, ?, ?, ?, ?, ?, T7, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v7(); }
    /** Returns the 8th value of the Tuple. */
    static <T8> T8 v8(Tuple13<?, ?, ?, ?, ?, ?, ?, T8, ?, ?, ?, ?, ?> tuple) { return tuple.v8(); }
    /** Returns the 9th value of the Tuple. */
    static <T9> T9 v9(Tuple13<?, ?, ?, ?, ?, ?, ?, ?, T9, ?, ?, ?, ?> tuple) { return tuple.v9(); }
    /** Returns the 10th value of the Tuple. */
    static <T10> T10 v10(Tuple13<?, ?, ?, ?, ?, ?, ?, ?, ?, T10, ?, ?, ?> tuple) { return tuple.v10(); }
    /** Returns the 11th value of the Tuple. */
    static <T11> T11 v11(Tuple13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T11, ?, ?> tuple) { return tuple.v11(); }
    /** Returns the 12th value of the Tuple. */
    static <T12> T12 v12(Tuple13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T12, ?> tuple) { return tuple.v12(); }
    /** Returns the 13th value of the Tuple. */
    static <T13> T13 v13(Tuple13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T13> tuple) { return tuple.v13(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple14<T1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple14<?, T2, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple14<?, ?, T3, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple14<?, ?, ?, T4, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple14<?, ?, ?, ?, T5, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v5(); }
    /** Returns the 6th value of the Tuple. */
    static <T6> T6 v6(Tuple14<?, ?, ?, ?, ?, T6, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v6(); }
    /** Returns the 7th value of the Tuple. */
    static <T7> T7 v7(Tuple14<?, ?, ?, ?, ?, ?, T7, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v7(); }
    /** Returns the 8th value of the Tuple. */
    static <T8> T8 v8(Tuple14<?, ?, ?, ?, ?, ?, ?, T8, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v8(); }
    /** Returns the 9th value of the Tuple. */
    static <T9> T9 v9(Tuple14<?, ?, ?, ?, ?, ?, ?, ?, T9, ?, ?, ?, ?, ?> tuple) { return tuple.v9(); }
    /** Returns the 10th value of the Tuple. */
    static <T10> T10 v10(Tuple14<?, ?, ?, ?, ?, ?, ?, ?, ?, T10, ?, ?, ?, ?> tuple) { return tuple.v10(); }
    /** Returns the 11th value of the Tuple. */
    static <T11> T11 v11(Tuple14<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T11, ?, ?, ?> tuple) { return tuple.v11(); }
    /** Returns the 12th value of the Tuple. */
    static <T12> T12 v12(Tuple14<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T12, ?, ?> tuple) { return tuple.v12(); }
    /** Returns the 13th value of the Tuple. */
    static <T13> T13 v13(Tuple14<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T13, ?> tuple) { return tuple.v13(); }
    /** Returns the 14th value of the Tuple. */
    static <T14> T14 v14(Tuple14<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T14> tuple) { return tuple.v14(); }

    /** Returns the 1st value of the Tuple. */
    static <T1> T1 v1(Tuple15<T1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v1(); }
    /** Returns the 2nd value of the Tuple. */
    static <T2> T2 v2(Tuple15<?, T2, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v2(); }
    /** Returns the 3rd value of the Tuple. */
    static <T3> T3 v3(Tuple15<?, ?, T3, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v3(); }
    /** Returns the 4th value of the Tuple. */
    static <T4> T4 v4(Tuple15<?, ?, ?, T4, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v4(); }
    /** Returns the 5th value of the Tuple. */
    static <T5> T5 v5(Tuple15<?, ?, ?, ?, T5, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v5(); }
    /** Returns the 6th value of the Tuple. */
    static <T6> T6 v6(Tuple15<?, ?, ?, ?, ?, T6, ?, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v6(); }
    /** Returns the 7th value of the Tuple. */
    static <T7> T7 v7(Tuple15<?, ?, ?, ?, ?, ?, T7, ?, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v7(); }
    /** Returns the 8th value of the Tuple. */
    static <T8> T8 v8(Tuple15<?, ?, ?, ?, ?, ?, ?, T8, ?, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v8(); }
    /** Returns the 9th value of the Tuple. */
    static <T9> T9 v9(Tuple15<?, ?, ?, ?, ?, ?, ?, ?, T9, ?, ?, ?, ?, ?, ?> tuple) { return tuple.v9(); }
    /** Returns the 10th value of the Tuple. */
    static <T10> T10 v10(Tuple15<?, ?, ?, ?, ?, ?, ?, ?, ?, T10, ?, ?, ?, ?, ?> tuple) { return tuple.v10(); }
    /** Returns the 11th value of the Tuple. */
    static <T11> T11 v11(Tuple15<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T11, ?, ?, ?, ?> tuple) { return tuple.v11(); }
    /** Returns the 12th value of the Tuple. */
    static <T12> T12 v12(Tuple15<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T12, ?, ?, ?> tuple) { return tuple.v12(); }
    /** Returns the 13th value of the Tuple. */
    static <T13> T13 v13(Tuple15<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T13, ?, ?> tuple) { return tuple.v13(); }
    /** Returns the 14th value of the Tuple. */
    static <T14> T14 v14(Tuple15<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T14, ?> tuple) { return tuple.v14(); }
    /** Returns the 15th value of the Tuple. */
    static <T15> T15 v15(Tuple15<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, T15> tuple) { return tuple.v15(); }

}
