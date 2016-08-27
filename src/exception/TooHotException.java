package exception;

public class TooHotException extends TemperatureException{

	public TooHotException(int temp) {
		super(temp);
	}

}
