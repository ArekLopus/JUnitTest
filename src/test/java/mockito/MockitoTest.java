package mockito;

import java.util.List;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
	
	@Mock
	private List<String> mockList;
	
	@Test
	public void testingMockito() {
		
		when(mockList.get(0)).thenReturn("Arek");	//if req .get(0) then return "Arek"
		
		assertThat(mockList.get(0), is("Arek"));
		assertSame(mockList.get(0), "Arek");
		
	}
	
}	 