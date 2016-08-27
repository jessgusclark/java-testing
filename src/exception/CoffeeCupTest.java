package exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoffeeCupTest {

	@Test
	public void getCoffeeTemperature() {
		
		CoffeeCup coffee = new CoffeeCup();
		assertEquals(coffee.getTemperature(), 75);
		
	}
	
	@Test
	public void setCoffeeTemperature(){
		
		CoffeeCup coffee = new CoffeeCup();
		coffee.setTemperature(95);
		
		assertEquals(coffee.getTemperature(), 95);
	}

	@Test 
	public void coldCoffee(){
		CoffeeCup coffee = new CoffeeCup(50);
		
		assertEquals(coffee.getTemperature(), 50);
	}
	
	@Test 
	public void hotCoffee(){
		CoffeeCup coffee = new CoffeeCup(90);
		
		assertEquals(coffee.getTemperature(), 90);
	}
}
