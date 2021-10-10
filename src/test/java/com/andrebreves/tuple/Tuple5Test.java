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

public class Tuple5Test {

    Tuple5<String, String, String, String, String> tuple;

    @Before
    public void setup() {
        tuple = Tuple5.of("v1", "v2", "v3", "v4", "v5");
    }

    @Test
    public void degree_shouldReturn5_whenCalled() {
        assertEquals(5, tuple.degree());
    }

    @Test
    public void of_shouldReturnNonNullTuple5Instance_whenCalled() {
        assertEquals(Tuple5.class, Tuple5.of("v1", "v2", "v3", "v4", "v5").getClass());
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithNullArguments() {
        assertNotNull(Tuple5.of(null, null, null, null, null));
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithMixedTypeArguments() {
        assertNotNull(Tuple5.of(1, null, "v3", 4, null));
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
        Tuple5 other = Tuple5.of("v1", "v2", "v3", "v4", "v5");
        assertTrue(tuple.equals(other));
    }

    @Test
    public void equals_shouldReturnFalse_whenCalledWithAnotherTupleWithDifferentContent() {
        Tuple5 other = Tuple5.of(1, null, "v3", 4, null);
        assertFalse(tuple.equals(other));

        Tuple5<Integer, Integer, Integer, Integer, Integer> t = Tuple5.of(0, 0, 0, 0, 0);

        Tuple5<Integer, Integer, Integer, Integer, Integer> t1 = Tuple5.of(1, 0, 0, 0, 0);
        assertFalse(t.equals(t1));
        assertFalse(t1.equals(t));

        Tuple5<Integer, Integer, Integer, Integer, Integer> t2 = Tuple5.of(0, 1, 0, 0, 0);
        assertFalse(t.equals(t2));
        assertFalse(t2.equals(t));

        Tuple5<Integer, Integer, Integer, Integer, Integer> t3 = Tuple5.of(0, 0, 1, 0, 0);
        assertFalse(t.equals(t3));
        assertFalse(t3.equals(t));

        Tuple5<Integer, Integer, Integer, Integer, Integer> t4 = Tuple5.of(0, 0, 0, 1, 0);
        assertFalse(t.equals(t4));
        assertFalse(t4.equals(t));

        Tuple5<Integer, Integer, Integer, Integer, Integer> t5 = Tuple5.of(0, 0, 0, 0, 1);
        assertFalse(t.equals(t5));
        assertFalse(t5.equals(t));

    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithTheSameTuple() {
        assertEquals(tuple.hashCode(), tuple.hashCode());
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithAnotherTupleWithTheSameContent() {
        Tuple5 other = Tuple5.of("v1", "v2", "v3", "v4", "v5");
        assertEquals(tuple.hashCode(), other.hashCode());
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTheSameTuple() {
        assertEquals(0, tuple.compareTo(tuple));
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithAnotherTupleWithTheSameContent() {
        assertEquals(0, tuple.compareTo(Tuple5.of("v1", "v2", "v3", "v4", "v5")));
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_shouldThrowNullPointerException_whenCalledWithNull() {
        tuple.compareTo(null);
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTwoTuplesWithNullContent() {
        Tuple5<String, String, String, String, String> t1 = Tuple5.of(null, null, null, null, null);
        Tuple5<String, String, String, String, String> t2 = Tuple5.of(null, null, null, null, null);
        assertEquals(0, t1.compareTo(t2));
    }

    @Test(expected = ClassCastException.class)
    public void compareTo_shouldThrowClassCastException_whenCalledWithNonComparableContent() {
        Tuple5<Object, Object, Object, Object, Object> t1 = Tuple5.of(new Object(), new Object(), new Object(), new Object(), new Object());
        Tuple5<Object, Object, Object, Object, Object> t2 = Tuple5.of(new Object(), new Object(), new Object(), new Object(), new Object());
        t1.compareTo(t2);
    }

    @Test
    public void compareTo_shouldPutNullBefore_whenComparedWithNonNullContent() {
        Tuple5<String, String, String, String, String> other = Tuple5.of(null, null, null, null, null);
        assertTrue(other.compareTo(tuple) < 0);
        assertTrue(tuple.compareTo(other) > 0);
    }

    @Test
    public void compareTo_shouldReturnCorrectValue_whenComparingTwoCompatibleTuples() {
        Tuple5<Integer, Integer, Integer, Integer, Integer> t = Tuple5.of(0, 0, 0, 0, 0);

        Tuple5<Integer, Integer, Integer, Integer, Integer> t1 = Tuple5.of(1, 0, 0, 0, 0);
        assertTrue(t.compareTo(t1) < 0);
        assertTrue(t1.compareTo(t) > 0);

        Tuple5<Integer, Integer, Integer, Integer, Integer> t2 = Tuple5.of(0, 1, 0, 0, 0);
        assertTrue(t.compareTo(t2) < 0);
        assertTrue(t2.compareTo(t) > 0);

        Tuple5<Integer, Integer, Integer, Integer, Integer> t3 = Tuple5.of(0, 0, 1, 0, 0);
        assertTrue(t.compareTo(t3) < 0);
        assertTrue(t3.compareTo(t) > 0);

        Tuple5<Integer, Integer, Integer, Integer, Integer> t4 = Tuple5.of(0, 0, 0, 1, 0);
        assertTrue(t.compareTo(t4) < 0);
        assertTrue(t4.compareTo(t) > 0);

        Tuple5<Integer, Integer, Integer, Integer, Integer> t5 = Tuple5.of(0, 0, 0, 0, 1);
        assertTrue(t.compareTo(t5) < 0);
        assertTrue(t5.compareTo(t) > 0);

    }

    @Test
    public void toString_shouldReturnCorrectValue_whenCalled() {
        assertEquals("[v1, v2, v3, v4, v5]", tuple.toString());
    }

    @Test
    public void mapV1_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple5.of("v1M", "v2", "v3", "v4", "v5"), tuple.mapV1(v -> v + "M"));
    }

    @Test
    public void mapV2_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple5.of("v1", "v2M", "v3", "v4", "v5"), tuple.mapV2(v -> v + "M"));
    }

    @Test
    public void mapV3_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple5.of("v1", "v2", "v3M", "v4", "v5"), tuple.mapV3(v -> v + "M"));
    }

    @Test
    public void mapV4_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple5.of("v1", "v2", "v3", "v4M", "v5"), tuple.mapV4(v -> v + "M"));
    }

    @Test
    public void mapV5_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple5.of("v1", "v2", "v3", "v4", "v5M"), tuple.mapV5(v -> v + "M"));
    }

    @Test
    public void append_shouldReturnNonNullTuple6Instance_whenCalledWithArgument() {
        assertEquals(Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6"), tuple.append("v6"));
    }

    @Test
    public void concat_shouldReturnEqualTuple5_whenCalledWithTuple0Argument() {
        assertEquals(tuple, tuple.concat(Tuple0.of()));
    }

    @Test
    public void concat_shouldReturnNonNullTuple6Instance_whenCalledWithTuple1Argument() {
        assertEquals(Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6"), tuple.concat(Tuple1.of("v6")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple7Instance_whenCalledWithTuple2Argument() {
        assertEquals(Tuple7.of("v1", "v2", "v3", "v4", "v5", "v6", "v7"), tuple.concat(Tuple2.of("v6", "v7")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple8Instance_whenCalledWithTuple3Argument() {
        assertEquals(Tuple8.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"), tuple.concat(Tuple3.of("v6", "v7", "v8")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple9Instance_whenCalledWithTuple4Argument() {
        assertEquals(Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"), tuple.concat(Tuple4.of("v6", "v7", "v8", "v9")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple10Instance_whenCalledWithTuple5Argument() {
        assertEquals(Tuple10.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"), tuple.concat(Tuple5.of("v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple11Instance_whenCalledWithTuple6Argument() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.concat(Tuple6.of("v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple12Instance_whenCalledWithTuple7Argument() {
        assertEquals(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"), tuple.concat(Tuple7.of("v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple13Instance_whenCalledWithTuple8Argument() {
        assertEquals(Tuple13.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"), tuple.concat(Tuple8.of("v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple14Instance_whenCalledWithTuple9Argument() {
        assertEquals(Tuple14.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"), tuple.concat(Tuple9.of("v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple15Instance_whenCalledWithTuple10Argument() {
        assertEquals(Tuple15.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"), tuple.concat(Tuple10.of("v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicate() {
        assertTrue(tuple.testValues((v1, v2, v3, v4, v5) -> true && "v1".equals(v1) && "v2".equals(v2) && "v3".equals(v3) && "v4".equals(v4) && "v5".equals(v5)));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunction() {
        assertEquals("testv1v2v3v4v5", tuple.mapValues((v1, v2, v3, v4, v5) -> "test" + v1 + v2 + v3 + v4 + v5));
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumer() {
        final StringBuilder s = new StringBuilder();
        tuple.consumeValues((v1, v2, v3, v4, v5) -> s.append("test").append(v1).append(v2).append(v3).append(v4).append(v5));
        assertEquals(s.toString(), "testv1v2v3v4v5");
    }

}
