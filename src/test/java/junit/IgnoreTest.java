package junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {
	
	
	//Test runners will report the number of ignored tests. 
	//@Ignore takes an optional parameter (a String) if you want to record a reason why a test is being ignored.
	@Ignore("Test is ignored as a demonstration")
	@Test
	public void testSame() {
	    assertThat(1, is(1));
	}
	
}
