package mockito.various;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FindRedundantInvocation {
	
	@Mock
	List<String> mockedList;
	
	@Test
	public void test() {
		
		//using mocks
		mockedList.add("one");
		mockedList.add("two");

		verify(mockedList).add("one");

		//following verification will fail
		verifyNoMoreInteractions(mockedList);
	}
	

	
}
