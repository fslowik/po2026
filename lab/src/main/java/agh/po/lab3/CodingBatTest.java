package agh.po.lab3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {

    @Test
    public void testSleepIn() {
        CodingBat cb = new CodingBat();
        assertFalse(cb.sleepIn(true, false));
        assertTrue(cb.sleepIn(false, true));
        assertTrue(cb.sleepIn(false, true));
    }

    @Test
    public void testSum13() {
        CodingBat cb = new CodingBat();
        assertEquals(10, cb.sum13(new int[]{1, 6, 1, 2}));
        assertEquals(14, cb.sum13(new int[]{5, 3, 2, 4}));
        assertEquals(3, cb.sum13(new int[]{13, 1, 2, 13, 2, 1, 13}));
    }

    @Test
    public void firstHalf() {
        CodingBat cb = new CodingBat();
        assertEquals("1234", cb.firstHalf("12345678"));
        assertEquals("Hello", cb.firstHalf("HelloWorld"));
        assertEquals("java", cb.firstHalf("java2026"));
    }

    @Test
    public void mapAB2() {
        CodingBat cb = new CodingBat();

        Map<String, String> map1 = new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        assertEquals(Map.of("c", "cake"), cb.mapAB2(map1));
        Map<String, String> map2 = new HashMap<>(Map.of("a", "aaa", "b", "bbb"));
        assertEquals(Map.of("a", "aaa", "b", "bbb"), cb.mapAB2(map2));
        Map<String, String> map3 = new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"));
        assertEquals(Map.of("a", "aaa", "b", "bbb", "c", "aaa"), cb.mapAB2(map3));
    }

    @Test
    public void wordCount() {
        CodingBat cb = new CodingBat();
        assertEquals(Map.of("a", 2, "b", 2, "c", 1), cb.wordCount(new String[]{"a", "b", "a", "c", "b"}));
        assertEquals(Map.of("a", 1, "b", 1, "c", 1), cb.wordCount(new String[]{"c", "b", "a"}));
        assertEquals(Map.of("c", 4), cb.wordCount(new String[]{"c", "c", "c", "c"}));
    }
}