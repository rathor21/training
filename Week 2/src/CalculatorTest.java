import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
Calculator calculator = new Calculator();
	@Test
	public void testCase1() {
		calculator.setOperationSelection(4);
		calculator.setFirstNumber(120);
		calculator.setSecondNumber(10);
		assertEquals(12,calculator.operation());
	}

	@Test
	public void testCase2() {
		calculator.setOperationSelection(3);
		calculator.setFirstNumber(33);
		calculator.setSecondNumber(3);
		assertEquals(99,calculator.operation());
	}
	
	@Test
	public void testCase3() {
		calculator.setOperationSelection(5);
		calculator.setFirstNumber(100);
		calculator.setSecondNumber(3);
		assertEquals(1,calculator.operation());
	}
	
	

}
