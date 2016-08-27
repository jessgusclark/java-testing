package exception;

public class CoffeeCup {

	private int temperature = 75;


	public CoffeeCup() {
		// TODO Auto-generated constructor stub
	}
	
	public CoffeeCup(int temp) {
		temperature = temp;
	}

	public void setTemperature(int temp){
		temperature = temp;
	}
	
	public int getTemperature(){
		return temperature;
	}
	
}
