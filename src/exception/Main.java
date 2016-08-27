package exception;

public class Main {
	public static void main(String[] args){
		System.out.println("Custom Exception!");
		
		/*try{
			throw new TooHotException();
		}catch(TemperatureException e){
			System.out.println("Error: " + e);
		}*/
		
		Person jesse = new Person("Jesse");
		
		CoffeeCup coffee = new CoffeeCup();
		coffee.setTemperature(70);
		System.out.println("Temp: " + coffee.getTemperature() );
		
		try{
			jesse.drinkCoffee(coffee);
		}catch(TooHotException e){
			System.out.println("Too Hot: " + e);
		}catch(TooColdException e){
			System.out.println("Too Cold: " + e);
		}
	}
}
