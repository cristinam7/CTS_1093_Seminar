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

import ro.ase.csie.cts.g1093.mironcristina.assignment4.classes.Product;
import ro.ase.csie.cts.g1093.mironcristina.assignment4.exceptions.WrongProductNameException;
import ro.ase.csie.cts.g1093.mironcristina.assignment4.exceptions.WrongProductPriceValueException;
import ro.ase.csie.cts.g1093.mironcristina.assignment4.exceptions.WrongProductWeeklySalesExecption;

public class TestCase1 {

	
	static Product product; 
	static String name = "DefaultProduct"; 
	static float price = 10f; 
	private static ArrayList<Integer> itemsSoldPerWeek;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		itemsSoldPerWeek = new ArrayList<Integer>();
		itemsSoldPerWeek.add(50);
		itemsSoldPerWeek.add(84);
		itemsSoldPerWeek.add(22);
		
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		product = new Product(name, price, itemsSoldPerWeek);
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	//test for name conformance for the first constructor, the one with only 2 params
	@Test
	public void testConstructorNameConformanceForRightInput() throws WrongProductNameException, WrongProductPriceValueException { 
		
		//expected 
		String expectedName = "Shampoo";
		Product prod = new Product(expectedName, price); 
	
		assertEquals(expectedName, prod.getName());	
	}
	
	
	@Test
	public void testConstructorPriceConformanceForRightInput() throws WrongProductNameException, WrongProductPriceValueException { 
		
		//expected 
		String expectedName = "Shampoo";
		float expectedPrice = 15.5f;
		Product prod = new Product(expectedName, expectedPrice); 
	
		assertEquals(expectedPrice, prod.getPrice(), 0);	
	}
	
	@Test
	public void testConstructorWith3ParametersNameConformanceRightInput() throws WrongProductNameException, WrongProductPriceValueException, WrongProductWeeklySalesExecption { 
		
		//expected 
		String expectedName = "ProductName";
		Product prod = new Product(expectedName, price,itemsSoldPerWeek); 
		
		String actualName = prod.getName();
	
		assertEquals("Testing with the right input name",expectedName, actualName);	
	}
	
	
	
	//ERROR CONDITONS
	
	@Test(expected = WrongProductNameException.class)
	public void testConstructorWith2ParametersNameErrorCondition() throws WrongProductNameException, WrongProductPriceValueException {
		
		String productName = "Pro";
		Product newProduct = new Product(productName, price);		
	}
	
	@Test(expected = WrongProductPriceValueException.class)
	public void testConstructorWith2ParametersProductPriceErrorCondition() throws WrongProductPriceValueException, WrongProductNameException { 
		
		float highPrice = Product.PRICE_MAX_VALUE + 10; 
		Product newProduct = new Product(name, highPrice);
		
	}
	
	
	@Test(expected = WrongProductNameException.class)
	public void testConstructorWith3ParametersNameErrorCondition() throws WrongProductNameException, WrongProductWeeklySalesExecption {
		
		String productName = "Product#Name@";
		Product newProduct = new Product(productName, price,itemsSoldPerWeek);		
	}
	
	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testConstructor3ParamsWeeklySalesErrorCondition() throws WrongProductWeeklySalesExecption, WrongProductNameException { 
		
		ArrayList<Integer> wrongSales = new ArrayList<Integer>();
		wrongSales.add(-20);
		wrongSales.add(-5);
		Product newProduct = new Product(name, price, wrongSales);
			
	}
	
	//TODO : revino aici ?! not sure if its right
	//reference test for the constructor that takes the arrayList 
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
	
	
	
	//setSales Reference test
	@Test
	public void testSetSalesReference() throws WrongProductWeeklySalesExecption { 
		
		ArrayList<Integer> newSales = new ArrayList<Integer>(); 
		newSales.add(30);
		newSales.add(150);
		newSales.add(55);
		product.setSales(newSales);
		
		ArrayList<Integer> cloneSales = (ArrayList<Integer>) newSales.clone();
		newSales.set(2, Product.SOLD_ITEMS_MIN_VALUE + 10); 
		
		assertNotEquals(cloneSales.get(2), newSales.get(2));	
	}

	
	//setSales Existence test 
	@Test(expected = WrongProductWeeklySalesExecption.class)
	public void testSetSalesExistenceNullReferencePassed() throws WrongProductWeeklySalesExecption { 	
		ArrayList<Integer> nullSales = null;
		product.setSales(nullSales);	
	}
	

}
