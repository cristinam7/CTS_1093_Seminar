package ro.ase.csie.cts.g1093.mironcristina.assignment4.tests;

import static org.junit.Assert.*;

import java.time.temporal.WeekFields;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1093.mironcristina.assignment4.classes.Product;
import ro.ase.csie.cts.g1093.mironcristina.assignment4.exceptions.WrongProductNameException;
import ro.ase.csie.cts.g1093.mironcristina.assignment4.exceptions.WrongProductPriceValueException;
import ro.ase.csie.cts.g1093.mironcristina.assignment4.exceptions.WrongProductWeeklySalesExecption;

public class TestCase1 {

	
	static Product product; 
	static String name = "Puzzle"; 
	static float price = 25.5f; 
	private static ArrayList<Integer> sales;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sales = new ArrayList<Integer>();
		sales.add(50);
		sales.add(84);
		sales.add(22);
		
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		product = new Product(name, price, sales);
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
	public void testConstructorNameConformanceForRightInput() throws WrongProductNameException, WrongProductPriceValueException { 
		
		String expectedName = "Shampoo";
		Product prod = new Product(expectedName, price); 
		assertEquals("Testing constructor with 2 params name conformance",expectedName, prod.getName());	
	}
	
	@Category(RightTests.class)
	@Test
	public void testConstructorPriceConformanceForRightInput() throws WrongProductNameException, WrongProductPriceValueException { 
		 
		String expectedName = "Shampoo";
		float expectedPrice = 15.5f;
		Product prod = new Product(expectedName, expectedPrice); 
		assertEquals("Testing constructor with 2 params for price conformance",expectedPrice, prod.getPrice(), 0);	
	}
	
	@Category(RightTests.class)
	@Test
	public void testConstructorWith3ParametersNameConformanceRightInput() throws WrongProductNameException,
														WrongProductPriceValueException, WrongProductWeeklySalesExecption { 
		String expectedName = "ProductName";
		Product prod = new Product(expectedName, price,sales); 		
		String actualName = prod.getName();
		assertEquals("Testing onstructor with 3 params for name conformance",expectedName, actualName);	
	}
	
	@Category(RightTests.class)
	@Test
	public void testConstructorWith3ParametersPriceConformanceRightInput() throws WrongProductNameException,
														WrongProductPriceValueException, WrongProductWeeklySalesExecption { 
		float expectedPrice = 32.2f;
		Product prod = new Product(name, expectedPrice,sales); 		
		assertEquals(expectedPrice, prod.getPrice(), 0);
	}
		
	//ERROR CONDITONS
	
	@Test(expected = WrongProductNameException.class)
	public void testConstructorWith2ParametersNameErrorCondition() throws WrongProductNameException, WrongProductPriceValueException {
		
		String shortName = "Pro";
		Product newProduct = new Product(shortName, price);		
	}
	
	@Test(expected = WrongProductPriceValueException.class)
	public void testConstructorWith2ParametersProductPriceErrorCondition() throws WrongProductPriceValueException, WrongProductNameException { 
		
		float highPrice = Product.PRICE_MAX_VALUE + 10; 
		Product newProduct = new Product(name, highPrice);	
	}
	
	
	@Test(expected = WrongProductNameException.class)
	public void testConstructorWith3ParametersNameErrorCondition() throws WrongProductNameException, WrongProductWeeklySalesExecption {
		
		String productName = "Product#N@me_"; 
		Product newProduct = new Product(productName, price,sales);		
	}
	
	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testConstructor3ParamsWeeklySalesErrorCondition() throws WrongProductWeeklySalesExecption, WrongProductNameException { 
		
		ArrayList<Integer> wrongSales = new ArrayList<Integer>();
		wrongSales.add(-20);
		wrongSales.add(-5);
		Product newProduct = new Product(name, price, wrongSales);
			
	}
	
	@Test 
	public void testConstructor3ParametersArrayListReference() throws WrongProductNameException, WrongProductWeeklySalesExecption { 
		ArrayList<Integer> inputSales = new ArrayList<Integer>();
		inputSales.add(5);
		Product newProduct = new Product(name, price, inputSales);
		
		ArrayList<Integer> cloneSales = (ArrayList<Integer>) inputSales.clone();
		
		inputSales.set(0, Product.SOLD_ITEMS_MAX_VALUE - 5);
		
		for(int i = 0 ; i < cloneSales.size() ; i++) { 
			assertEquals(cloneSales.get(i), newProduct.getSoldItems(i), 0);
		}	
	}
	
	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testConstructor3ParametersArrayListExistence() throws WrongProductNameException, WrongProductWeeklySalesExecption {
		ArrayList<Integer> nullSales = null;
		Product prod = new Product(name, price, nullSales);
	}
	
	@Test
	public void testSetSalesReference() throws WrongProductWeeklySalesExecption { 
		
		ArrayList<Integer> newSales = new ArrayList<Integer>(); 
		newSales.add(30);
		newSales.add(40);
		product.setSales(newSales);
		
		ArrayList<Integer> cloneSales = (ArrayList<Integer>) newSales.clone();
		newSales.set(1, Product.SOLD_ITEMS_MIN_VALUE + 10); 
		
		assertNotEquals(cloneSales.get(1), newSales.get(1));	
	}

	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testSetSalesExistence() throws WrongProductWeeklySalesExecption { 	
		ArrayList<Integer> nullSales = null;
		product.setSales(nullSales);	
	}
}
