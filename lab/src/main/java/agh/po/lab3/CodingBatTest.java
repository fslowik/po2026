
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class CodingBatTest {

    // Tworzymy jedną instancję klasy CodingBat, z której będą korzystać wszystkie testy
    private final CodingBat cb = new CodingBat();

    @Test
    void testSleepIn() {
        assertTrue(cb.sleepIn(false, false));
        assertFalse(cb.sleepIn(true, false));
        assertTrue(cb.sleepIn(false, true));
    }

    @Test
    void testLoneTeen() {
        assertTrue(cb.loneTeen(13, 99));
        assertTrue(cb.loneTeen(21, 19));
        assertFalse(cb.loneTeen(13, 13));
        assertFalse(cb.loneTeen(15, 15));
    }

    @Test
    void testSum13() {
        assertEquals(6, cb.sum13(new int[]{1, 2, 2, 1}));
        assertEquals(2, cb.sum13(new int[]{1, 1}));
        assertEquals(6, cb.sum13(new int[]{1, 2, 2, 1, 13}));
        assertEquals(3, cb.sum13(new int[]{13, 1, 2, 1}));
        assertEquals(0, cb.sum13(new int[]{}));
    }

    @Test
    void testFirstHalf() {
        assertEquals("Woo", cb.firstHalf("WooHoo"));
        assertEquals("Hello", cb.firstHalf("HelloThere"));
        assertEquals("abc", cb.firstHalf("abc")); // Przypadek nieparzysty, metoda zwraca cały str
    }

    @Test
    void testMapAB2() {
        Map<String, String> input1 = new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        assertEquals(Map.of("c", "cake"), cb.mapAB2(input1));

        Map<String, String> input2 = new HashMap<>(Map.of("a", "aaa", "b", "bbb"));
        assertEquals(Map.of("a", "aaa", "b", "bbb"), cb.mapAB2(input2));

        Map<String, String> input3 = new HashMap<>(Map.of("a", "aaa", "c", "cake"));
        assertEquals(Map.of("a", "aaa", "c", "cake"), cb.mapAB2(input3));
    }

    @Test
    void testWordCount() {
        // Test 1: Mieszane słowa[cite: 2]
        assertEquals(
                Map.of("a", 2, "b", 2, "c", 1),
                cb.wordCount(new String[]{"a", "b", "a", "c", "b"})
        );

        // Test 2: Pojedyncze wystąpienia[cite: 2]
        assertEquals(
                Map.of("a", 1, "b", 1, "c", 1),
                cb.wordCount(new String[]{"c", "b", "a"})
        );

        // Test 3: Identyczne słowa[cite: 2]
        assertEquals(
                Map.of("c", 4),
                cb.wordCount(new String[]{"c", "c", "c", "c"})
        );

        // Test 4: Pusta tablica
        assertEquals(
                Map.of(),
                cb.wordCount(new String[]{})
        );
    }
}
