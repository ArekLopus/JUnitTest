package junit.theories;

import org.junit.AfterClass;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assume.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(Theories.class)
public class NameTest2 {
	
	public static int counter = 0;
	public static int counter2 = 0;
	
	//DataPoint field or method must be static
	@DataPoints
//	public static String[] strings = new String[] {"opti", "optim" ,"opt/", "/"};
    public static String[] strings() {
		return new String[] {"opti", "optim" ,"opt/", "/"};
	}
    
    @Theory
    public void filenameIncludesUsername(String username) {
    	counter++;
    	assumeThat(username, not(containsString("/")));
    	counter2++;
        assertThat("optimus", containsString(username));
        System.out.println("Passed: "+username);
        
    }
    
    @AfterClass
	public static void afterClass() {
		System.out.println("Counter: "+counter);
		System.out.println("Counter2: "+counter2);
	}
}