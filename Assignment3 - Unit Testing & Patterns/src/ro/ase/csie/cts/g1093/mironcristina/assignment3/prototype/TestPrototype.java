package ro.ase.csie.cts.g1093.mironcristina.assignment3.prototype;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPrototype {

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
	public void testPrototypeDifferentObjects() throws CloneNotSupportedException { 
		
		Server server1 = new Server("192.158. 1.38", 5000, 5);
		Server server2 = (Server) server1.clone(); 
		
		if(server1 == server2) { 
			fail("Server1 and server2 are the same object");
		}
		
		assertNotEquals("Instances must be differnt", server1, server2);
	}
	
	@Test
	public void testPrototypeChangingOneField() throws CloneNotSupportedException { 
		
		Server server1 = new Server("192.158. 1.38", 5000, 5);
		Server server2 = (Server) server1.clone();
		
		server2.port = 8080;
		
		if(server1.getPort() == 8080) { 
			fail("Changes made in server2 are reflected in server1");
		}
		
		assertNotEquals(server1.getPort(), server2.getPort());
	}

}
