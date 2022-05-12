package Exceptionhandling;
import java.util.Scanner;

public class Trycatch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
		int b=sc.nextInt();
		
		try{
			int c=a/b; 
			System.out.println(c);
	
		Trycatch obj1=new Trycatch();
	
		obj1.test();
		}
		catch(NullPointerException npe)
		{
			System.out.println("seconf catch");
		}
	
	catch(Exception e)
	{
	System.out.println("print valid number");
	}
		finally
		{
			int c=a+b;
			System.out.println(c);
			
		}
		
		
	}
	

	private void test() {
		// TODO Auto-generated method stub
		try {
			 throw new NullPointerException();
			 }
		catch(NullPointerException npe)
		{
			System.out.println("got npe");
			throw npe;
		}
		
	}
	

}

