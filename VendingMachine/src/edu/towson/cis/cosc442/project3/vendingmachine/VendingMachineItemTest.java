package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class VendingMachineItemTest.
 */
public class VendingMachineItemTest {

	/** The choc. */
	private VendingMachineItem choc;
	
	/** The pro. */
	private VendingMachineItem pro;
	
	/** The gat. */
	private VendingMachineItem gat; 
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		 choc = new VendingMachineItem("Chocolate Bar", 3.25);
		 pro = new VendingMachineItem("Protein Bar", 4.00);
		 gat = new VendingMachineItem("Gatorade", 2.50);
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		choc  = null;
		pro = null;
		gat = null;
	}

	
	/**
	 * Test item constructor.
	 */
	@Test 
	public void testItemConstructor() {
		VendingMachineItem testCon = new VendingMachineItem("Skittles",1.25);
		assertNotNull(testCon);
		assertEquals(testCon.getName(), "Skittles");
		assertEquals(testCon.getPrice(), 1.25,.001);
		
		
		
	}
	/**
	 * Test get item name.
	 */
	@Test
	public void testGetName() {
		assertEquals("Chocolate Bar",choc.getName());
	}
	
	/**
	 * Test get item price.
	 */
	@Test
	public void testGetItemPrice() {
		assertEquals(3.25, choc.getPrice(), .0001);
	}

}
