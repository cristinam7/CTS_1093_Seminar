package ro.ase.csie.cts.g1093.mironcristina.assignment4.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1093.mironcristina.assignment4.classes.Product;
import ro.ase.csie.cts.g1093.mironcristina.assignment4.exceptions.WrongProductWeeklySalesExecption;

public class TestCase2 {
	
	Product product;
	public static String productName;
	public static float price;
	public static ArrayList<Integer> sales;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		productName = "Puzzle";
		price = 25.5f;
	
		sales = new ArrayList<Integer>();
		sales.add(100);
		sales.add(150);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		product = new Product(productName, price, sales);
	}

	@After
	public void tearDown() throws Exception {
			
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	//RIGHT TESTS
	@Category(RightTests.class)
	@Test
	public void testAddWeekRight() throws WrongProductWeeklySalesExecption { 
		
		int expectedValue = Product.SOLD_ITEMS_MIN_VALUE + 10; 
		product.addWeek(expectedValue);
		int actualValue = product.getSoldItems(sales.size()); 
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Category(RightTests.class)
	@Test
	public void testgetSoldItemsRight() throws WrongProductWeeklySalesExecption {
		int expectedValue = sales.get(0);
		int actualValue = product.getSoldItems(0);

		assertEquals(expectedValue, actualValue);
	}
	
	@Category(RightTests.class)
	@Test
	public void testGetNoWeeksAboveLimitRight() throws WrongProductWeeklySalesExecption {
		int expectedValue = 2;
		int actualValue = product.getNoWeeksAboveLimit(Product.SOLD_ITEMS_MIN_VALUE);
		assertEquals(expectedValue, actualValue);
	}

	
	//RANGE TESTS
	
	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testAddWeekRange() throws WrongProductWeeklySalesExecption {
		int highValue = Product.SOLD_ITEMS_MAX_VALUE + 1;
		product.addWeek(highValue);
	}
		
	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testGetSoldItemsBelowLimitRange() throws WrongProductWeeklySalesExecption {
		product.getSoldItems(-1);
	}
	
	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testGetSoldItemsAboveLimitRange() throws WrongProductWeeklySalesExecption {
		product.getSoldItems(2000);
	}

	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testGetNoWeeksBelowLimitRange() throws WrongProductWeeklySalesExecption {
		product.getNoWeeksAboveLimit(Product.SOLD_ITEMS_MIN_VALUE - 1);
	}
				
	//BOUNDARY TESTS
	
	@Test
	public void testAddWeekLowerBoundary() throws WrongProductWeeklySalesExecption {
		product.addWeek(Product.SOLD_ITEMS_MIN_VALUE);
		int actualValue = product.getSoldItems(product.getSalesNumber() - 1);

		assertEquals("Testing with the sold items lower limit", Product.SOLD_ITEMS_MIN_VALUE, actualValue);
	}
	
	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testAddWeekBelowLowerBoundary() throws WrongProductWeeklySalesExecption {
		product.addWeek(Integer.MIN_VALUE);
	}

	@Test
	public void testAddWeekHigherBoundary() throws WrongProductWeeklySalesExecption {

		product.addWeek(Product.SOLD_ITEMS_MAX_VALUE);
		int actualValue = product.getSoldItems(product.getSalesNumber() - 1);

		assertEquals("Testing with the sold items upper limit", Product.SOLD_ITEMS_MAX_VALUE, actualValue);
	}

	@Test
	public void testGetSoldItemsLowerBoundary() throws WrongProductWeeklySalesExecption {
		int expectedValue = sales.get(0);
		int actualValue = product.getSoldItems(0);

		assertEquals("Testing get sold items lower limit",expectedValue, actualValue);
	}

	@Test
	public void testGetSoldItemsHigherBoundary() throws WrongProductWeeklySalesExecption {
		int expectedValue = sales.get(sales.size() - 1);
		int actualValue = product.getSoldItems(product.getSalesNumber() - 1);

		assertEquals("Testing get sold items upper limit",expectedValue, actualValue);
	}

	@Test
	public void testGetNoWeeksAboveLimitLowerBoundary() throws WrongProductWeeklySalesExecption {
		int actualValue = product.getNoWeeksAboveLimit(Product.SOLD_ITEMS_MIN_VALUE);

		assertEquals(2, actualValue);
	}

	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testGetNoWeeksAboveHigherBoundary() throws WrongProductWeeklySalesExecption {
		product.getNoWeeksAboveLimit(Product.SOLD_ITEMS_MAX_VALUE + 1);
	}

	//CARDINALITY

	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testGetNoWeeksAboveLimitCardinalityZero() throws WrongProductWeeklySalesExecption {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		product.setSales(testArray);
		product.getNoWeeksAboveLimit(1);
	}

	@Test
	public void testGetNoWeeksAboveLimitCardinalityOne() throws WrongProductWeeklySalesExecption {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(50);
		product.setSales(testArray);
		int expectedValue = 1;
		int actualValue = product.getNoWeeksAboveLimit(1);

		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testGetNoWeeksAboveLimitCardinalityN() throws WrongProductWeeklySalesExecption {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(50);
		testArray.add(60);
		testArray.add(70);
		product.setSales(testArray);
		int expectedValue = 3;
		int actualValue = product.getNoWeeksAboveLimit(1);

		assertEquals(expectedValue, actualValue);
	}
	
	
	//ORDERING

	@Test
	public void testGetNoWeeksAboveLimitOrderingAscending() throws WrongProductWeeklySalesExecption {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(5);
		testArray.add(19);
		testArray.add(22);
		testArray.add(28);
		testArray.add(64);
		product.setSales(testArray);
		int expectedValue = 4;
		int actualValue = product.getNoWeeksAboveLimit(5);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testGetNoWeeksAboveLimitOrderingDescending() throws WrongProductWeeklySalesExecption {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(55);
		testArray.add(48);
		testArray.add(31);
		testArray.add(12);
		testArray.add(7);
		product.setSales(testArray);
		int expectedValue = 3;
		int actualValue = product.getNoWeeksAboveLimit(20);

		assertEquals(expectedValue, actualValue);
	}

	//PERFORMANCE
	
	@Test(timeout = 3000)
	public void testGetNoWeeksAboveLimitPerformance() throws WrongProductWeeklySalesExecption {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		for (int i = 0; i < 1000 ; i++) {
			 testArray.add(Product.SOLD_ITEMS_MAX_VALUE);
		}
		product.setSales(testArray);
		int actualValue = product.getNoWeeksAboveLimit(0);

		assertEquals("Testing if the return weeks are 1000 under 3 seconds",1000, actualValue);
	}
	

	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testAddWeekErrorCondition() throws WrongProductWeeklySalesExecption {
		product.addWeek(Product.SOLD_ITEMS_MIN_VALUE - 1);
	}

	
	//EXISTENCE
	
	@Test
	public void testAddWeekExistence() throws WrongProductWeeklySalesExecption {
		int expectedValue = 200;
		product.addWeek(expectedValue);
		int actualValue = product.getSoldItems(product.getSalesNumber() - 1);

		assertEquals(expectedValue, actualValue);
	}
	
}
