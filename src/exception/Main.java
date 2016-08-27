package exception;

public class Main {
	public static void main(String[] args){
		System.out.println("Custom Exception");
		
		Cafe cafe = new Cafe();
		
		Person jesse = new Person("Jesse");
		
		CoffeeCup coffee = new CoffeeCup();
		CoffeeCup icedCoffee = new CoffeeCup(10);
		CoffeeCup coldCoffee = new CoffeeCup(50);
		CoffeeCup hotCoffee = new CoffeeCup(90);
		CoffeeCup scorchedCoffee = new CoffeeCup(110);
		
		cafe.serveCustomer(scorchedCoffee, jesse);
		cafe.serveCustomer(hotCoffee, jesse);
		cafe.serveCustomer(coldCoffee, jesse);
		cafe.serveCustomer(icedCoffee, jesse);
		cafe.serveCustomer(coffee, jesse);
		
	}
}
