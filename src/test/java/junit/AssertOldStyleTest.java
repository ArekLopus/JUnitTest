package junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AssertOldStyleTest {
	
	private byte[] expected = "trial".getBytes();
	private byte[] actual = "trial".getBytes();
	private List<String> list1 = Arrays.asList("one", "two", "three");
	private List<String> list2 = list1;
	private List<String> list3;
	
	@Test
	public void test1() {
		assertArrayEquals(expected, actual);
		
		assertEquals("text", "text");
		
		assertFalse(1 > 2);
		
		assertNotNull(new Object());
		
		assertNotSame(new Object(), new Object());
		
		assertNull(list3);
		
		assertSame(list2, list1);
		
		assertThat(list1, hasItems("one", "three"));
		
		assertTrue(2 > 1);
	}
	
}
