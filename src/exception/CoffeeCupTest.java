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

}
