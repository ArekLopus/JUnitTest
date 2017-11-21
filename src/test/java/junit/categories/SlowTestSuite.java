package junit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(SlowTests.class)
@SuiteClasses( { Test1Class.class, Test2Class.class }) // Note that Categories is a kind of Suite
public class SlowTestSuite {
	// Will run Test1Class.b and Test2Class.c, but not Test1Class.a
}
