package coverage;

import org.junit.Test;

public class CoverageTest {
	
	@Test
	public void noIncrementOfCount() {
		new Coverage().someMethod();
	}
	
	@Test
	public void incrementOfCount() {
		Coverage c = new Coverage();
		c.setCount(1);
		c.someMethod();
	}
}