package Testprograms;
/*
 * @ author chainsys kalai
 * created on:30-03-2022
 * sub:FIRST TEST
 */

import java.util.Scanner;

public class Evendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digits");
		long value=sc.nextLong();
		long num=value;
		long reminder=0;
		System.out.println("Even digits are");
		while(num>0)
		{
			reminder=num%10;
			if(reminder%2==0)
			{
				System.out.println(+reminder);
			}
			num=num/10;
			
		}

	}

}
