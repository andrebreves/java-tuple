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
        assertEquals("v1", Tuple.of("v1").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple2() {
        assertEquals("v1", Tuple.of("v1", "v2").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple2() {
        assertEquals("v2", Tuple.of("v1", "v2").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple3() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple3() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple3() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple4() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple4() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple4() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple4() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple5() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple5() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple5() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple5() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple5() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple6() {
        assertEquals("v6", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6").v6());
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v6", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7").v6());
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple7() {
        assertEquals("v7", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7").v7());
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v6", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8").v6());
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v7", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8").v7());
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple8() {
        assertEquals("v8", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8").v8());
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v6", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").v6());
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v7", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").v7());
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v8", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").v8());
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple9() {
        assertEquals("v9", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").v9());
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v6", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").v6());
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v7", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").v7());
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v8", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").v8());
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v9", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").v9());
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple10() {
        assertEquals("v10", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10").v10());
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v6", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v6());
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v7", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v7());
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v8", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v8());
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v9", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v9());
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v10", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v10());
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalledWithTuple11() {
        assertEquals("v11", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").v11());
        assertEquals("v11", Tuple.v11(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v6", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v6());
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v7", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v7());
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v8", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v8());
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v9", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v9());
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v10", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v10());
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v11", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v11());
        assertEquals("v11", Tuple.v11(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v12_shouldReturnCorrectValue_whenCalledWithTuple12() {
        assertEquals("v12", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").v12());
        assertEquals("v12", Tuple.v12(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v6", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v6());
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v7", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v7());
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v8", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v8());
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v9", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v9());
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v10", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v10());
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v11", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v11());
        assertEquals("v11", Tuple.v11(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v12_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v12", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v12());
        assertEquals("v12", Tuple.v12(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v13_shouldReturnCorrectValue_whenCalledWithTuple13() {
        assertEquals("v13", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13").v13());
        assertEquals("v13", Tuple.v13(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v6", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v6());
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v7", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v7());
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v8", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v8());
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v9", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v9());
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v10", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v10());
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v11", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v11());
        assertEquals("v11", Tuple.v11(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v12_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v12", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v12());
        assertEquals("v12", Tuple.v12(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v13_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v13", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v13());
        assertEquals("v13", Tuple.v13(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v14_shouldReturnCorrectValue_whenCalledWithTuple14() {
        assertEquals("v14", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14").v14());
        assertEquals("v14", Tuple.v14(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v1", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v1());
        assertEquals("v1", Tuple.v1(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v2", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v2());
        assertEquals("v2", Tuple.v2(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v3", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v3());
        assertEquals("v3", Tuple.v3(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v4", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v4());
        assertEquals("v4", Tuple.v4(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v5", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v5());
        assertEquals("v5", Tuple.v5(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v6", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v6());
        assertEquals("v6", Tuple.v6(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v7_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v7", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v7());
        assertEquals("v7", Tuple.v7(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v8", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v8());
        assertEquals("v8", Tuple.v8(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v9", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v9());
        assertEquals("v9", Tuple.v9(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v10", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v10());
        assertEquals("v10", Tuple.v10(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v11", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v11());
        assertEquals("v11", Tuple.v11(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v12_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v12", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v12());
        assertEquals("v12", Tuple.v12(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v13_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v13", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v13());
        assertEquals("v13", Tuple.v13(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v14_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v14", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v14());
        assertEquals("v14", Tuple.v14(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v15_shouldReturnCorrectValue_whenCalledWithTuple15() {
        assertEquals("v15", Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15").v15());
        assertEquals("v15", Tuple.v15(Tuple.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

}
