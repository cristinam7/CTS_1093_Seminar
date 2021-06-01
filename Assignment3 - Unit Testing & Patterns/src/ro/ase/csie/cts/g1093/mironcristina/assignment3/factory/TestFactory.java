package ro.ase.csie.cts.g1093.mironcristina.assignment3.factory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFactory {

	protected static final String IP_ADDRESS = "199.136.8.71";
	protected static final int PORT_NO = 8080;
	
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
	public void testFaxServerObjectInstanceOfServerInterface() { 
		
		ServerInterface server = (FaxServer) ServerFactory.getServer(ServerType.FAX, "189.146.3.56", 5050, 1);
	
		if(!(server instanceof ServerInterface)) { 
			fail("Fax server is not an instance of ServerInterface");
		}
	
		assertTrue("Server instance correctly created", server instanceof ServerInterface);		
	}
	
	@Test
	public void testObjectsRightAttributes() {
		
		ServerInterface server = (FaxServer) ServerFactory.getServer(ServerType.FAX, IP_ADDRESS, PORT_NO, 1);
		
		assertEquals("Object correctly created, right attributes are in place", server.getIpAddress(), IP_ADDRESS);
		
		
	}
	
	

}
