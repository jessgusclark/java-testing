package exception;

public class Main {
	public static void main(String[] args){
		System.out.println("Custom Exception");
		
		Cafe cafe = new Cafe();
		
		Person jesse = new Person("Jesse");
		
		CoffeeCup coffee = new CoffeeCup();
		coffee.setTemperature(69);
		
		cafe.serveCustomer(coffee, jesse);
		
	}
}
