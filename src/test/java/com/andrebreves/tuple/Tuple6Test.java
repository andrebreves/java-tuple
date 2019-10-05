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

public class Tuple6Test {

    Tuple6<String, String, String, String, String, String> tuple;

    @Before
    public void setup() {
        tuple = Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6");
    }

    @Test
    public void degree_shouldReturn6_whenCalled() {
        assertEquals(6, tuple.degree());
    }

    @Test
    public void of_shouldReturnNonNullTuple6Instance_whenCalled() {
        assertEquals(Tuple6.class, Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6").getClass());
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithNullArguments() {
        assertNotNull(Tuple6.of(null, null, null, null, null, null));
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithMixedTypeArguments() {
        assertNotNull(Tuple6.of(1, null, "v3", 4, null, "v6"));
    }

    @Test
    public void concat_shouldReturnEqualTuple6_whenCalledWithNoArguments() {
        assertEquals(tuple, tuple.concat());
    }

    @Test
    public void concat_shouldReturnNonNullTuple7Instance_whenCalledWith1Value() {
        assertEquals(Tuple7.of("v1", "v2", "v3", "v4", "v5", "v6", "v7"), tuple.concat("v7"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple8Instance_whenCalledWith2Values() {
        assertEquals(Tuple8.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"), tuple.concat("v7", "v8"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple9Instance_whenCalledWith3Values() {
        assertEquals(Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"), tuple.concat("v7", "v8", "v9"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple10Instance_whenCalledWith4Values() {
        assertEquals(Tuple10.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"), tuple.concat("v7", "v8", "v9", "v10"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple11Instance_whenCalledWith5Values() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.concat("v7", "v8", "v9", "v10", "v11"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple12Instance_whenCalledWith6Values() {
        assertEquals(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"), tuple.concat("v7", "v8", "v9", "v10", "v11", "v12"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple13Instance_whenCalledWith7Values() {
        assertEquals(Tuple13.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"), tuple.concat("v7", "v8", "v9", "v10", "v11", "v12", "v13"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple14Instance_whenCalledWith8Values() {
        assertEquals(Tuple14.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"), tuple.concat("v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple15Instance_whenCalledWith9Values() {
        assertEquals(Tuple15.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"), tuple.concat("v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"));
    }

    @Test
    public void concat_shouldReturnNonNullTuple7Instance_whenCalledWithTuple1Argument() {
        assertEquals(Tuple7.of("v1", "v2", "v3", "v4", "v5", "v6", "v7"), tuple.concat(Tuple1.of("v7")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple8Instance_whenCalledWithTuple2Argument() {
        assertEquals(Tuple8.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"), tuple.concat(Tuple2.of("v7", "v8")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple9Instance_whenCalledWithTuple3Argument() {
        assertEquals(Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"), tuple.concat(Tuple3.of("v7", "v8", "v9")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple10Instance_whenCalledWithTuple4Argument() {
        assertEquals(Tuple10.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"), tuple.concat(Tuple4.of("v7", "v8", "v9", "v10")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple11Instance_whenCalledWithTuple5Argument() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.concat(Tuple5.of("v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple12Instance_whenCalledWithTuple6Argument() {
        assertEquals(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"), tuple.concat(Tuple6.of("v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple13Instance_whenCalledWithTuple7Argument() {
        assertEquals(Tuple13.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"), tuple.concat(Tuple7.of("v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple14Instance_whenCalledWithTuple8Argument() {
        assertEquals(Tuple14.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"), tuple.concat(Tuple8.of("v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple15Instance_whenCalledWithTuple9Argument() {
        assertEquals(Tuple15.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"), tuple.concat(Tuple9.of("v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void v1_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v1", tuple.v1());
    }

    @Test
    public void v2_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v2", tuple.v2());
    }

    @Test
    public void v3_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v3", tuple.v3());
    }

    @Test
    public void v4_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v4", tuple.v4());
    }

    @Test
    public void v5_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v5", tuple.v5());
    }

    @Test
    public void v6_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v6", tuple.v6());
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
        Tuple6 other = Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6");
        assertTrue(tuple.equals(other));
    }

    @Test
    public void equals_shouldReturnFalse_whenCalledWithAnotherTupleWithDifferentContent() {
        Tuple6 other = Tuple6.of(1, null, "v3", 4, null, "v6");
        assertFalse(tuple.equals(other));

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t = Tuple6.of(0, 0, 0, 0, 0, 0);

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t1 = Tuple6.of(1, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t1));
        assertFalse(t1.equals(t));

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t2 = Tuple6.of(0, 1, 0, 0, 0, 0);
        assertFalse(t.equals(t2));
        assertFalse(t2.equals(t));

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t3 = Tuple6.of(0, 0, 1, 0, 0, 0);
        assertFalse(t.equals(t3));
        assertFalse(t3.equals(t));

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t4 = Tuple6.of(0, 0, 0, 1, 0, 0);
        assertFalse(t.equals(t4));
        assertFalse(t4.equals(t));

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t5 = Tuple6.of(0, 0, 0, 0, 1, 0);
        assertFalse(t.equals(t5));
        assertFalse(t5.equals(t));

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t6 = Tuple6.of(0, 0, 0, 0, 0, 1);
        assertFalse(t.equals(t6));
        assertFalse(t6.equals(t));

    }
    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithTheSameTuple() {
        assertEquals(tuple.hashCode(), tuple.hashCode());
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithAnotherTupleWithTheSameContent() {
        Tuple6 other = Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6");
        assertEquals(tuple.hashCode(), other.hashCode());
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTheSameTuple() {
        assertEquals(0, tuple.compareTo(tuple));
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithAnotherTupleWithTheSameContent() {
        assertEquals(0, tuple.compareTo(Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6")));
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_shouldThrowNullPointerException_whenCalledWithNull() {
        tuple.compareTo(null);
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTwoTuplesWithNullContent() {
        Tuple6<String, String, String, String, String, String> t1 = Tuple6.of(null, null, null, null, null, null);
        Tuple6<String, String, String, String, String, String> t2 = Tuple6.of(null, null, null, null, null, null);
        assertEquals(0, t1.compareTo(t2));
    }

    @Test(expected = ClassCastException.class)
    public void compareTo_shouldThrowClassCastException_whenCalledWithNonComparableContent() {
        Tuple6<Object, Object, Object, Object, Object, Object> t1 = Tuple6.of(new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Tuple6<Object, Object, Object, Object, Object, Object> t2 = Tuple6.of(new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        t1.compareTo(t2);
    }

    @Test
    public void compareTo_shouldPutNullBefore_whenComparedWithNonNullContent() {
        Tuple6<String, String, String, String, String, String> other = Tuple6.of(null, null, null, null, null, null);
        assertTrue(other.compareTo(tuple) < 0);
        assertTrue(tuple.compareTo(other) > 0);
    }

    @Test
    public void compareTo_shouldReturnCorrectValue_whenComparingTwoCompatibleTuples() {
        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t = Tuple6.of(0, 0, 0, 0, 0, 0);

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t1 = Tuple6.of(1, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t1) < 0);
        assertTrue(t1.compareTo(t) > 0);

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t2 = Tuple6.of(0, 1, 0, 0, 0, 0);
        assertTrue(t.compareTo(t2) < 0);
        assertTrue(t2.compareTo(t) > 0);

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t3 = Tuple6.of(0, 0, 1, 0, 0, 0);
        assertTrue(t.compareTo(t3) < 0);
        assertTrue(t3.compareTo(t) > 0);

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t4 = Tuple6.of(0, 0, 0, 1, 0, 0);
        assertTrue(t.compareTo(t4) < 0);
        assertTrue(t4.compareTo(t) > 0);

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t5 = Tuple6.of(0, 0, 0, 0, 1, 0);
        assertTrue(t.compareTo(t5) < 0);
        assertTrue(t5.compareTo(t) > 0);

        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> t6 = Tuple6.of(0, 0, 0, 0, 0, 1);
        assertTrue(t.compareTo(t6) < 0);
        assertTrue(t6.compareTo(t) > 0);

    }

}
