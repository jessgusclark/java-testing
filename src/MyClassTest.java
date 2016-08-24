import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		MyClass mc = new MyClass();
		
		assertEquals("10 x 10 = 100", 100, 10*10);
		assertEquals("10 x 0 = 0", 0, mc.multiply(100, 0));
		
		
	}

}
