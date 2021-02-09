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

public class Tuple12Test {

    Tuple12<String, String, String, String, String, String, String, String, String, String, String, String> tuple;

    @Before
    public void setup() {
        tuple = Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12");
    }

    @Test
    public void degree_shouldReturn12_whenCalled() {
        assertEquals(12, tuple.degree());
    }

    @Test
    public void of_shouldReturnNonNullTuple12Instance_whenCalled() {
        assertEquals(Tuple12.class, Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12").getClass());
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithNullArguments() {
        assertNotNull(Tuple12.of(null, null, null, null, null, null, null, null, null, null, null, null));
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithMixedTypeArguments() {
        assertNotNull(Tuple12.of(1, null, "v3", 4, null, "v6", 7, null, "v9", 10, null, "v12"));
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
    public void v12_shouldReturnCorrectValue_whenCalled() {
        assertEquals("v12", tuple.v12());
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
        Tuple12 other = Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12");
        assertTrue(tuple.equals(other));
    }

    @Test
    public void equals_shouldReturnFalse_whenCalledWithAnotherTupleWithDifferentContent() {
        Tuple12 other = Tuple12.of(1, null, "v3", 4, null, "v6", 7, null, "v9", 10, null, "v12");
        assertFalse(tuple.equals(other));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t1 = Tuple12.of(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t1));
        assertFalse(t1.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t2 = Tuple12.of(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t2));
        assertFalse(t2.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t3 = Tuple12.of(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t3));
        assertFalse(t3.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t4 = Tuple12.of(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t4));
        assertFalse(t4.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t5 = Tuple12.of(0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t5));
        assertFalse(t5.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t6 = Tuple12.of(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t6));
        assertFalse(t6.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t7 = Tuple12.of(0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0);
        assertFalse(t.equals(t7));
        assertFalse(t7.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t8 = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0);
        assertFalse(t.equals(t8));
        assertFalse(t8.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t9 = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0);
        assertFalse(t.equals(t9));
        assertFalse(t9.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t10 = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0);
        assertFalse(t.equals(t10));
        assertFalse(t10.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t11 = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0);
        assertFalse(t.equals(t11));
        assertFalse(t11.equals(t));

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t12 = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        assertFalse(t.equals(t12));
        assertFalse(t12.equals(t));

    }
    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithTheSameTuple() {
        assertEquals(tuple.hashCode(), tuple.hashCode());
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithAnotherTupleWithTheSameContent() {
        Tuple12 other = Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12");
        assertEquals(tuple.hashCode(), other.hashCode());
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTheSameTuple() {
        assertEquals(0, tuple.compareTo(tuple));
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithAnotherTupleWithTheSameContent() {
        assertEquals(0, tuple.compareTo(Tuple12.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12")));
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_shouldThrowNullPointerException_whenCalledWithNull() {
        tuple.compareTo(null);
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTwoTuplesWithNullContent() {
        Tuple12<String, String, String, String, String, String, String, String, String, String, String, String> t1 = Tuple12.of(null, null, null, null, null, null, null, null, null, null, null, null);
        Tuple12<String, String, String, String, String, String, String, String, String, String, String, String> t2 = Tuple12.of(null, null, null, null, null, null, null, null, null, null, null, null);
        assertEquals(0, t1.compareTo(t2));
    }

    @Test(expected = ClassCastException.class)
    public void compareTo_shouldThrowClassCastException_whenCalledWithNonComparableContent() {
        Tuple12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> t1 = Tuple12.of(new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Tuple12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> t2 = Tuple12.of(new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        t1.compareTo(t2);
    }

    @Test
    public void compareTo_shouldPutNullBefore_whenComparedWithNonNullContent() {
        Tuple12<String, String, String, String, String, String, String, String, String, String, String, String> other = Tuple12.of(null, null, null, null, null, null, null, null, null, null, null, null);
        assertTrue(other.compareTo(tuple) < 0);
        assertTrue(tuple.compareTo(other) > 0);
    }

    @Test
    public void compareTo_shouldReturnCorrectValue_whenComparingTwoCompatibleTuples() {
        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t1 = Tuple12.of(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t1) < 0);
        assertTrue(t1.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t2 = Tuple12.of(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t2) < 0);
        assertTrue(t2.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t3 = Tuple12.of(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t3) < 0);
        assertTrue(t3.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t4 = Tuple12.of(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t4) < 0);
        assertTrue(t4.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t5 = Tuple12.of(0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t5) < 0);
        assertTrue(t5.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t6 = Tuple12.of(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t6) < 0);
        assertTrue(t6.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t7 = Tuple12.of(0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0);
        assertTrue(t.compareTo(t7) < 0);
        assertTrue(t7.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t8 = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0);
        assertTrue(t.compareTo(t8) < 0);
        assertTrue(t8.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t9 = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0);
        assertTrue(t.compareTo(t9) < 0);
        assertTrue(t9.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t10 = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0);
        assertTrue(t.compareTo(t10) < 0);
        assertTrue(t10.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t11 = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0);
        assertTrue(t.compareTo(t11) < 0);
        assertTrue(t11.compareTo(t) > 0);

        Tuple12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t12 = Tuple12.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        assertTrue(t.compareTo(t12) < 0);
        assertTrue(t12.compareTo(t) > 0);

    }

}
