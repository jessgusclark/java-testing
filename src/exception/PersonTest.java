package exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	Person jesse = new Person("Jesse");
	
	@Test
	public void returnPersonName() {
		
		assertEquals(jesse.getName(), "Jesse");
		
	}
	
	@Test
	public void setPersonName(){
		Person jesse = new Person();
		
		jesse.setName("Gus");
		assertEquals(jesse.getName(), "Gus");
	}

	@Test(expected=TooHotException.class)
	public void drinkHotCoffee() throws Exception{

		CoffeeCup hotCoffee = new CoffeeCup();
		hotCoffee.setTemperature(100);
		
		jesse.drinkCoffee(hotCoffee);
		
	}

	@Test(expected=TooColdException.class)
	public void drinkColdCoffee() throws Exception{
		
		CoffeeCup coldCoffee = new CoffeeCup();
		coldCoffee.setTemperature(50);
		
		jesse.drinkCoffee(coldCoffee);
		
	}
	
}
