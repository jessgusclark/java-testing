package singleton;

public class Singleton {
	
	private Singleton instance;
	
	/*
	public Singleton Singleton(){
		if (instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	*/
	
	public Singleton Singleton(){
		if (instance == null){
			System.out.println("Creating New Instance");
			instance = new Singleton();
		}else{
			System.out.println("Instance has already been created");
		}
		return instance;
	}
	
}
