package mockito.various;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class VoidMethodWithException {
	
	@Mock
	private List<String> mockedList; 
	
	@Test(expected=RuntimeException.class)
	public void test() {
	
		doThrow(new RuntimeException("MyExceptionInfo")).when(mockedList).clear();
		
		mockedList.clear();
	}
	
	
}
