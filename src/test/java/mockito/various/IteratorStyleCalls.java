package mockito.various;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class IteratorStyleCalls {
	
	@Mock
	private List<String> mockedList; 
	
	@Test(expected=RuntimeException.class)
	public void test() {
		
		mockedList.add("abc");
		
		 when(mockedList.set(0, "some arg"))
		   .thenThrow(new RuntimeException())
		   .thenReturn("foo");

		 //First call: throws runtime exception:
		 mockedList.set(0, "some arg");

		 //Second call: prints "foo"
		 System.out.println(mockedList.set(0, "some arg"));

		 //Any consecutive call: prints "foo" as well (last stubbing wins).
		 System.out.println(mockedList.set(0, "some arg"));
		 
	}
	
	@Test
	public void test1() {
		
		mockedList.add("abc");
		
		//Alternative, shorter version of consecutive stubbing: 
		when(mockedList.set(0, "some arg"))
		   .thenReturn("one", "two", "three");
		System.out.println(mockedList.set(0, "some arg"));
		System.out.println(mockedList.set(0, "some arg"));
		System.out.println(mockedList.set(0, "some arg"));
		System.out.println(mockedList.set(0, "some arg"));
		 
	}
	
}
