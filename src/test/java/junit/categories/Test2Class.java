package junit.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({SlowTests.class, FastTests.class})
public class Test2Class {
	
	@Test
	public void c() {
		
	}
}
