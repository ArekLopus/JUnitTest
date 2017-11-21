package mockito.injectmocks;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import mockito.MyClass;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class InjectMocksAnnotation {
	
	@Mock
	private List<String> mockList;
	@InjectMocks
	private MyClass retriever;
	
	
	@Before
	public void initialize() {
		retriever = new MyClass();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testingMockito() {
		when(mockList.get(0)).thenReturn("Arek");	//if req .get(0) then return "Arek"
		assertThat(retriever.getList().get(0), is("Arek"));
		
	}
	
}
