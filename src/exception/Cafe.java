package exception;

public class Cafe {
	
	public void serveCustomer(CoffeeCup coffee, Person customer){
		
		try{
			customer.drinkCoffee(coffee);
			System.out.println("Customer Drank Coffee");
		}catch(TemperatureException e){
			System.out.println("Coffee was the wrong temperature!");
		}
		/*
		 * Unreachable:
		catch(TooHotException e){
			System.out.println("Coffee was too hot!" );
		}catch(TooColdException e){
			System.out.println("Coffee was too cold!" );
		}
		*/
		
	}
}
