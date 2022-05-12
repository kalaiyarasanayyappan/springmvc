package Exceptionhandling;

public class Amountexceptions extends Exception {

	private static boolean enableSuppression;
	public Amountexceptions() {
		// TODO Auto-generated constructor stub
		
	}
	public Amountexceptions(String message) {
		super(message);
	}
	public Amountexceptions(Throwable cause) {
		super(cause);
	}
	public Amountexceptions(String message,Throwable cause) {
		super(message,cause);
		
	}
public Amountexceptions(String message,Throwable cause,boolean enableSuppresion,boolean writableStackTrace) {
	super(message,cause,enableSuppression,writableStackTrace);
}
}

