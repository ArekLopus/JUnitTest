package junit.assume;

import org.junit.*;

public class AssumeAnotherTest {
	
	@Test
	public void testIfVersioonGreaterThan4()
	{
	    String versionNumber = "7"; //Get it from configuration on runtime
	    Assume.assumeTrue(Integer.valueOf(versionNumber) == 7);
	    System.out.println("Test executed");
	}
}
