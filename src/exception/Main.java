package exception;

public class Main {
	public static void main(String[] args){
		System.out.println("Custom Exception!");
		
		try{
			throw new TooHotException();
		}catch(TemperatureException e){
			System.out.println("Error: " + e);
		}
	}
}
