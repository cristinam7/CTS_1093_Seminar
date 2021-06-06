package ro.ase.csie.cts.g1093.mironcristina.assignment4.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ TestCase1.class, TestCase2.class, TestCase3.class })
@IncludeCategory({RightTests.class})
public class RightTests {

}
