package Testprograms;
/*
 * @ author chainsys kalai
 * created on:30-03-2022
 * sub:FIRST TEST
 */

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int input=sc.nextInt();
     sc.close();
     int a,b,c,d,e,value;
     a=input/100;
     d=input%100;
     b=d/10;
     e=input%100;
     c=e%10;
     value=(a*a*a)+(b*b*b)+(c*c*c);
     if(input==value)
     {
    	 System.out.println("same as input number");
     }
     else
     {
    	 System.out.println("different number");
     }
	}

}
