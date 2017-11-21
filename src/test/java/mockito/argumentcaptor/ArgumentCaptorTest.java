package mockito.argumentcaptor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArgumentCaptorTest {
	
	@Mock()
	private List<String> mockedList; 
	
	@Test
	public void test() {
		
		mockedList.add("abc");
		
		ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
		verify(mockedList).add(argument.capture());
		assertEquals("abc", argument.getValue());
	}
	
}
