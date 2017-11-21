package junit.theories;

import static org.junit.Assume.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.AfterClass;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class AdditionWithTheoriesStringTest {
	
	public static int counter = 0;
	public static int counter2 = 0;
	
	@DataPoints
	public static String[] integers() {
		return new String[]{"a", "b", "c", "d", "e"};
	}

	@Theory
	public void addStrings(String a, String b) {
		counter++;
		assumeThat("a", is(not(a)));
		counter2++;
		assertThat(a, instanceOf(String.class));
		assertThat(b, instanceOf(String.class));
		System.out.print(a+b+", ");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("\nCounter: "+counter);
		System.out.println("Counter2: "+counter2);
	}
	
}