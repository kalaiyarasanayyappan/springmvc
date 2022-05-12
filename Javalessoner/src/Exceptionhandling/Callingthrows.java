package Exceptionhandling;

public class Callingthrows {
	public static void main(String args[]) {
		try{
			Throws.Divide(15, 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("eneter valid number");
		}
	}

}



