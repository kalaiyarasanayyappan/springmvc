package Exceptionhandling;

import java.util.Scanner;

public class Exceptionhandling {
	public static void main(String args[]) {
		try {
			enterpin();
		}
		catch(PinException e) {
			System.out.println(e.getmessage());
		}
	}
	private static void enterpin() throws PinException {
		// TODO Auto-generated method stub
		
	}
		System.out.println("pls enter pin");
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		try {
			if(!(pin>=1000 && pin<=9999))
			{
				throw new PinException("pin should be 4 digits");}
		}
		finally {
			amount();
		}
			}
	private static void amount() {
		System.out.println("pls enter amount");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		if(!(amount>=100)) {
			try {
				throw new amountException("pls enter amount greater than 100");
			}
			catch(amountException e) {
				e.printStackTrace();
			}
			System.out.println("successfull");
			}
		}
	}

}
