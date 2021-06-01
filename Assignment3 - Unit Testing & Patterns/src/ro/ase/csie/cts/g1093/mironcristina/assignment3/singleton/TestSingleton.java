package ro.ase.csie.cts.g1093.mironcristina.assignment3.singleton;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSingleton {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testServerSingletonSameInstance() {
		
		Server server1 = Server.getInstance(); 
		Server server2 = Server.getInstance();
		
		if(server2 != server1) { 
			fail("S1 and S2 are two different instances"); 
		}
		
		assertSame("The two instances are refering the same obj", server1, server2);		
	}
	
	@Test
	public void testInstancesFieldChanges() { 
		
		Server server1 = Server.getInstance(); 
		Server server2 = Server.getInstance();
		
		server2.connect(); //this should be seen on server1 as well
		
		assertTrue("Changes in one instance can be seen on the other one", server1.checkConnection());
			
	}

}
