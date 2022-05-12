package com.chainsys.introduction;

import java.util.Scanner;

public class Sixth {
	public static void main(String args[]) {
		//checkusername();
		findevennumbers();
	}
	
	public static void checkusername()
	{
		Scanner sc=new Scanner(System.in);//input stream
		//promp a message in the display console
		System.out.println("Enter your name");
		//get name from the keyboard (input device),and store the name in a local variable
		String username=sc.nextLine();
		
		sc.close();//closing the input stream
		//streams are created and managed by the os.scanner is just a handle
		System.out.println("name is"+ username);//display the input value
		char[]nameASCharacters=username.toCharArray();
		int lengthofChararray=nameASCharacters.length;
		System.out.println("length of your name is:"+lengthofChararray);
		if(lengthofChararray<3)
		{
			System.out.println("name must have atleast 3 chars");
		     return;
		}
		if(lengthofChararray>15)
		{
			System.out.println("name must not have more than 15 chars");
			return;
		}
		//ascii value for alphabets is 65 to 90 for upper case
		String nameinuppercase=username.toUpperCase();
		//remove blank space before,and after the name
		nameinuppercase=nameinuppercase.trim();
		char[] uppercaseChararray=nameinuppercase.toCharArray();
		lengthofChararray=uppercaseChararray.length;
		int asciivalue=0;
		for(int index=0;index<lengthofChararray;index++)
		{
			asciivalue=(int)uppercaseChararray[index];
			System.out.println("ASCII:"+ asciivalue);
			if(asciivalue<65 || asciivalue>90)
			{
				if(asciivalue!=32) {
					System.out.println("invalid character in name");
					return;
				}
			}
		}
	}
	public static void findevennumbers() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 10 digit number");
		long value=sc.nextLong();
		sc.close();
		long num=value;
		long reminder=0;
		while(num>0)
		{
			reminder=num%10;
			if(reminder%2==0)
			{
				System.out.println(reminder);
			}
			num=num/10;
		}
	}
	public static void swapnumbers()
	{
		int x=67;
		int y=92;
		System.out.println("x:"+x+"y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x:"+x+"y:"+y);
	}

}
