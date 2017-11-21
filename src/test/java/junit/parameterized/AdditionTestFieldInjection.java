package junit.parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AdditionTestFieldInjection {
	
	//fields must be public!
	@Parameter  //first data value (0) is default
    public int expected;
	@Parameter(value = 1)
    public int first;
	@Parameter(value = 2)
	public int second;


    @Parameters
    public static Collection<Integer[]> addedNumbers() {
    	return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 }, { 7, 3, 4 }, { 9, 4, 5 }, });
    }

    @Test
    public void sum() {
        System.out.println("Addition with parameters : " + first + " and " + second + ", expected: " + expected);
        assertEquals(expected, addNumbers(first, second));
    }
    
    
    
    public int addNumbers(int a, int b){
    	int sum = a + b;
    	return sum;
    }
    
}