import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class UtilityTest {

    @Test
    void dayOfYear() {
        assertEquals(31, Utility.dayOfYear(1, 31, 2022));
        assertEquals(59, Utility.dayOfYear(2, 28, 2022));
        assertEquals(90, Utility.dayOfYear(3, 31, 2022));
    }

    @Test
    void leap() {
        assertTrue(Utility.leap(2020));
        assertFalse(Utility.leap(2021));
        assertFalse(Utility.leap(1900));
        assertTrue(Utility.leap(2000));
    }

    @Test
    void countLongWords() {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "strawberry", "grape");
        Utility.countLongWords(words);
        assertEquals(10, Utility.LONG_WORD_LENGTH);
        assertEquals("strawberry", Utility.longestWord);
    }
}