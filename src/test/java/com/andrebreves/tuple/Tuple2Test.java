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

public class Tuple2Test {

    Tuple2<String, String> tuple;

    @Before
    public void setup() {
        tuple = Tuple2.of("v1", "v2");
    }

    @Test
    public void degree_shouldReturn2_whenCalled() {
        assertEquals(2, tuple.degree());
    }

    @Test
    public void of_shouldReturnNonNullTuple2Instance_whenCalled() {
        assertEquals(Tuple2.class, Tuple2.of("v1", "v2").getClass());
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithNullArguments() {
        assertNotNull(Tuple2.of(null, null));
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithMixedTypeArguments() {
        assertNotNull(Tuple2.of(1, null));
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
        Tuple2 other = Tuple2.of("v1", "v2");
        assertTrue(tuple.equals(other));
    }

    @Test
    public void equals_shouldReturnFalse_whenCalledWithAnotherTupleWithDifferentContent() {
        Tuple2 other = Tuple2.of(1, null);
        assertFalse(tuple.equals(other));

        Tuple2<Integer, Integer> t = Tuple2.of(0, 0);

        Tuple2<Integer, Integer> t1 = Tuple2.of(1, 0);
        assertFalse(t.equals(t1));
        assertFalse(t1.equals(t));

        Tuple2<Integer, Integer> t2 = Tuple2.of(0, 1);
        assertFalse(t.equals(t2));
        assertFalse(t2.equals(t));

    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithTheSameTuple() {
        assertEquals(tuple.hashCode(), tuple.hashCode());
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithAnotherTupleWithTheSameContent() {
        Tuple2 other = Tuple2.of("v1", "v2");
        assertEquals(tuple.hashCode(), other.hashCode());
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTheSameTuple() {
        assertEquals(0, tuple.compareTo(tuple));
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithAnotherTupleWithTheSameContent() {
        assertEquals(0, tuple.compareTo(Tuple2.of("v1", "v2")));
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_shouldThrowNullPointerException_whenCalledWithNull() {
        tuple.compareTo(null);
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTwoTuplesWithNullContent() {
        Tuple2<String, String> t1 = Tuple2.of(null, null);
        Tuple2<String, String> t2 = Tuple2.of(null, null);
        assertEquals(0, t1.compareTo(t2));
    }

    @Test(expected = ClassCastException.class)
    public void compareTo_shouldThrowClassCastException_whenCalledWithNonComparableContent() {
        Tuple2<Object, Object> t1 = Tuple2.of(new Object(), new Object());
        Tuple2<Object, Object> t2 = Tuple2.of(new Object(), new Object());
        t1.compareTo(t2);
    }

    @Test
    public void compareTo_shouldPutNullBefore_whenComparedWithNonNullContent() {
        Tuple2<String, String> other = Tuple2.of(null, null);
        assertTrue(other.compareTo(tuple) < 0);
        assertTrue(tuple.compareTo(other) > 0);
    }

    @Test
    public void compareTo_shouldReturnCorrectValue_whenComparingTwoCompatibleTuples() {
        Tuple2<Integer, Integer> t = Tuple2.of(0, 0);

        Tuple2<Integer, Integer> t1 = Tuple2.of(1, 0);
        assertTrue(t.compareTo(t1) < 0);
        assertTrue(t1.compareTo(t) > 0);

        Tuple2<Integer, Integer> t2 = Tuple2.of(0, 1);
        assertTrue(t.compareTo(t2) < 0);
        assertTrue(t2.compareTo(t) > 0);

    }

    @Test
    public void toString_shouldReturnCorrectValue_whenCalled() {
        assertEquals("[v1, v2]", tuple.toString());
    }

    @Test
    public void mapV1_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple2.of("v1M", "v2"), tuple.mapV1(v -> v + "M"));
    }

    @Test
    public void mapV2_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple2.of("v1", "v2M"), tuple.mapV2(v -> v + "M"));
    }

    @Test
    public void append_shouldReturnNonNullTuple3Instance_whenCalledWithArgument() {
        assertEquals(Tuple3.of("v1", "v2", "v3"), tuple.append("v3"));
    }

    @Test
    public void concat_shouldReturnEqualTuple2_whenCalledWithTuple0Argument() {
        assertEquals(tuple, tuple.concat(Tuple0.of()));
    }

    @Test
    public void concat_shouldReturnNonNullTuple3Instance_whenCalledWithTuple1Argument() {
        assertEquals(Tuple3.of("v1", "v2", "v3"), tuple.concat(Tuple1.of("v3")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple4Instance_whenCalledWithTuple2Argument() {
        assertEquals(Tuple4.of("v1", "v2", "v3", "v4"), tuple.concat(Tuple2.of("v3", "v4")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple5Instance_whenCalledWithTuple3Argument() {
        assertEquals(Tuple5.of("v1", "v2", "v3", "v4", "v5"), tuple.concat(Tuple3.of("v3", "v4", "v5")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple6Instance_whenCalledWithTuple4Argument() {
        assertEquals(Tuple6.of("v1", "v2", "v3", "v4", "v5", "v6"), tuple.concat(Tuple4.of("v3", "v4", "v5", "v6")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple7Instance_whenCalledWithTuple5Argument() {
        assertEquals(Tuple7.of("v1", "v2", "v3", "v4", "v5", "v6", "v7"), tuple.concat(Tuple5.of("v3", "v4", "v5", "v6", "v7")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple8Instance_whenCalledWithTuple6Argument() {
        assertEquals(Tuple8.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8"), tuple.concat(Tuple6.of("v3", "v4", "v5", "v6", "v7", "v8")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple9Instance_whenCalledWithTuple7Argument() {
        assertEquals(Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9"), tuple.concat(Tuple7.of("v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple10Instance_whenCalledWithTuple8Argument() {
        assertEquals(Tuple10.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"), tuple.concat(Tuple8.of("v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple11Instance_whenCalledWithTuple9Argument() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.concat(Tuple9.of("v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple12Instance_whenCalledWithTuple10Argument() {
        assertEquals(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"), tuple.concat(Tuple10.of("v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple13Instance_whenCalledWithTuple11Argument() {
        assertEquals(Tuple13.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"), tuple.concat(Tuple11.of("v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple14Instance_whenCalledWithTuple12Argument() {
        assertEquals(Tuple14.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"), tuple.concat(Tuple12.of("v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple15Instance_whenCalledWithTuple13Argument() {
        assertEquals(Tuple15.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"), tuple.concat(Tuple13.of("v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15")));
    }

    @Test
    public void testValues_shouldReturnCorrectValue_whenCalledWithValuesPredicate() {
        assertTrue(tuple.testValues((v1, v2) -> true && "v1".equals(v1) && "v2".equals(v2)));
    }

    @Test
    public void mapValues_shouldReturnCorrectValue_whenCalledWithValuesFunction() {
        assertEquals("testv1v2", tuple.mapValues((v1, v2) -> "test" + v1 + v2));
    }

    @Test
    public void consumeValues_shouldHaveCorrectBehavior_whenCalledWithValuesConsumer() {
        final StringBuilder s = new StringBuilder();
        tuple.consumeValues((v1, v2) -> s.append("test").append(v1).append(v2));
        assertEquals(s.toString(), "testv1v2");
    }

}
