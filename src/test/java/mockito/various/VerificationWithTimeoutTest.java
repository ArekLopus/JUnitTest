package mockito.various;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class VerificationWithTimeoutTest {
	
	@Mock()
	private List<String> mock; 
	
	@Test
	public void test() {
		mock.size();
		
		//passes when someMethod() is called within given time span
		verify(mock, timeout(100)).size();
		//above is an alias to:
		verify(mock, timeout(100).times(1)).size();
		
		mock.size();
		
		//passes when someMethod() is called *exactly* 2 times within given time span
		verify(mock, timeout(100).times(2)).size();

		//passes when someMethod() is called *at least* 2 times within given time span
		verify(mock, timeout(100).atLeast(2)).size();

		//verifies someMethod() within given time span using given verification mode
		//useful only if you have your own custom verification modes.
		//verify(mock, new Timeout(100, yourOwnVerificationMode)).someMethod();
	}
	
}
