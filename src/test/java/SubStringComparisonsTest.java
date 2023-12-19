import org.example.SubStringComparisons;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class SubStringComparisonsTest {
    public final Logger logger = Logger.getLogger(this.getClass().getName());

    @Test
    public void whenTestCase0_thenPrintTest() {
        logger.info("Running When Case 0: test");
        String s = "welcometojava";
        int k = 3;
        String output = SubStringComparisons.getSmallestAndLargest(s,k);
        String[] outputArray = output.split("\n");

        assertEquals("ava",outputArray[0]);
        assertEquals("wel", outputArray[1]);
    }

    @Test
    public void whenTestCase5_thenPrintTest() {
        logger.info("Running When Case 5: test");
        String s = "ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
        int k = 240;
        String output = SubStringComparisons.getSmallestAndLargest(s,k);
        String[] outputArray = output.split("\n");

        assertEquals("ASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRL",outputArray[0]);
        assertEquals("yotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKH", outputArray[1]);
    }

    @Test
    public void whenTestCase6_thenPrintTest() {
        logger.info("Running When Case 6: test");
        String s = "ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
        int k = 1;
        String output = SubStringComparisons.getSmallestAndLargest(s,k);
        String[] outputArray = output.split("\n");

        assertEquals("A",outputArray[0]);
        assertEquals("y", outputArray[1]);
    }

    @Test
    public void whenTestCase2_thenPrintTest() {
        logger.info("Running When Case 2: test");
        String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        int k = 30;
        String output = SubStringComparisons.getSmallestAndLargest(s,k);
        String[] outputArray = output.split("\n");

        assertEquals("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl",outputArray[0]);
        assertEquals("sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs", outputArray[1]);
    }
}
