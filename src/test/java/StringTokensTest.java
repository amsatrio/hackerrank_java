import org.example.Anagrams;
import org.example.StringTokens;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringTokensTest {
    public final Logger logger = Logger.getLogger(this.getClass().getName());

    @Test
    public void whenTestCase0_thenPrintTest() {
        logger.info("Running When Case 0: test");
        String s = "He is a very very good boy, isn't he?";
        String output = StringTokens.stringTokens(s);

        assertEquals("10\n" +
                "He\n" +
                "is\n" +
                "a\n" +
                "very\n" +
                "very\n" +
                "good\n" +
                "boy\n" +
                "isn\n" +
                "t\n" +
                "he", output);
    }

    @Test
    public void whenTestCase1_thenPrintTest() {
        logger.info("Running When Case 1: test");
        String s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
        String output = StringTokens.stringTokens(s);

        assertEquals("21\n" +
                "Hello\n" +
                "thanks\n" +
                "for\n" +
                "attempting\n" +
                "this\n" +
                "problem\n" +
                "Hope\n" +
                "it\n" +
                "will\n" +
                "help\n" +
                "you\n" +
                "to\n" +
                "learn\n" +
                "java\n" +
                "Good\n" +
                "luck\n" +
                "and\n" +
                "have\n" +
                "a\n" +
                "nice\n" +
                "day", output);
    }

    @Test
    public void whenTestCase3_thenPrintTest() {
        logger.info("Running When Case 3: test");
        String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        String output = StringTokens.stringTokens(s);

        assertEquals("8\n" +
                "YES\n" +
                "leading\n" +
                "spaces\n" +
                "are\n" +
                "valid\n" +
                "problemsetters\n" +
                "are\n" +
                "evillllll", output);
    }

    @Test
    public void whenTestCase9_thenPrintTest() {
        logger.info("Running When Case 9: test");
        String s = "         ";
        String output = StringTokens.stringTokens(s);

        assertEquals("0", output);
    }
}
