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

public class Tuple0Test {

    Tuple0 tuple;

    @Before
    public void setup() {
        tuple = Tuple0.of();
    }

    @Test
    public void degree_shouldReturn0_whenCalled() {
        assertEquals(0, tuple.degree());
    }

    @Test
    public void of_shouldReturnNonNullTuple0Instance_whenCalled() {
        assertEquals(Tuple0.class, Tuple0.of().getClass());
    }

    @Test
    public void concat_shouldReturnEqualTuple0_whenCalledWithNoArguments() {
        assertEquals(tuple, tuple.concat());
    }

    @Test
    public void concat_shouldReturnNonNullTuple1Instance_whenCalledWith1Value() {
        assertEquals(Tuple1.of("v1"), tuple.concat("v1"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple2Instance_whenCalledWith2Values() {
        assertEquals(Tuple2.of("v1", "v2"), tuple.concat("v1", "v2"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple3Instance_whenCalledWith3Values() {
        assertEquals(Tuple3.of("v1", "v2", "v3"), tuple.concat("v1", "v2", "v3"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple4Instance_whenCalledWith4Values() {
        assertEquals(Tuple4.of("v1", "v2", "v3", "v4"), tuple.concat("v1", "v2", "v3", "v4"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple5Instance_whenCalledWith5Values() {
        assertEquals(Tuple5.of("v1", "v2", "v3", "v4", "v5"), tuple.concat("v1", "v2", "v3", "v4", "v5"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple6Instance_whenCalledWith6Values() {
        assertEquals(Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6"), tuple.concat("v1", "v2", "v3", "v4", "v5", "v6"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple7Instance_whenCalledWith7Values() {
        assertEquals(Tuple7.of("v1", "v2", "v3", "v4", "v5", "v6", "v7"), tuple.concat("v1", "v2", "v3", "v4", "v5", "v6", "v7"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple8Instance_whenCalledWith8Values() {
        assertEquals(Tuple8.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"), tuple.concat("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple9Instance_whenCalledWith9Values() {
        assertEquals(Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"), tuple.concat("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple10Instance_whenCalledWith10Values() {
        assertEquals(Tuple10.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"), tuple.concat("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple11Instance_whenCalledWith11Values() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.concat("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple12Instance_whenCalledWith12Values() {
        assertEquals(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"), tuple.concat("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple13Instance_whenCalledWith13Values() {
        assertEquals(Tuple13.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"), tuple.concat("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple14Instance_whenCalledWith14Values() {
        assertEquals(Tuple14.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"), tuple.concat("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple15Instance_whenCalledWith15Values() {
        assertEquals(Tuple15.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"), tuple.concat("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple1Instance_whenCalledWithTuple1Argument() {
        assertEquals(Tuple1.of("v1"), tuple.concat(Tuple1.of("v1")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple2Instance_whenCalledWithTuple2Argument() {
        assertEquals(Tuple2.of("v1", "v2"), tuple.concat(Tuple2.of("v1", "v2")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple3Instance_whenCalledWithTuple3Argument() {
        assertEquals(Tuple3.of("v1", "v2", "v3"), tuple.concat(Tuple3.of("v1", "v2", "v3")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple4Instance_whenCalledWithTuple4Argument() {
        assertEquals(Tuple4.of("v1", "v2", "v3", "v4"), tuple.concat(Tuple4.of("v1", "v2", "v3", "v4")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple5Instance_whenCalledWithTuple5Argument() {
        assertEquals(Tuple5.of("v1", "v2", "v3", "v4", "v5"), tuple.concat(Tuple5.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple6Instance_whenCalledWithTuple6Argument() {
        assertEquals(Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6"), tuple.concat(Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple7Instance_whenCalledWithTuple7Argument() {
        assertEquals(Tuple7.of("v1", "v2", "v3", "v4", "v5", "v6", "v7"), tuple.concat(Tuple7.of("v1", "v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple8Instance_whenCalledWithTuple8Argument() {
        assertEquals(Tuple8.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"), tuple.concat(Tuple8.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple9Instance_whenCalledWithTuple9Argument() {
        assertEquals(Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"), tuple.concat(Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple10Instance_whenCalledWithTuple10Argument() {
        assertEquals(Tuple10.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"), tuple.concat(Tuple10.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple11Instance_whenCalledWithTuple11Argument() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.concat(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple12Instance_whenCalledWithTuple12Argument() {
        assertEquals(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"), tuple.concat(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple13Instance_whenCalledWithTuple13Argument() {
        assertEquals(Tuple13.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"), tuple.concat(Tuple13.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple14Instance_whenCalledWithTuple14Argument() {
        assertEquals(Tuple14.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"), tuple.concat(Tuple14.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple15Instance_whenCalledWithTuple15Argument() {
        assertEquals(Tuple15.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"), tuple.concat(Tuple15.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void equals_shouldReturnTrue_whenCalledWithTheSameTuple() {
        assertTrue(tuple.equals(tuple));
    }

    @Test
    public void equals_shouldReturnFalse_whenCalledWithNull() {
        assertFalse(tuple.equals(null));
    }

    @Test
    public void equals_shouldReturnFalse_whenCalledWithObjectOfAnotherType() {
        assertFalse(tuple.equals("string"));
    }

    @Test
    public void equals_shouldReturnTrue_whenCalledWithAnotherTupleWithTheSameContent() {
        Tuple0 other = Tuple0.of();
        assertTrue(tuple.equals(other));
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithTheSameTuple() {
        assertEquals(tuple.hashCode(), tuple.hashCode());
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithAnotherTupleWithTheSameContent() {
        Tuple0 other = Tuple0.of();
        assertEquals(tuple.hashCode(), other.hashCode());
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTheSameTuple() {
        assertEquals(0, tuple.compareTo(tuple));
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithAnotherTupleWithTheSameContent() {
        assertEquals(0, tuple.compareTo(Tuple0.of()));
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_shouldThrowNullPointerException_whenCalledWithNull() {
        tuple.compareTo(null);
    }

}
