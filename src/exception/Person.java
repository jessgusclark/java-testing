package exception;

public class Person {
	
	private String firstName;
	private static int tooHot = 65;
	private static int tooCold = 85;
	
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
	
}
