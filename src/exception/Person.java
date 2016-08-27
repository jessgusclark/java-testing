package exception;

public class Person {
	
	private String firstName;
	private static int tooHot = 85;
	private static int tooCold = 65;
	
	public Person(){}
	
	public Person(String name){
		firstName = name;
	}
	
	public String getName() {
		return firstName;
	}

	public void setName(String name) {
		firstName = name;
	}
	
	public void drinkCoffee(CoffeeCup coffee) throws TooColdException, TooHotException {
		
		int temperature = coffee.getTemperature();
		if (temperature <= tooCold){
			throw new TooColdException();
		}
		else if (temperature >= tooHot){
			throw new TooHotException();
		}else{
			System.out.println("Coffee is just right!");
		}
		
	}
	
}
