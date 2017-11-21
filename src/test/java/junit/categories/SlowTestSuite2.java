package junit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(SlowTests.class)
@ExcludeCategory(FastTests.class)
@SuiteClasses( { Test1Class.class, Test2Class.class }) //Note that Categories is a kind of Suite
public class SlowTestSuite2 {
	// Will run Test1Class.b, but not Test1Class.a or Test2Class.c
}
