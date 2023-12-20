import org.example.Anagrams;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramsTest {
    public final Logger logger = Logger.getLogger(this.getClass().getName());

    @Test
    public void whenTestCase0_thenPrintTest() {
        logger.info("Running When Case 0: test");
        String a = "anagram";
        String b = "margana";
        boolean output = Anagrams.isAnagram(a,b);

        assertTrue(output);
    }

    @Test
    public void whenTestCase1_thenPrintTest() {
        logger.info("Running When Case 1: test");
        String a = "anagramm";
        String b = "marganaa";
        boolean output = Anagrams.isAnagram(a,b);

        assertFalse(output);
    }

    @Test
    public void whenTestCase2_thenPrintTest() {
        logger.info("Running When Case 2: test");
        String a = "Hello";
        String b = "hello";
        boolean output = Anagrams.isAnagram(a,b);

        assertTrue(output);
    }
}
