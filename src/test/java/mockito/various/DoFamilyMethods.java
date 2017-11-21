package mockito.various;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DoFamilyMethods {
	
	@Mock
	private List<String> mockedList; 
	
	@Test(expected=RuntimeException.class)
	public void test() {
		//You can use doThrow(), doAnswer(), doNothing(), doReturn() and doCallRealMethod() in place of the corresponding
		//call with when(), for any method. It is necessary when you 
		// • stub void methods 
		// • stub methods on spy objects (see below) 
		// • stub the same method more than once, to change the behaviour of a mock in the middle of a test. 
 		
		doThrow(new RuntimeException()).when(mockedList).clear();
		
		//following throws RuntimeException:
		mockedList.clear();
		
		
	}
	
}
