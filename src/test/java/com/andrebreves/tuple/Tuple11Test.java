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

public class Tuple11Test {

    Tuple11<String, String, String, String, String, String, String, String, String, String, String> tuple;

    @Before
    public void setup() {
        tuple = Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11");
    }

    @Test
    public void degree_shouldReturn11_whenCalled() {
        assertEquals(11, tuple.degree());
    }

    @Test
    public void of_shouldReturnNonNullTuple11Instance_whenCalled() {
        assertEquals(Tuple11.class, Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11").getClass());
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithNullArguments() {
        assertNotNull(Tuple11.of(null, null, null, null, null, null, null, null, null, null, null));
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithMixedTypeArguments() {
        assertNotNull(Tuple11.of(1, null, "v3", 4, null, "v6", 7, null, "v9", 10, null));
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
    public void v7_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v7", tuple.v7());
    }

    @Test
    public void v8_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v8", tuple.v8());
    }

    @Test
    public void v9_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v9", tuple.v9());
    }

    @Test
    public void v10_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v10", tuple.v10());
    }

    @Test
    public void v11_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v11", tuple.v11());
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
        Tuple11 other = Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11");
        assertTrue(tuple.equals(other));
    }

    @Test
    public void equals_shouldReturnFalse_whenCalledWithAnotherTupleWithDifferentContent() {
        Tuple11 other = Tuple11.of(1, null, "v3", 4, null, "v6", 7, null, "v9", 10, null);
        assertFalse(tuple.equals(other));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t = Tuple11.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t1 = Tuple11.of(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t1));
        assertFalse(t1.equals(t));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t2 = Tuple11.of(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t2));
        assertFalse(t2.equals(t));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t3 = Tuple11.of(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t3));
        assertFalse(t3.equals(t));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t4 = Tuple11.of(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t4));
        assertFalse(t4.equals(t));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t5 = Tuple11.of(0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t5));
        assertFalse(t5.equals(t));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t6 = Tuple11.of(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t6));
        assertFalse(t6.equals(t));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t7 = Tuple11.of(0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0);
        assertFalse(t.equals(t7));
        assertFalse(t7.equals(t));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t8 = Tuple11.of(0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0);
        assertFalse(t.equals(t8));
        assertFalse(t8.equals(t));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t9 = Tuple11.of(0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0);
        assertFalse(t.equals(t9));
        assertFalse(t9.equals(t));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t10 = Tuple11.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0);
        assertFalse(t.equals(t10));
        assertFalse(t10.equals(t));

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t11 = Tuple11.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        assertFalse(t.equals(t11));
        assertFalse(t11.equals(t));

    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithTheSameTuple() {
        assertEquals(tuple.hashCode(), tuple.hashCode());
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithAnotherTupleWithTheSameContent() {
        Tuple11 other = Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11");
        assertEquals(tuple.hashCode(), other.hashCode());
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTheSameTuple() {
        assertEquals(0, tuple.compareTo(tuple));
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithAnotherTupleWithTheSameContent() {
        assertEquals(0, tuple.compareTo(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11")));
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_shouldThrowNullPointerException_whenCalledWithNull() {
        tuple.compareTo(null);
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTwoTuplesWithNullContent() {
        Tuple11<String, String, String, String, String, String, String, String, String, String, String> t1 = Tuple11.of(null, null, null, null, null, null, null, null, null, null, null);
        Tuple11<String, String, String, String, String, String, String, String, String, String, String> t2 = Tuple11.of(null, null, null, null, null, null, null, null, null, null, null);
        assertEquals(0, t1.compareTo(t2));
    }

    @Test(expected = ClassCastException.class)
    public void compareTo_shouldThrowClassCastException_whenCalledWithNonComparableContent() {
        Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> t1 = Tuple11.of(new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> t2 = Tuple11.of(new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        t1.compareTo(t2);
    }

    @Test
    public void compareTo_shouldPutNullBefore_whenComparedWithNonNullContent() {
        Tuple11<String, String, String, String, String, String, String, String, String, String, String> other = Tuple11.of(null, null, null, null, null, null, null, null, null, null, null);
        assertTrue(other.compareTo(tuple) < 0);
        assertTrue(tuple.compareTo(other) > 0);
    }

    @Test
    public void compareTo_shouldReturnCorrectValue_whenComparingTwoCompatibleTuples() {
        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t = Tuple11.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t1 = Tuple11.of(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t1) < 0);
        assertTrue(t1.compareTo(t) > 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t2 = Tuple11.of(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t2) < 0);
        assertTrue(t2.compareTo(t) > 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t3 = Tuple11.of(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t3) < 0);
        assertTrue(t3.compareTo(t) > 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t4 = Tuple11.of(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t4) < 0);
        assertTrue(t4.compareTo(t) > 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t5 = Tuple11.of(0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t5) < 0);
        assertTrue(t5.compareTo(t) > 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t6 = Tuple11.of(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t6) < 0);
        assertTrue(t6.compareTo(t) > 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t7 = Tuple11.of(0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0);
        assertTrue(t.compareTo(t7) < 0);
        assertTrue(t7.compareTo(t) > 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t8 = Tuple11.of(0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0);
        assertTrue(t.compareTo(t8) < 0);
        assertTrue(t8.compareTo(t) > 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t9 = Tuple11.of(0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0);
        assertTrue(t.compareTo(t9) < 0);
        assertTrue(t9.compareTo(t) > 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t10 = Tuple11.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0);
        assertTrue(t.compareTo(t10) < 0);
        assertTrue(t10.compareTo(t) > 0);

        Tuple11<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t11 = Tuple11.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        assertTrue(t.compareTo(t11) < 0);
        assertTrue(t11.compareTo(t) > 0);

    }

    @Test
    public void toString_shouldReturnCorrectValue_whenCalled() {
        assertEquals("[v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11]", tuple.toString());
    }

    @Test
    public void mapV1_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1M", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.mapV1(v -> v + "M"));
    }

    @Test
    public void mapV2_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1", "v2M", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.mapV2(v -> v + "M"));
    }

    @Test
    public void mapV3_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1", "v2", "v3M", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.mapV3(v -> v + "M"));
    }

    @Test
    public void mapV4_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4M", "v5", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.mapV4(v -> v + "M"));
    }

    @Test
    public void mapV5_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5M", "v6", "v7", "v8", "v9", "v10", "v11"), tuple.mapV5(v -> v + "M"));
    }

    @Test
    public void mapV6_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6M", "v7", "v8", "v9", "v10", "v11"), tuple.mapV6(v -> v + "M"));
    }

    @Test
    public void mapV7_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7M", "v8", "v9", "v10", "v11"), tuple.mapV7(v -> v + "M"));
    }

    @Test
    public void mapV8_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8M", "v9", "v10", "v11"), tuple.mapV8(v -> v + "M"));
    }

    @Test
    public void mapV9_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9M", "v10", "v11"), tuple.mapV9(v -> v + "M"));
    }

    @Test
    public void mapV10_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10M", "v11"), tuple.mapV10(v -> v + "M"));
    }

    @Test
    public void mapV11_shouldReturnCorrectValue_whenCalled() {
        assertEquals(Tuple11.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11M"), tuple.mapV11(v -> v + "M"));
    }

    @Test
    public void append_shouldReturnNonNullTuple12Instance_whenCalledWithArgument() {
        assertEquals(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"), tuple.append("v12"));
    }

    @Test
    public void concat_shouldReturnEqualTuple11_whenCalledWithTuple0Argument() {
        assertEquals(tuple, tuple.concat(Tuple0.of()));
    }

    @Test
    public void concat_shouldReturnNonNullTuple12Instance_whenCalledWithTuple1Argument() {
        assertEquals(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12"), tuple.concat(Tuple1.of("v12")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple13Instance_whenCalledWithTuple2Argument() {
        assertEquals(Tuple13.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13"), tuple.concat(Tuple2.of("v12", "v13")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple14Instance_whenCalledWithTuple3Argument() {
        assertEquals(Tuple14.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14"), tuple.concat(Tuple3.of("v12", "v13", "v14")));
    }

    @Test
    public void concat_shouldReturnNonNullTuple15Instance_whenCalledWithTuple4Argument() {
        assertEquals(Tuple15.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "v14", "v15"), tuple.concat(Tuple4.of("v12", "v13", "v14", "v15")));
    }

}
