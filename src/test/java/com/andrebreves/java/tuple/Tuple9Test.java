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

import org.junit.*;
import static org.junit.Assert.*;

public class Tuple9Test {

    Tuple9<String, String, String, String, String, String, String, String, String> tuple;

    @Before
    public void setup() {
        tuple = Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9");
    }

    @Test
    public void degree_shouldReturn9_whenCalled() {
        assertEquals(9, tuple.degree());
    }

    @Test
    public void of_shouldReturnNonNullTuple9Instance_whenCalled() {
        assertEquals(Tuple9.class, Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9").getClass());
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithNullArguments() {
        assertNotNull(Tuple9.of(null, null, null, null, null, null, null, null, null));
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithMixedTypeArguments() {
        assertNotNull(Tuple9.of(1, null, "v3", 4, null, "v6", 7, null, "v9"));
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
        Tuple9 other = Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9");
        assertTrue(tuple.equals(other));
    }

    @Test
    public void equals_shouldReturnFalse_whenCalledWithAnotherTupleWithDifferentContent() {
        Tuple9 other = Tuple9.of(1, null, "v3", 4, null, "v6", 7, null, "v9");
        assertFalse(tuple.equals(other));
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithTheSameTuple() {
        assertEquals(tuple.hashCode(), tuple.hashCode());
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithAnotherTupleWithTheSameContent() {
        Tuple9 other = Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9");
        assertEquals(tuple.hashCode(), other.hashCode());
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTheSameTuple() {
        assertEquals(0, tuple.compareTo(tuple));
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithAnotherTupleWithTheSameContent() {
        assertEquals(0, tuple.compareTo(Tuple9.of("v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9")));
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_shouldThrowNullPointerException_whenCalledWithNull() {
        tuple.compareTo(null);
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTwoTuplesWithNullContent() {
        Tuple9<String, String, String, String, String, String, String, String, String> t1 = Tuple9.of(null, null, null, null, null, null, null, null, null);
        Tuple9<String, String, String, String, String, String, String, String, String> t2 = Tuple9.of(null, null, null, null, null, null, null, null, null);
        assertEquals(0, t1.compareTo(t2));
    }

    @Test(expected = ClassCastException.class)
    public void compareTo_shouldThrowClassCastException_whenCalledWithNonComparableContent() {
        Tuple9<Object, Object, Object, Object, Object, Object, Object, Object, Object> t1 = Tuple9.of(new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        Tuple9<Object, Object, Object, Object, Object, Object, Object, Object, Object> t2 = Tuple9.of(new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object());
        t1.compareTo(t2);
    }

    @Test
    public void compareTo_shouldPutNullBefore_whenComparedWithNonNullContent() {
        Tuple9<String, String, String, String, String, String, String, String, String> other = Tuple9.of(null, null, null, null, null, null, null, null, null);
        assertTrue(other.compareTo(tuple) < 0);
        assertTrue(tuple.compareTo(other) > 0);
    }

    @Test
    public void compareTo_shouldReturnCorrectValue_whenComparingTwoCompatibleTuples() {
        Tuple9<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t1 = Tuple9.of(0, 0, 0, 0, 0, 0, 0, 0, 0);
        Tuple9<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> t2 = Tuple9.of(1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertTrue(t1.compareTo(t2) < 0);
        assertTrue(t2.compareTo(t1) > 0);
    }

}
