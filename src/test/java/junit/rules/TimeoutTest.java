package junit.rules;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class TimeoutTest {
	public static String log;

	@Rule
	public TestRule globalTimeout = new Timeout(2, TimeUnit.SECONDS);
	//public Timeout globalTimeout = Timeout.seconds(2);

	@Test
	public void testInfiniteLoop1() {
		log+= "ran1";
		for(;;) {}
	}

	@Test
	public void testInfiniteLoop2() {
		log+= "ran2";
		for(;;) {}
	}
}
