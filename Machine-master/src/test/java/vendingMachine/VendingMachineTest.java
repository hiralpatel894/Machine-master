package vendingMachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void dropCoin() { //add coin and select product
		vendingExample VM = new vendingExample();
		int balance=0;
		assertEquals(100,VM.drop("DOLLAR",balance));
		assertEquals(125,VM.drop("QUARTER",balance+100));
		assertEquals(135,VM.drop("DIME",balance+100+25));
	}

	
	@Test
	public void selectProducts() { //add coin and select product
		vendingExample VM = new vendingExample();
		int balance=150;
		assertEquals(50,VM.choose("SODA1",balance));
		assertEquals(85,VM.choose("SODA2",balance));
		assertEquals(100,VM.choose("SODA3",balance));
	}
	
}
