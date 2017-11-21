package mockito.various;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class OneLineStub {
	
	private List<String> list = when(mock(List.class).get(0)).thenReturn("Arek").getMock(); 
	
	@Test
	public void test() {
		
		assertThat("Arek", equalTo(list.get(0)));
		
	}
	
}
