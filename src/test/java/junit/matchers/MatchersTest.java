package junit.matchers;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unchecked")
public class MatchersTest {
	
	Integer[] integerArray = new Integer[]{1,2,3};
	Integer[] integerArray2 = new Integer[0];
	
	List<String> list1 = Arrays.asList("one", "two", "three");
	List<String> list2;
	List<String> list3 = new ArrayList<>() ;
	
	Map<String, String> map1 = new HashMap<>();
	
	@Before
	public void init() {
		map1.put("id", "1");
		map1.put("email", "abc");
	}
	
	@Test
	public void test1() {
		assertThat(123, allOf(new Matcher[]{instanceOf(int.class), is(123), not(321)}));
		assertThat(123, allOf(instanceOf(int.class), is(123), not(321)));
		
		assertThat(map1, aMapWithSize(2));
		
		assertThat(map1, not(anEmptyMap()));
		
		assertThat(123, any(int.class));
		
		assertThat(123, anyOf(instanceOf(long.class), is(123), not(123)));
		assertThat("myValue", anyOf(startsWith("foo"), containsString("Val")));
		
		assertThat(123, anything());
		
		assertThat(integerArray, array(equalTo(1), equalTo(2), equalTo(3)));
		
		assertThat(integerArray, arrayContaining(1,2,3));
		assertThat(integerArray, arrayContaining(equalTo(1), equalTo(2), equalTo(3)));
		
		assertThat(integerArray, arrayContainingInAnyOrder(3,1,2));
		
		assertThat(integerArray, arrayWithSize(3));
		assertThat(integerArray, arrayWithSize(equalTo(3)));
		
		assertThat("", blankOrNullString());
		
		assertThat("", blankString());
		
		assertThat(123, both(instanceOf(int.class)).and(is(123)));	//like &&
		
		assertThat(3*2.0, closeTo(6.0, 0.005));
		
		assertThat(new Integer(1), comparesEqualTo(1));	 //object is equal to the specified value, as reported by the compareTo()
		
		assertThat(list1, contains("one" ,"two", "three"));  //For a positive match, the examined iterable must be of the same length as the number of specified items. 
		
		assertThat(list1, containsInAnyOrder("two", "three", "one"));
		
		assertThat(list1, containsInRelativeOrder("one","three"));
		
		assertThat("abecadło", containsString("adł"));
		
		//assertThat("abecadło", containsStringIgnoringCase("ABE"));
		
		assertThat(123, either(instanceOf(int.class)).or(is(321)));	//like ||
		assertThat("abccolordef", either(containsString("color")).or(containsString("colour")));
		
		assertThat(list3, empty());
		assertThat(list3, is(empty()));
		assertThat(list1, not(empty()));
		
		assertThat(integerArray2, emptyArray());

		assertThat(list3, emptyCollectionOf(String.class));
		
		assertThat(list3, emptyIterable());
		
		assertThat(list3, emptyIterableOf(String.class));
		
		assertThat("", emptyOrNullString());
		
		assertThat("", emptyString());
		
		assertThat("abecadło", endsWith("dło"));
		
		//assertThat("abecadło", endsWithIgnoringCase("dło"));
		
		assertThat(123, equalTo(new Integer(123)));
		
		assertThat("aBc", equalToIgnoringCase("AbC"));
		
		assertThat(" aBc ", equalToIgnoringWhiteSpace("AbC "));
		
		//assertThat(list1, equalToObject(list2));
		
		//assertThat(myEvent, is(eventFrom(PropertyChangeEvent.class, myBean)))
		
		assertThat(Arrays.asList("bar", "baz"), everyItem(startsWith("ba")));
		assertThat(list1, everyItem(instanceOf(String.class)));
		
		assertThat(2, greaterThan(1));
		
		assertThat(2, greaterThanOrEqualTo(2));
		
		assertThat(map1, hasEntry("id", "1"));
		assertThat(map1, hasEntry(instanceOf(String.class), instanceOf(String.class)));
		
		assertThat(list1, hasItem("one"));
		assertThat(list1, hasItem(startsWith("o")));
		
		assertThat(integerArray, hasItemInArray(1));
		
		assertThat(list1, hasItems("one","two"));
		assertThat(list1, hasItems(startsWith("o"), startsWith("t"), startsWith("t")));
		
		assertThat(map1, hasKey("id"));
		assertThat(map1, hasKey(instanceOf(String.class)));
		
		//assertThat(myBean, hasProperty("foo"));
		
		assertThat(list1, hasSize(3));
		
		assertThat(list1, hasToString("[one, two, three]"));
		
		assertThat(map1, hasValue("1"));
		assertThat(map1, hasValue(instanceOf(String.class)));
		
		//assertThat(xml, hasXPath("/root/something[2]/cheese", myNs));
		
		assertThat("foo", is(in(new String[]{"bar", "foo"})));
		assertThat("foo", is(in(Arrays.asList("bar", "foo"))));
		
		assertThat(list1, instanceOf(List.class));
		
		assertThat(list1, is(notNullValue()));	//is - decorator, makes sentence easier to read
		assertThat(123, is(new Integer(123)));
		
		assertThat(list1, isA(List.class));
		
		assertThat("", isEmptyOrNullString());
		assertThat("", is(emptyOrNullString()));
		
		assertThat("", isEmptyString());
		assertThat("", is(emptyString()));
		
		assertThat("one", isIn(list1));
		assertThat("one", is(in(list1)));
				
		assertThat("one", isOneOf("one", "two", "three"));
		assertThat("one", is(oneOf("one", "two", "three")));
		
		assertThat(list1, iterableWithSize(3));
		assertThat(list1, iterableWithSize(equalTo(3)));
		
		assertThat(1, lessThan(2));
		
		assertThat(1, lessThanOrEqualTo(1));
		
		assertThat("acd@wp.pl", matchesPattern("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?"));
		
		assertThat(123, not(345));
		assertThat(new Object(), not(equalTo(new Object())));
		
		assertThat(Double.NaN, notANumber());
		
		assertThat(list1, notNullValue());
		assertThat(list1, notNullValue(List.class));
		
		assertThat(list2, nullValue());
		assertThat(list2, nullValue(List.class));
		
		assertThat("foo", is(oneOf("bar", "foo")));
		
		list2 = list1;
		assertThat(list1, sameInstance(list2));
		
		//assertThat(myBean, samePropertyValuesAs(myExpectedBean));
		
		assertThat("abecadło", startsWith("abe"));
		
		//assertThat("abecadło", startsWithIgnoringCase("abe"));
		
		assertThat("abecadło", stringContainsInOrder("abe","bec","adł"));
		
		assertThat(list1, theInstance(list2));
		assertThat("abc", theInstance("abc"));
		
		assertThat(list1.getClass(), typeCompatibleWith(List.class));
		
		
		
		
		
		
	}
	
//	    @Test
//	    public void lookupEmailAddresses() {
//	        assertThat(new CartoonCharacterEmailLookupService().getResults("looney"), allOf(
//	            not(empty()), 
//	            containsInAnyOrder(
//	                allOf(instanceOf(Map.class), hasEntry("id", "56"), hasEntry("email", "roadrunner@fast.org")),
//	                allOf(instanceOf(Map.class), hasEntry("id", "76"), hasEntry("email", "wiley@acme.com"))
//	            )
//	        ));
//	    }

	
}
