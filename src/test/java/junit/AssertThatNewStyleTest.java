package junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

public class AssertThatNewStyleTest {
	
	
	@Test
	public void test() {
		assertThat("good", allOf(equalTo("good"), startsWith("good")));
		assertThat(123, allOf(instanceOf(int.class), is(123), not(321)));
		assertThat("good", allOf(equalTo("good"), startsWith("good")));
	    assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
	    assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
	    assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
	    assertThat(new Object(), not(sameInstance(new Object())));
	    assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
	    assertThat("albumen", both(containsString("a")).and(containsString("b")));
	    assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
	}
	
}