package by.academy.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleMathTest extends Assert{
	
	
	@Test
	public void testMathPlus() {
		System.out.println("First plus test");	
		assertEquals(4, Calculator.gerSum(2, 2));
	}
	
	@Test
	@Ignore
	public void failTest() {
		System.out.println("First test");
		fail();
	}	
	
	@Test(timeout =1000)
	public void testTimeout() {
		while(true) {
		System.out.println("Timeout test");
		}
	}	
	
	
	@Test(expected = ArithmeticException.class)
	public void testAritmetics() {
		System.out.println("AritmeticException");
		int a=1/0;
	}	
	
	
}
