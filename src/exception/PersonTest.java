package exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	
	@Test
	public void returnPersonName() {
		
		Person jesse = new Person("Jesse");
		assertEquals(jesse.getName(), "Jesse");
		
	}
	
	@Test
	public void setPersonName(){
		Person jesse = new Person();
		
		jesse.setName("Gus");
		assertEquals(jesse.getName(), "Gus");
	}

}
