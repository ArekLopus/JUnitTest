package junit.rules;

import java.util.logging.Logger;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;

public class RuleChainTest {
	
	Logger log = Logger.getLogger(getClass().getName());
	
	@Rule
	public TestRule chain= RuleChain.outerRule(new LoggingCustomRule("outer rule"))
	                           .around(new LoggingCustomRule("middle rule"))
	                           .around(new LoggingCustomRule("inner rule"));

	@Test
	public void example() {
		assertTrue(true);
	}
}
