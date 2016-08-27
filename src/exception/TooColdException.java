package exception;

public class TooColdException extends TemperatureException {

	public TooColdException(int temp) {
		super(temp);
	}

}
