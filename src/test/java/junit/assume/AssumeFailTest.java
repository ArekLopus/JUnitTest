package junit.assume;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assume.*;

public class AssumeFailTest {
	
	//The default JUnit runner treats tests with failing assumptions as ignored.
	//Assumptions are defined in the Assume class and are basically the exact opposite of JUnit assertions:
	//If an assumption fails, the test automatically passes. This keeps tests from failing when certain
	//preconditions have not been met.
    @Test
    public void testA(){
        int x = 1;
        assumeThat( x, is(7) );
        System.out.println("assumption is true!");
    }
}
