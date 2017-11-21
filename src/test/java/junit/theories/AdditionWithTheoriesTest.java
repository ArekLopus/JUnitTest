package junit.theories;

import static org.junit.Assume.*;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class AdditionWithTheoriesTest {
	
	public static int counter = 0;
	public static int counter2 = 0;
	
	@DataPoints
	public static int[] integers() {
		return new int[]{-1, -10, -11, -1234567, 1, 10, 1234, 53535354};
	}

	@Theory
	public void a_plus_b_is_greater_than_a_and_greater_than_b(Integer a, Integer b) {
		counter++;
		assumeTrue(a >0 && b > 0 );
		counter2++;
		assertTrue(a + b > a);
		assertTrue(a + b > b);
		
	}

	@Theory
	public void addition_is_commutative(Integer a, Integer b) {
		assertTrue(a + b == b + a);
	}
	
	//We have 7 items in the array
	//There is 64 passes before assume (8*8 - all possible (Cartesian product?) )
	//There is 16 passes after assume (4*4 - only > 0)
	@AfterClass
	public static void afterClass() {
		System.out.println("Counter: "+counter);
		System.out.println("Counter2: "+counter2);
	}
	
}