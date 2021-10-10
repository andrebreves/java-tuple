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

import org.junit.*;
import static org.junit.Assert.*;

public class TupleTest {

    @Test
    public void of_shouldReturnNonNullTuple0Instance_whenCalledWithNoArguments() {
        assertEquals(Tuple0.class, Tuple.of().getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple1Instance_whenCalledWith1Argument() {
        assertEquals(Tuple1.class, Tuple.of("v1").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple2Instance_whenCalledWith2Arguments() {
        assertEquals(Tuple2.class, Tuple.of("v1", "v2").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple3Instance_whenCalledWith3Arguments() {
        assertEquals(Tuple3.class, Tuple.of("v1", "v2", "v3").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple4Instance_whenCalledWith4Arguments() {
        assertEquals(Tuple4.class, Tuple.of("v1", "v2", "v3", "v4").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple5Instance_whenCalledWith5Arguments() {
        assertEquals(Tuple5.class, Tuple.of("v1", "v2", "v3", "v4", "v5").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple6Instance_whenCalledWith6Arguments() {
        assertEquals(Tuple6.class, Tuple.of("v1", "v2", "v3", "v4", "v5", "v6").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple7Instance_whenCalledWith7Arguments() {
        assertEquals(Tuple7.class, Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple8Instance_whenCalledWith8Arguments() {
        assertEquals(Tuple8.class, Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple9Instance_whenCalledWith9Arguments() {
        assertEquals(Tuple9.class, Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple10Instance_whenCalledWith10Arguments() {
        assertEquals(Tuple10.class, Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple11Instance_whenCalledWith11Arguments() {
        assertEquals(Tuple11.class, Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple12Instance_whenCalledWith12Arguments() {
        assertEquals(Tuple12.class, Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple13Instance_whenCalledWith13Arguments() {
        assertEquals(Tuple13.class, Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple14Instance_whenCalledWith14Arguments() {
        assertEquals(Tuple14.class, Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").getClass());
    }

    @Test
    public void of_shouldReturnNonNullTuple15Instance_whenCalledWith15Arguments() {
        assertEquals(Tuple15.class, Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").getClass());
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple1() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple2() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple2() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple3() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple3() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple3() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple4() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple4() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple4() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple4() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple5() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple5() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple5() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple5() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple5() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v11", Tuple.v11(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v11", Tuple.v11(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v12_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v12", Tuple.v12(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v11", Tuple.v11(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v12_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v12", Tuple.v12(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v13_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v13", Tuple.v13(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v11", Tuple.v11(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v12_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v12", Tuple.v12(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v13_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v13", Tuple.v13(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v14_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v14", Tuple.v14(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v11", Tuple.v11(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v12_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v12", Tuple.v12(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v13_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v13", Tuple.v13(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v14_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v14", Tuple.v14(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v15_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v15", Tuple.v15(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple0() {
        assertTrue(Tuple.testValues(() -> true).test(Tuple.of()));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple1() {
        assertTrue(Tuple.testValues((v1) -> true && "v1".equals(v1)).test(Tuple.of("v1")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple2() {
        assertTrue(Tuple.testValues((v1, v2) -> true && "v1".equals(v1) && "v2".equals(v2)).test(Tuple.of("v1", "v2")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple3() {
        assertTrue(Tuple.testValues((v1, v2, v3) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3)).test(Tuple.of("v1", "v2", "v3")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple4() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4)).test(Tuple.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple5() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5)).test(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple6() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5, v6) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5) && "v6".equals(v6)).test(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple7() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5, v6, v7) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5) && "v6".equals(v6) && "v7".equals(v7)).test(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple8() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5, v6, v7, v8) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5) && "v6".equals(v6) && "v7".equals(v7) && "v8".equals(v8)).test(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple9() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5, v6, v7, v8, v9) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5) && "v6".equals(v6) && "v7".equals(v7) && "v8".equals(v8) && "v9".equals(v9)).test(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple10() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5) && "v6".equals(v6) && "v7".equals(v7) && "v8".equals(v8) && "v9".equals(v9) && "v10".equals(v10)).test(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple11() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5) && "v6".equals(v6) && "v7".equals(v7) && "v8".equals(v8) && "v9".equals(v9) && "v10".equals(v10) && "v11".equals(v11)).test(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple12() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5) && "v6".equals(v6) && "v7".equals(v7) && "v8".equals(v8) && "v9".equals(v9) && "v10".equals(v10) && "v11".equals(v11) && "v12".equals(v12)).test(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple13() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5) && "v6".equals(v6) && "v7".equals(v7) && "v8".equals(v8) && "v9".equals(v9) && "v10".equals(v10) && "v11".equals(v11) && "v12".equals(v12) && "v13".equals(v13)).test(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple14() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5) && "v6".equals(v6) && "v7".equals(v7) && "v8".equals(v8) && "v9".equals(v9) && "v10".equals(v10) && "v11".equals(v11) && "v12".equals(v12) && "v13".equals(v13) && "v14".equals(v14)).test(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicateOfTuple15() {
        assertTrue(Tuple.testValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5) && "v6".equals(v6) && "v7".equals(v7) && "v8".equals(v8) && "v9".equals(v9) && "v10".equals(v10) && "v11".equals(v11) && "v12".equals(v12) && "v13".equals(v13) && "v14".equals(v14) && "v15".equals(v15)).test(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple0() {
        assertEquals("test", Tuple.mapValues(() -> "test").apply(Tuple.of()));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple1() {
        assertEquals("testv1", Tuple.mapValues((v1) -> "test" + v1).apply(Tuple.of("v1")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple2() {
        assertEquals("testv1v2", Tuple.mapValues((v1, v2) -> "test" + v1 + v2).apply(Tuple.of("v1", "v2")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple3() {
        assertEquals("testv1v2v3", Tuple.mapValues((v1, v2, v3) -> "test" + v1 + v2 + v3).apply(Tuple.of("v1", "v2", "v3")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple4() {
        assertEquals("testv1v2v3v4", Tuple.mapValues((v1, v2, v3, v4) -> "test" + v1 + v2 + v3 + v4).apply(Tuple.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple5() {
        assertEquals("testv1v2v3v4v5", Tuple.mapValues((v1, v2, v3, v4, v5) -> "test" + v1 + v2 + v3 + v4 + v5).apply(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple6() {
        assertEquals("testv1v2v3v4v5v6", Tuple.mapValues((v1, v2, v3, v4, v5, v6) -> "test" + v1 + v2 + v3 + v4 + v5 + v6).apply(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple7() {
        assertEquals("testv1v2v3v4v5v6v7", Tuple.mapValues((v1, v2, v3, v4, v5, v6, v7) -> "test" + v1 + v2 + v3 + v4 + v5 + v6 + v7).apply(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple8() {
        assertEquals("testv1v2v3v4v5v6v7v8", Tuple.mapValues((v1, v2, v3, v4, v5, v6, v7, v8) -> "test" + v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8).apply(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple9() {
        assertEquals("testv1v2v3v4v5v6v7v8v9", Tuple.mapValues((v1, v2, v3, v4, v5, v6, v7, v8, v9) -> "test" + v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9).apply(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple10() {
        assertEquals("testv1v2v3v4v5v6v7v8v9v10", Tuple.mapValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10) -> "test" + v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10).apply(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple11() {
        assertEquals("testv1v2v3v4v5v6v7v8v9v10v11", Tuple.mapValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11) -> "test" + v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10 + v11).apply(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple12() {
        assertEquals("testv1v2v3v4v5v6v7v8v9v10v11v12", Tuple.mapValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12) -> "test" + v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10 + v11 + v12).apply(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple13() {
        assertEquals("testv1v2v3v4v5v6v7v8v9v10v11v12v13", Tuple.mapValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13) -> "test" + v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10 + v11 + v12 + v13).apply(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple14() {
        assertEquals("testv1v2v3v4v5v6v7v8v9v10v11v12v13v14", Tuple.mapValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14) -> "test" + v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10 + v11 + v12 + v13 + v14).apply(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunctionOfTuple15() {
        assertEquals("testv1v2v3v4v5v6v7v8v9v10v11v12v13v14v15", Tuple.mapValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15) -> "test" + v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10 + v11 + v12 + v13 + v14 + v15).apply(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple0() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues(() -> s.append("test")).accept(Tuple.of());
        assertEquals(s.toString(), "test");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple1() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1) -> s.append("test").append(v1)).accept(Tuple.of("v1"));
        assertEquals(s.toString(), "testv1");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple2() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2) -> s.append("test").append(v1).append(v2)).accept(Tuple.of("v1", "v2"));
        assertEquals(s.toString(), "testv1v2");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple3() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3) -> s.append("test").append(v1).append(v2).append(v3)).accept(Tuple.of("v1", "v2", "v3"));
        assertEquals(s.toString(), "testv1v2v3");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple4() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4) -> s.append("test").append(v1).append(v2).append(v3).append(v4)).accept(Tuple.of("v1", "v2", "v3", "v4"));
        assertEquals(s.toString(), "testv1v2v3v4");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple5() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5"));
        assertEquals(s.toString(), "testv1v2v3v4v5");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple6() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5, v6) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5).append(v6)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6"));
        assertEquals(s.toString(), "testv1v2v3v4v5v6");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple7() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5, v6, v7) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5).append(v6).append(v7)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7"));
        assertEquals(s.toString(), "testv1v2v3v4v5v6v7");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple8() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5, v6, v7, v8) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5).append(v6).append(v7).append(v8)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"));
        assertEquals(s.toString(), "testv1v2v3v4v5v6v7v8");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple9() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5, v6, v7, v8, v9) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5).append(v6).append(v7).append(v8).append(v9)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"));
        assertEquals(s.toString(), "testv1v2v3v4v5v6v7v8v9");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple10() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5).append(v6).append(v7).append(v8).append(v9).append(v10)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"));
        assertEquals(s.toString(), "testv1v2v3v4v5v6v7v8v9v10");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple11() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5).append(v6).append(v7).append(v8).append(v9).append(v10).append(v11)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"));
        assertEquals(s.toString(), "testv1v2v3v4v5v6v7v8v9v10v11");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple12() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5).append(v6).append(v7).append(v8).append(v9).append(v10).append(v11).append(v12)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"));
        assertEquals(s.toString(), "testv1v2v3v4v5v6v7v8v9v10v11v12");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple13() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5).append(v6).append(v7).append(v8).append(v9).append(v10).append(v11).append(v12).append(v13)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"));
        assertEquals(s.toString(), "testv1v2v3v4v5v6v7v8v9v10v11v12v13");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple14() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5).append(v6).append(v7).append(v8).append(v9).append(v10).append(v11).append(v12).append(v13).append(v14)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"));
        assertEquals(s.toString(), "testv1v2v3v4v5v6v7v8v9v10v11v12v13v14");
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumerOfTuple15() {
        final StringBuilder s = new StringBuilder();
        Tuple.consumeValues((v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5).append(v6).append(v7).append(v8).append(v9).append(v10).append(v11).append(v12).append(v13).append(v14).append(v15)).accept(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"));
        assertEquals(s.toString(), "testv1v2v3v4v5v6v7v8v9v10v11v12v13v14v15");
    }

}
