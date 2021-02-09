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

public class Tuple3Test {

    Tuple3<String, String, String> tuple;

    @Before
    public void setup() {
        tuple = Tuple3.of("v1", "v2", "v3");
    }

    @Test
    public void degree_shouldReturn3_whenCalled() {
        assertEquals(3, tuple.degree());
    }

    @Test
    public void of_shouldReturnNonNullTuple3Instance_whenCalled() {
        assertEquals(Tuple3.class, Tuple3.of("v1", "v2", "v3").getClass());
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithNullArguments() {
        assertNotNull(Tuple3.of(null, null, null));
    }

    @Test
    public void of_shouldReturnNonNullInstance_whenCalledWithMixedTypeArguments() {
        assertNotNull(Tuple3.of(1, null, "v3"));
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
        Tuple3 other = Tuple3.of("v1", "v2", "v3");
        assertTrue(tuple.equals(other));
    }

    @Test
    public void equals_shouldReturnFalse_whenCalledWithAnotherTupleWithDifferentContent() {
        Tuple3 other = Tuple3.of(1, null, "v3");
        assertFalse(tuple.equals(other));

        Tuple3<Integer, Integer, Integer> t = Tuple3.of(0, 0, 0);

        Tuple3<Integer, Integer, Integer> t1 = Tuple3.of(1, 0, 0);
        assertFalse(t.equals(t1));
        assertFalse(t1.equals(t));

        Tuple3<Integer, Integer, Integer> t2 = Tuple3.of(0, 1, 0);
        assertFalse(t.equals(t2));
        assertFalse(t2.equals(t));

        Tuple3<Integer, Integer, Integer> t3 = Tuple3.of(0, 0, 1);
        assertFalse(t.equals(t3));
        assertFalse(t3.equals(t));

    }
    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithTheSameTuple() {
        assertEquals(tuple.hashCode(), tuple.hashCode());
    }

    @Test
    public void hashCode_shouldReturnTheSameValue_whenCalledWithAnotherTupleWithTheSameContent() {
        Tuple3 other = Tuple3.of("v1", "v2", "v3");
        assertEquals(tuple.hashCode(), other.hashCode());
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTheSameTuple() {
        assertEquals(0, tuple.compareTo(tuple));
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithAnotherTupleWithTheSameContent() {
        assertEquals(0, tuple.compareTo(Tuple3.of("v1", "v2", "v3")));
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_shouldThrowNullPointerException_whenCalledWithNull() {
        tuple.compareTo(null);
    }

    @Test
    public void compareTo_shouldReturnZero_whenCalledWithTwoTuplesWithNullContent() {
        Tuple3<String, String, String> t1 = Tuple3.of(null, null, null);
        Tuple3<String, String, String> t2 = Tuple3.of(null, null, null);
        assertEquals(0, t1.compareTo(t2));
    }

    @Test(expected = ClassCastException.class)
    public void compareTo_shouldThrowClassCastException_whenCalledWithNonComparableContent() {
        Tuple3<Object, Object, Object> t1 = Tuple3.of(new Object(), new Object(), new Object());
        Tuple3<Object, Object, Object> t2 = Tuple3.of(new Object(), new Object(), new Object());
        t1.compareTo(t2);
    }

    @Test
    public void compareTo_shouldPutNullBefore_whenComparedWithNonNullContent() {
        Tuple3<String, String, String> other = Tuple3.of(null, null, null);
        assertTrue(other.compareTo(tuple) < 0);
        assertTrue(tuple.compareTo(other) > 0);
    }

    @Test
    public void compareTo_shouldReturnCorrectValue_whenComparingTwoCompatibleTuples() {
        Tuple3<Integer, Integer, Integer> t = Tuple3.of(0, 0, 0);

        Tuple3<Integer, Integer, Integer> t1 = Tuple3.of(1, 0, 0);
        assertTrue(t.compareTo(t1) < 0);
        assertTrue(t1.compareTo(t) > 0);

        Tuple3<Integer, Integer, Integer> t2 = Tuple3.of(0, 1, 0);
        assertTrue(t.compareTo(t2) < 0);
        assertTrue(t2.compareTo(t) > 0);

        Tuple3<Integer, Integer, Integer> t3 = Tuple3.of(0, 0, 1);
        assertTrue(t.compareTo(t3) < 0);
        assertTrue(t3.compareTo(t) > 0);

    }

}
