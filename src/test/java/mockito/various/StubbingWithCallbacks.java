package mockito.various;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

@RunWith(MockitoJUnitRunner.class)
public class StubbingWithCallbacks {
	
	@Mock
	private List<String> mockedList; 
	
	@Test
	public void test() {
		
		when(mockedList.set(0, "foo")).thenAnswer(new Answer<String>() {
			public String answer(InvocationOnMock invocation) {
				Object[] args = invocation.getArguments();
		        //Object mock = invocation.getMock();
		        return "called with arguments: "+ Arrays.asList(args);
		    }
		});

		//Following prints "called with arguments: 0, foo"
		System.out.println(mockedList.set(0, "foo"));
	}
	
}
