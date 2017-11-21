package junit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(FastTests.class)
@SuiteClasses( { Test1Class.class, Test2Class.class }) //Note that Categories is a kind of Suite
public class FastTestSuite {
	// Will run Test2Class.c
}
