package junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTest {
	
    public static String log;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(2); // 3 seconds max per method tested

    @Test(timeout=1000)		//It has a preference to @Rule
    public void testInfiniteLoop1() {
        log += "ran1";
        for (;;) {
        }
    }

    @Test
    public void testInfiniteLoop2() {
        log += "ran2";
        for (;;) {
        }
    }
	
    @Test
    public void testInfiniteLoop3() {
        log += "ran3";
        for (;;) {
        }
    }

    
}
