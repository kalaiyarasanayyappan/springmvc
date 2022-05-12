package javapracticeprograms;

import java.util.Scanner;

public class Aandone {
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		 char i;
		 if(number<=26)
		 {
		char alphapet= (char)( number+64);
		System.out.println(alphapet);
		 }
		else if(number>26)
		{   
	      i= (char) (38+ number);
	      System.out.println((char)65+""  +i);
	     // System.out.println(c);
	     // char c=(char) ((char)65+i);
	    // System.out.println(c);
		
		
	
		}
	
	
		 }
		

}


