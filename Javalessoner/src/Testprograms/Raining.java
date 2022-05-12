package Testprograms;
/*
 * @ author chainsys kalai
 * created on:30-03-2022
 * sub:FIRST TEST
 */

import java.util.Scanner;

public class Raining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		if(word.contains("raining"))
		{
		System.out.println("yes raining,to get umbrella");
		}
		else if(word.contains("Not raining"))
		{
			System.out.println("yes Not raining ,come safe");
		}
		else
		{
			System.out.println("enter valid word");
		}
		System.out.println("Enter the temperature");
		int temperature=sc.nextInt();
		if(temperature<=32)
		{
			System.out.println("Bring heavy jacket");
		}
		else if(temperature>32&&temperature<=50)
		{
			System.out.println("Bring light jacket");
		}
		else if(temperature>50)
		{
			System.out.println("No jacket");
		
		}

	}

}
