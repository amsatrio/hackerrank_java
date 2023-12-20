import org.example.Regex;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class RegexTest {
    public final Logger logger = Logger.getLogger(this.getClass().getName());

//    @Test
    public void whenTestCase0_thenPrintTest() {
        logger.info("Running When Case 0: test");
        String a = "12.12.12.12\n" +
                "13.13.13.112\n" +
                "VUUT.12.12\n" +
                "111.111.11.111\n" +
                "1.1.1.1.1.1.1\n" +
                ".....\n" +
                "1...1..1..1\n" +
                "0.0.0.0\n" +
                "255.0.255.0\n" +
                "266.266.266.266\n" +
                "00000.000000.0000000.00001\n" +
                "0023.0012.0012.0034";
        
        String e = "true\n" +
                "true\n" +
                "false\n" +
                "true\n" +
                "false\n" +
                "false\n" +
                "false\n" +
                "true\n" +
                "true\n" +
                "false\n" +
                "false\n" +
                "false";

        String[] input = a.split("\n");
        String[] expectation = e.split("\n");

        for (int i = 0; i < input.length; i++) {
            String actual = "false";
            if(input[i].matches(new Regex().getPattern())){
                actual = "true";
            }
            System.out.println(input[i] + " " + expectation[i] + " " + actual);
            assertEquals(expectation[i], actual);
        }
    }

    @Test
    public void whenTestCase1_thenPrintTest() {
        logger.info("Running When Case 1: test");
        String a = "259.259.259.259\n" +
                "266.266.266.266\n" +
                "255.255.255.255\n" +
                "555.555.555.555\n" +
                "666.666.666.666\n" +
                "249.249.249.249\n" +
                "249.249.249.256";

        String e = "false\n" +
                "false\n" +
                "true\n" +
                "false\n" +
                "false\n" +
                "true\n" +
                "false";

        String[] input = a.split("\n");
        String[] expectation = e.split("\n");

        for (int i = 0; i < input.length; i++) {
            String actual = "false";
            if(input[i].matches(new Regex().getPattern())){
                actual = "true";
            }
            System.out.println(input[i] + " " + expectation[i] + " " + actual);
            assertEquals(expectation[i], actual);
        }
    }

}
