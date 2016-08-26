package overload;

public class Main {
	public static void main(String[] args){
		
		ABCD abcd = new ABCD();
		
		A aa = new A();
		A ab = new A();
		B bb = new B();
		
		abcd.speak(aa);
		abcd.speak(ab);
		abcd.speak(bb);
		
		
		A ad = new D();
		D dd = new D();
		
		abcd.speak(ad);
		abcd.speak(dd);
		
		
	}
}
