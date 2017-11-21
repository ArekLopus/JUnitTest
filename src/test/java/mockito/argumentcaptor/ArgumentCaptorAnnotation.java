package mockito.argumentcaptor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArgumentCaptorAnnotation {
	
	@Mock()
	private List<String> mockedList; 
	
	@Captor
	ArgumentCaptor<String> argument;

	@Test
	public void test2() {
		
		mockedList.add("abc");
		
		verify(mockedList).add(argument.capture());
		assertEquals("abc", argument.getValue());
	}
}
