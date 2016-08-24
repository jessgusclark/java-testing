import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MyClassTest {
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		
		MyClass mc = new MyClass();
		
		assertEquals("10 x 10 = 100", 100, 10*10);
		//assertEquals("100 x 1 = 100", 100.0, mc.multiply(100, 1));
		
		// With 'double' tolerance needs to be added:
		// assertEquals("10 x 10 = 100", 100, mc.multiply(10, 10));	// <- deprecated
		assertEquals("10 x 10 = 100", 100, mc.multiply(10, 10), 0);
		
		// Tolerance:
		assertEquals("10 x 7.555 = 75.6", 75.6, mc.multiply(10, 7.555), 1);
		
	}

	@Test
	public void testSubtract(){
		MyClass mc = new MyClass();
		
		assertEquals("100 - 50 = 50", 50, mc.subtract(100, 50));
		
	}
	
	@Test
	public void testAdd(){
		MyClass mc = new MyClass();
		
		assertEquals("10 + 10 = 20", 20, mc.add(10,10));
		
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void throwsException(){
		exception.expect(ArithmeticException.class);
		
		MyClass mc = new MyClass();
		
		double answer = mc.divide(100, 0);
		
		assertEquals("100 / 0 = Exception!", 10, answer, 0);
	}
	
	

	@Test
	public void testLog10(){

		assertEquals("log(100", 2.0, Math.log10(100), 1);
		
	}
}
