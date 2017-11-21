package coverage;

import java.util.ArrayList;
import java.util.List;

import mockito.MyClass;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class CoverageMyClass {
	
	private MyClass mc;
	
	@Before
	public void init () {
		mc = new MyClass();
		mc.setName("Arek");
		mc.setList(new ArrayList<String>());
	}
	
	@Test
	public void testMyClass() {
		assertThat(mc.getName(), equalTo("Arek"));
		assertThat(mc.getList(), instanceOf(List.class));
	}
	
}
