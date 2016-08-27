package exception;

public class Main {
	public static void main(String[] args){
		System.out.println("Custom Exception");
		
		Cafe cafe = new Cafe();
		
		Person jesse = new Person("Jesse");
		
		CoffeeCup coffee = new CoffeeCup();
		CoffeeCup coldCoffee = new CoffeeCup(50);
		CoffeeCup hotCoffee = new CoffeeCup(90);
		
		cafe.serveCustomer(hotCoffee, jesse);
		cafe.serveCustomer(coldCoffee, jesse);
		cafe.serveCustomer(coffee, jesse);
		
	}
}
