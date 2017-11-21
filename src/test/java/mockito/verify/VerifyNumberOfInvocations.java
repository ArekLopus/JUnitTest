package mockito.verify;

import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class VerifyNumberOfInvocations {
	
	@Mock
	private List<String> mockList; 
	
	@Test
	public void testingMockito() {
		//mockedList.size();
		mockList.size();
		
		//following two verifications work exactly the same - times(1) is used by default
		verify(mockList).size();
		verify(mockList, atLeast(1)).size();
		
		//exact number of invocations verification
		verify(mockList, times(1)).size();
		
		//verification using never(). never() is an alias to times(0)
		verify(mockList, never()).remove("bla");
		
		//atLeast/atMost
		verify(mockList, atLeastOnce()).size();
		verify(mockList, atLeast(1)).size();
		verify(mockList, atMost(5)).size();
		
		//checking if given method was the only one invoked
		verify(mockList, only()).size();
		
		
	}
	
	
	
}
