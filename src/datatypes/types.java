package datatypes;

import static org.junit.Assert.*;

import org.junit.Test;

public class types {

	@Test
	public void integersWithUnderscoresAreTheSame() {
		
		assertEquals(100_000, 100000);
		
	}

	@Test
	public void incrementCharDataType(){
		
		char ch1;
		
		ch1 = 'X';
		
		//System.out.println("ch1 is " + ch1);
		
		ch1++;
		
		//System.out.println("ch1 is " + ch1);
		
		assertEquals('Y', ch1);
	}
	
}
