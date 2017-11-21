package mockito.spy;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Spy {
	
	private List<String> list = new ArrayList<>();
	
	@Test
	public void test() {
		
		List<String> spy = spy(list);

		//optionally, you can stub out some methods:
		when(spy.size()).thenReturn(100);

		//using the spy calls *real* methods
		spy.add("one");
		spy.add("two");

		//prints "one" - the first element of a list
		System.out.println(spy.get(0));
		System.out.println(spy.get(1));

		//size() method was stubbed - 100 is printed
		System.out.println(spy.size());

		//optionally, you can verify
		verify(spy).add("one");
		verify(spy).add("two");
		verify(spy).size();
	}
	@Test
	public void test1() {
		
		List<String> spy = spy(list);
		
		//Impossible: real method is called so spy.get(0) throws IndexOutOfBoundsException (the list is yet empty)
		//when(spy.get(0)).thenReturn("foo");

		//You have to use doReturn() for stubbing
		doReturn("foo").when(spy).get(0);
				
		//optionally, you can verify
		assertThat("foo", equalTo(spy.get(0)));
		
	}
	   
}
