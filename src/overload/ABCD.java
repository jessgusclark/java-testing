package overload;

public class ABCD {
	
	// Example of Overloading:
	
	public void speak(A a){
		System.out.println("A " + a.toString());
	}
	
	public void speak(B b){
		System.out.println("B " + b.toString());
	}
	
	public void speak(C c){
		System.out.println("C " + c.toString());
	}
}
