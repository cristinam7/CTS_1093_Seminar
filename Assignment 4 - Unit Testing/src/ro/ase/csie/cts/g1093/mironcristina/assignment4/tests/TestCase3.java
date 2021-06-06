package ro.ase.csie.cts.g1093.mironcristina.assignment4.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1093.mironcristina.assignment4.classes.Product;
import ro.ase.csie.cts.g1093.mironcristina.assignment4.exceptions.WrongProductWeeklySalesExecption;

public class TestCase3 {
	
	Product product;
	public static  String productName;
	public static  float price;
	public static  ArrayList<Integer> sales;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		productName = "Puzzle";
		price = 25.5f;
		
		sales = new ArrayList<Integer>();
		sales.add(1);
		sales.add(1000);	
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
	
	
	@Category(RightTests.class)
	@Test
	public void testGetPercentOfBadWeeksRight() throws WrongProductWeeklySalesExecption {
		int actualValue = product.getPercentOfBadWeeks(1000);
		assertEquals(50, actualValue);
	}

	
	@Category(RightTests.class)
	@Test
	public void testGetWeeksIndexWithMaxSalesRight() throws WrongProductWeeklySalesExecption {
		
		ArrayList<Integer> expectedArray = new ArrayList<Integer>();
		expectedArray.add(1);
		ArrayList<Integer> actualArray = product.getWeeksIndexWithMaxSales();
		for (int i = 0; i < expectedArray.size(); i++) {
			assertEquals(expectedArray.get(i), actualArray.get(i));
		}
	}

	@Test
	public void testGetPercentOfBadWeeksInverse() throws WrongProductWeeklySalesExecption {
		int actualValue = product.getPercentOfBadWeeks(Product.SOLD_ITEMS_MAX_VALUE) * sales.size() / 100;
		assertEquals(1, actualValue);
	}
	
	@Test
	public void testGetWeeksIndexWithMaxSalesInverse() throws WrongProductWeeklySalesExecption {
		
		int expectedValue = product.getNoWeeksAboveLimit(product.getMaxSales() - 1);
		int actualValue = product.getWeeksIndexWithMaxSales().size();
		assertEquals(expectedValue, actualValue);
	}
	
	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testGetPercentOfBadWeeksErrorCondition() throws WrongProductWeeklySalesExecption {
		ArrayList<Integer> emptyArray = new ArrayList<Integer>();
		product.setSales(emptyArray);
		product.getPercentOfBadWeeks(100);
	}
	
	@Test
	public void testGetPercentOfBadWeeksOrdering() throws WrongProductWeeklySalesExecption {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(20);
		testArray.add(75);
		testArray.add(120);
		testArray.add(300);
		product.setSales(testArray);
		int actualValue = product.getPercentOfBadWeeks(100);
		
		assertEquals(50, actualValue);
	}

}
