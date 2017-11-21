package junit.matchers;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;

@SuppressWarnings("unchecked")
public class CoreMatchersTest {
	
	List<String> list1 = Arrays.asList("one", "two", "three");
	List<String> list2;
	
	@Test
	public void test1() {
		assertThat(123, allOf(new Matcher[]{instanceOf(int.class), is(123), not(321)}));
		assertThat(123, allOf(instanceOf(int.class), is(123), not(321)));
		
		assertThat(123, any(int.class));
		
		assertThat(123, anyOf(instanceOf(long.class), is(123), not(123)));
		assertThat("myValue", anyOf(startsWith("foo"), containsString("Val")));
		
		assertThat(123, anything());
		
		assertThat(123, both(instanceOf(int.class)).and(is(123)));	//like &&
		
		assertThat("abecadło", containsString("adł"));
		
		assertThat(123, either(instanceOf(int.class)).or(is(321)));	//like ||
		assertThat("abccolordef", either(containsString("color")).or(containsString("colour")));
		
		assertThat("abecadło", endsWith("dło"));
		
		assertThat(123, equalTo(new Integer(123)));
		
		assertThat(Arrays.asList("bar", "baz"), everyItem(startsWith("ba")));
		assertThat(Arrays.asList(1, 2, 3), everyItem(instanceOf(int.class)));
		
		assertThat(list1, hasItem("one"));
		assertThat(list1, hasItem(startsWith("o")));
		
		assertThat(list1, hasItems("one","two"));
		assertThat(list1, hasItems(startsWith("o"), startsWith("t"), startsWith("t")));
		
		assertThat(123, instanceOf(int.class));
		
		assertThat(list1, is(notNullValue()));	//is - decorator, makes sentence easier to read
		assertThat(123, is(new Integer(123)));
		
		assertThat(123, isA(int.class));
		
		assertThat(123, not(345));
		assertThat(new Object(), not(equalTo(new Object())));
		
		assertThat(list1, notNullValue());
		
		assertThat(list2, nullValue());
		
		list2 = list1;
		assertThat(list1, sameInstance(list2));
		
		assertThat("abecadło", startsWith("abe"));
		
		assertThat(list1, theInstance(list2));
		assertThat("abc", theInstance("abc"));
				
	}
	
}
