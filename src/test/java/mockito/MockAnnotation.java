package mockito;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockAnnotation {
	
	@Mock
	private List<String> mockedList; 
	
	@Test
	public void test() {
		
		mockedList.add("abc");
		verify(mockedList, atLeastOnce()).add("abc");
		 
	}
	

	
}
