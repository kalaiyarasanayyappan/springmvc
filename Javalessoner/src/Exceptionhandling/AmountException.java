package Exceptionhandling;

public class AmountException extends Exception {

	private static boolean enableSuppression;
	public AmountException() {
		// TODO Auto-generated constructor stub
		
	}
	public AmountException(String message) {
		super(message);
	}
	public AmountException(Throwable cause) {
		super(cause);
	}
	public AmountException(String message,Throwable cause) {
		super(message,cause);
		
	}
public AmountException(String message,Throwable cause,boolean enableSuppresion,boolean writableStackTrace) {
	super(message,cause,enableSuppression,writableStackTrace);
}
}



