package junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class FixturesAnnotations {
	
	@Test
	public void justTest1() {
		System.out.println("Test #1");
		assertThat(1, equalTo(1));
	}
	@Test
	public void justTest2() {
		System.out.println("Test #2");
		assertThat(2, equalTo(2));
	}
	
	@Ignore("don't forget me! @Ignore")
	@Test
	public void justTest3() {
		System.out.println("@Ignore");
	}
	
	@After
	public void after() {
		System.out.println("@After");
	}
	@Before
	public void before() {
		System.out.println("@Before");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass");
	}
	
}