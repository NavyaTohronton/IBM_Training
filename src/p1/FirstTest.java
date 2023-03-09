package p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstTest {

	@Test
	void testIntegerSum() {
		Calculator calc= new Calculator();
		int val=calc.sum(5, 5);
		assertEquals(10, val);
		
	}
	void testFloatSum() {
		Calculator calc=new Calculator();
		int val=calc.sum(0,0);
		assertEquals(0,val);
		
	}
	void testNegativeSum() {
		Calculator calc=new Calculator();
		int val=calc.sum(-5, -5);
		assertEquals(10,val);
	}

}
