package mockito;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReadyToMock {
	
	@Mock()
	private List<String> mockedList; 
	
	@Test
	public void test() {
		
	}
	
}
