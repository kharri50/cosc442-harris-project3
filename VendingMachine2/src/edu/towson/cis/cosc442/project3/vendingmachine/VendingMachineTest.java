package edu.towson.cis.cosc442.project3.vendingmachine;

import org.junit.*;
import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 * The class <code>VendingMachineTest</code> contains tests for the class <code>{@link VendingMachine}</code>.
 *
 * @generatedBy CodePro at 3/1/18 5:02 PM
 * @author kyleharris
 * @version $Revision: 1.0 $
 */
public class VendingMachineTest {
	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	
	
	/** The vm. */
	private VendingMachine vm;
	
	/** The vmi. */
	private VendingMachineItem vmi;
	
	/** list of Vendingmachine items implemented as an ArrayList **/
	
	private ArrayList<VendingMachineItem> item_list;
	
	private String [] codes = {"A", "B","C","D"};
	
	
	

	@Test
	public void testVendingMachine_1()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.returnChange(), 1.0);
		assertEquals(0.0, result.getBalance(), 1.0);
	}

	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test
	public void testVendingMachine_2()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.returnChange(), 1.0);
		assertEquals(0.0, result.getBalance(), 1.0);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testGetItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test
	public void testMakePurchase_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test
	public void testMakePurchase_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test
	public void testMakePurchase_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// create a new vending machine object 
				vm = new VendingMachine();
				 
				item_list = new ArrayList<VendingMachineItem>();
				 
				// just for fun, lets make an array of 5 items with random prices
				int item_count = 5;
				Random r = new Random();
				DecimalFormat f = new DecimalFormat("##.00");

				for(int i = 0; i<item_count; i++) {
					// random price from 1 - 8 
					double randomPrice =  1 + (8 * r.nextDouble());
					double roundedPrice = Math.round(randomPrice);
					// make a random name for the testing item 
					String itemName = "Testing Item "+ Integer.toString(i);
					// add the item to the list 
					item_list.add(new VendingMachineItem(itemName, roundedPrice));
				}
				assertEquals(item_list.size(),item_count);
	}
	
	
	/**
	 * Tests the addition of an item to the vending machine.
	 */
	@Test 
	public void addItemTest(){
	
		// loop through and add to the arraylist
		for(int i = 0; i<item_list.size()-1; i++) {
			vm.addItem(item_list.get(i), codes[i]);
		}
		
		// try to add a new item and catch the exception.. for each slot!
		for(int i = 0; i<4; i++) {
			boolean thrown = false;
			try {
				vm.addItem(item_list.get(i), codes[i]);
			}catch(VendingMachineException e) {
				// error caught 
				thrown = true;
			}
			// the exception was thrown
			assertTrue(thrown);
		}
	}
	
	@Test 
	public void removeItemTest() throws Exception {
		// add the items to the vending machine
		addItemTest();
		
		/* this is going to test removal of all items in the vending machine 
		 * from each slot */
	
		for(int i =0; i<codes.length; i++) {
			VendingMachineItem testItem = vm.removeItem(codes[i]);
			// verify that it matches the ArrayList item at the given index.
			assertEquals(testItem, item_list.get(i));
		}
		
		
		//try to remove an item and catch the exception.. for each slot!
				for(int i = 0; i<4; i++) {
					boolean thrown = false;
					try {
						vm.removeItem(codes[i]);
					}catch(VendingMachineException e) {
						// error caught 
						String expectedMessage = "Slot "+codes[i]+" is empty -- cannot remove item";
						// check that the exception message is correct.. 
						assertEquals(e.getMessage(), expectedMessage);
						thrown = true;
					}
					// the exception was thrown
					assertTrue(thrown);
				}
	}
	
	/** Tests the getItem function in the VendingMachine class **/
	@Test 
	public void getItem() {
		// add the items to the vending machine
		addItemTest();
		/* this loop does pretty much the same this as everything else */
		testItemEquality();
		// now test that it throws an exception 
		String invalid = "E";
		boolean thrown = false;
		try {
			vm.getItem(invalid);
		}catch(VendingMachineException e) {
			thrown =  true;
		}
		assertTrue(thrown);
			
	}


	private void testItemEquality() {
		for(int i =0; i<codes.length; i++) {
			VendingMachineItem testItem = vm.getItem(codes[i]);
			// verify that it matches the ArrayList item at the given index.
			assertEquals(testItem, item_list.get(i));
		}
	}
	
	
	
	
	
	@Test 
	public void testMakePurchase() {
		// okay, now we're going to purchase things
		addItemTest(); // add items to the vending machine 
		
		// loop through the ArrayList to get the needed amount of money
		double required_amount = 0;
		for(int i = 0; i<item_list.size()-1; i++) {
			required_amount+=item_list.get(i).getPrice();
		}
		
		double expected_amount = required_amount; 

		vm.insertMoney(required_amount);
		assertEquals(vm.getBalance(), required_amount, .001);

		/* now we should be able to buy everything with the 
		 * current balance
		 */ 
		
		// all codes should be filled, so purchase each one 
		int i = 0;
		for(String code : codes) {
			if(vm.makePurchase(code)) {
				/* subtract the expected balance if the purchase
				   is successful */
				expected_amount -= item_list.get(i).getPrice();
			}
			i++;
		}
		assertEquals(expected_amount, 0, .001);
		// now check that the balance is equal to the expected amount
		assertEquals(vm.getBalance(), expected_amount, .001);
		System.out.println(item_list.get(4).getPrice());
		System.out.println(vm.getBalance());
		
		// now try to remove the last item 
		//assertTrue(vm.makePurchase(code))
	}
	
	@Test 
	public void testReturnChange() {
		addItemTest();
		
		double required_amount = 0;
		for(int i = 0; i<item_list.size(); i++) {
			required_amount+=item_list.get(i).getPrice();
		}
		
		double expected_amount = required_amount; 

		vm.insertMoney(required_amount);
		assertEquals(vm.getBalance(), required_amount, .001);

		/* now we should be able to buy everything with the 
		 * current balance
		 */ 
		
		// all codes should be filled, so purchase each one 
		int i = 0;
		for(String code : codes) {
			if(vm.makePurchase(code)) {
				/* subtract the expected balance if the purchase
				   is successful */
				expected_amount -= item_list.get(i).getPrice();
			}
			i++;
		}
	
	
	// get the change and make sure it's equal to the expected amount
	  assertEquals(expected_amount,vm.returnChange(),.001);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/1/18 5:02 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineTest.class);
	}
}