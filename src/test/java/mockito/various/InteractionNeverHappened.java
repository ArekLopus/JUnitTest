package mockito.various;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InteractionNeverHappened {
	
	@Mock
	List<String> mockOne;
	@Mock
	List<String> mockTwo;
	@Mock
	List<String> mockThree;
	
	@Test
	public void test() {
		 
		 //using mocks - only mockOne is interacted
		 mockOne.add("one");

		 //ordinary verification
		 verify(mockOne).add("one");

		 //verify that method was never called on a mock
		 verify(mockOne, never()).add("two");

		 //verify that other mocks were not interacted
		 verifyZeroInteractions(mockTwo, mockThree);
	}
	

	
}
