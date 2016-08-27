package exception;

public class Cafe {
	
	public void serveCustomer(CoffeeCup coffee, Person customer){
		
		try{
			customer.drinkCoffee(coffee);
			System.out.println("Customer Drank Coffee");
		}
		catch(TooHotException e){
			int temperature = e.getTemperature();
            System.out.println("Coffee temperature is "
                + temperature + " degrees Celsius.");
            
            if (temperature < 100){
            		System.out.println("Ask customer to wait for it to cool down");
            }else{
            		System.out.println("Make new cup of coffee for customer");
            }
		}
		catch(TooColdException e){
			int temperature = e.getTemperature();
			System.out.println("Coffee temperature is "
	                + temperature + " degrees Celsius.");
			
			if (temperature > 50){
				System.out.println("Add hot coffee to drink");
			}else{
				System.out.println("Make new cup of coffee for customer");
			}
		}
		
	}
}
