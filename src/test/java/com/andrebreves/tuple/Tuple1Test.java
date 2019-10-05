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

public class Tuple1Test {

    Tuple1<String> tuple;

    @Before
    public void setup() {
        tuple = Tuple1.of("v1");
    }

    @Test
    public void degree_shouldReturn1_whenCalled() {
        assertEquals(1, tuple.degree());
    }

    @Test
    public void of_shouldReturnNonNullTuple1Instance_whenCalled() {
        assertEquals(Tuple1.class, Tuple1.of("v1").getClass());
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithNullArguments() {
        assertNotNull(Tuple1.of(null));
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithMixedTypeArguments() {
        assertNotNull(Tuple1.of(1));
    }

    @Test
    public void concat_shouldReturnEqualTuple1_whenCalledWithNoArguments() {
        assertEquals(tuple, tuple.concat());
    }

    @Test
    public void concat_shouldReturnNonNullTuple2Instance_whenCalledWith1Value() {
        assertEquals(Tuple2.of("v1", "v2"), tuple.concat("v2"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple3Instance_whenCalledWith2Values() {
        assertEquals(Tuple3.of("v1", "v2", "v3"), tuple.concat("v2", "v3"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple4Instance_whenCalledWith3Values() {
        assertEquals(Tuple4.of("v1", "v2", "v3", "v4"), tuple.concat("v2", "v3", "v4"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple5Instance_whenCalledWith4Values() {
        assertEquals(Tuple5.of("v1", "v2", "v3", "v4", "v5"), tuple.concat("v2", "v3", "v4", "v5"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple6Instance_whenCalledWith5Values() {
        assertEquals(Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6"), tuple.concat("v2", "v3", "v4", "v5", "v6"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple7Instance_whenCalledWith6Values() {
        assertEquals(Tuple7.of("v1", "v2", "v3", "v4", "v5", "v6", "v7"), tuple.concat("v2", "v3", "v4", "v5", "v6", "v7"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple8Instance_whenCalledWith7Values() {
        assertEquals(Tuple8.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"), tuple.concat("v2", "v3", "v4", "v5", "v6", "v7", "v8"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple9Instance_whenCalledWith8Values() {
        assertEquals(Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"), tuple.concat("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple10Instance_whenCalledWith9Values() {
        assertEquals(Tuple10.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"), tuple.concat("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple11Instance_whenCalledWith10Values() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.concat("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple12Instance_whenCalledWith11Values() {
        assertEquals(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"), tuple.concat("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple13Instance_whenCalledWith12Values() {
        assertEquals(Tuple13.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"), tuple.concat("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple14Instance_whenCalledWith13Values() {
        assertEquals(Tuple14.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"), tuple.concat("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple15Instance_whenCalledWith14Values() {
        assertEquals(Tuple15.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"), tuple.concat("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple2Instance_whenCalledWithTuple1Argument() {
        assertEquals(Tuple2.of("v1", "v2"), tuple.concat(Tuple1.of("v2")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple3Instance_whenCalledWithTuple2Argument() {
        assertEquals(Tuple3.of("v1", "v2", "v3"), tuple.concat(Tuple2.of("v2", "v3")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple4Instance_whenCalledWithTuple3Argument() {
        assertEquals(Tuple4.of("v1", "v2", "v3", "v4"), tuple.concat(Tuple3.of("v2", "v3", "v4")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple5Instance_whenCalledWithTuple4Argument() {
        assertEquals(Tuple5.of("v1", "v2", "v3", "v4", "v5"), tuple.concat(Tuple4.of("v2", "v3", "v4", "v5")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple6Instance_whenCalledWithTuple5Argument() {
        assertEquals(Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6"), tuple.concat(Tuple5.of("v2", "v3", "v4", "v5", "v6")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple7Instance_whenCalledWithTuple6Argument() {
        assertEquals(Tuple7.of("v1", "v2", "v3", "v4", "v5", "v6", "v7"), tuple.concat(Tuple6.of("v2", "v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple8Instance_whenCalledWithTuple7Argument() {
        assertEquals(Tuple8.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"), tuple.concat(Tuple7.of("v2", "v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple9Instance_whenCalledWithTuple8Argument() {
        assertEquals(Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"), tuple.concat(Tuple8.of("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple10Instance_whenCalledWithTuple9Argument() {
        assertEquals(Tuple10.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"), tuple.concat(Tuple9.of("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple11Instance_whenCalledWithTuple10Argument() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.concat(Tuple10.of("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple12Instance_whenCalledWithTuple11Argument() {
        assertEquals(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"), tuple.concat(Tuple11.of("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple13Instance_whenCalledWithTuple12Argument() {
        assertEquals(Tuple13.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"), tuple.concat(Tuple12.of("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple14Instance_whenCalledWithTuple13Argument() {
        assertEquals(Tuple14.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"), tuple.concat(Tuple13.of("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple15Instance_whenCalledWithTuple14Argument() {
        assertEquals(Tuple15.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"), tuple.concat(Tuple14.of("v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v1", tuple.v1());
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
        Tuple1 other = Tuple1.of("v1");
        assertTrue(tuple.equals(other));
    }

    @Test
    public void equals_shouldReturnFalse_whenCalledWithAnotherTupleWithDifferentContent() {
        Tuple1 other = Tuple1.of(1);
        assertFalse(tuple.equals(other));

        Tuple1<Integer> t = Tuple1.of(0);

        Tuple1<Integer> t1 = Tuple1.of(1);
        assertFalse(t.equals(t1));
        assertFalse(t1.equals(t));

    }
    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithTheSameTuple() {
        assertEquals(tuple.hashCode(), tuple.hashCode());
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithAnotherTupleWithTheSameContent() {
        Tuple1 other = Tuple1.of("v1");
        assertEquals(tuple.hashCode(), other.hashCode());
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTheSameTuple() {
        assertEquals(0, tuple.compareTo(tuple));
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithAnotherTupleWithTheSameContent() {
        assertEquals(0, tuple.compareTo(Tuple1.of("v1")));
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_shouldThrowNullPointerException_whenCalledWithNull() {
        tuple.compareTo(null);
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTwoTuplesWithNullContent() {
        Tuple1<String> t1 = Tuple1.of(null);
        Tuple1<String> t2 = Tuple1.of(null);
        assertEquals(0, t1.compareTo(t2));
    }

    @Test(expected = ClassCastException.class)
    public void compareTo_shouldThrowClassCastException_whenCalledWithNonComparableContent() {
        Tuple1<Object> t1 = Tuple1.of(new Object());
        Tuple1<Object> t2 = Tuple1.of(new Object());
        t1.compareTo(t2);
    }

    @Test
    public void compareTo_shouldPutNullBefore_whenComparedWithNonNullContent() {
        Tuple1<String> other = Tuple1.of(null);
        assertTrue(other.compareTo(tuple) < 0);
        assertTrue(tuple.compareTo(other) > 0);
    }

    @Test
    public void compareTo_shouldReturnCorrectValue_whenComparingTwoCompatibleTuples() {
        Tuple1<Integer> t = Tuple1.of(0);

        Tuple1<Integer> t1 = Tuple1.of(1);
        assertTrue(t.compareTo(t1) < 0);
        assertTrue(t1.compareTo(t) > 0);

    }

}
