package mockito.various;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ResetMock {
	
	@Mock()
	private List<String> mockedList; 
	
	@SuppressWarnings("unchecked")
	@Test(expected=AssertionError.class)
	public void test() {
		when(mockedList.size()).thenReturn(1);
		
		assertThat(1, equalTo(mockedList.size()));
		
		reset(mockedList);

		//at this point the mock forgot any interactions & stubbing
		assertThat(1, equalTo(mockedList.size()));		// throws AssertionError
		
	}
	
}