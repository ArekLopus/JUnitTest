package junit.assume;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assume.*;

public class AssumePassTest {
	
    @Test
    public void testA(){
        int x = 7;
        assumeThat( x, is(7) );
        System.out.println("assumption is true!");
    }
}
