package exception;

public class Person {
	
	private String firstName;
	private boolean happy = true;
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
			happy = false;
			throw new TooColdException(temperature);
		}
		else if (temperature >= tooHot){
			happy = false;
			throw new TooHotException(temperature);
		}
		
	}

	public Boolean getHappy() {
		return happy;
	}
	
}
