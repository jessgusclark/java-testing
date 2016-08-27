package exception;

abstract class TemperatureException extends Exception {
	
	private int temperature;
	
	public TemperatureException(int temp){
		temperature = temp;
	}
	
	public int getTemperature(){
		return temperature;
	}
	
}
