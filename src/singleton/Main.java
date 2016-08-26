package singleton;

public class Main {
	
	public static void main(String[] args){
		System.out.println("Singleton Design Pattern Example");

		Singleton object = Singleton.getInstance();
		
		object.showMessage();
		
	}
	
}
