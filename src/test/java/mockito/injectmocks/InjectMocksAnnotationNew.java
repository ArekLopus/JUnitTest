package mockito.injectmocks;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import mockito.MyClass;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class InjectMocksAnnotationNew {
	
	@Mock
	private List<String> mockList;
	@InjectMocks
	private MyClass retriever;
	
	@Test
	public void testingMockito() {
		when(mockList.get(0)).thenReturn("Arek");	//if req .get(0) then return "Arek"
		assertThat(retriever.getList().get(0), is("Arek"));
	}
	
}
