package mockito.inorder;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class VerificationInOrder {

	// A. Single mock whose methods must be invoked in a particular order
	@Mock
	private List<String> singleMock; 
	
	@Test
	public void test() {
		
		//using a single mock
		singleMock.add("was added first");
		singleMock.add("was added second");

		//create an inOrder verifier for a single mock
		InOrder inOrder = inOrder(singleMock);

		//following will make sure that add is first called with "was added first, then with "was added second"
		inOrder.verify(singleMock).add("was added first");
		inOrder.verify(singleMock).add("was added second");
	}
	
	
	// B. Multiple mocks that must be used in a particular order
	@Mock
	List<String> firstMock;
	@Mock
	List<String> secondMock;
	
	@Test
	public void test2() {
		
		//using mocks
		firstMock.add("was called first");
		secondMock.add("was called second");

		//create inOrder object passing any mocks that need to be verified in order
		InOrder inOrder = inOrder(firstMock, secondMock);

		//following will make sure that firstMock was called before secondMock
		inOrder.verify(firstMock).add("was called first");
		inOrder.verify(secondMock).add("was called second");

		// Oh, and A + B can be mixed together at will
	}
	
}
