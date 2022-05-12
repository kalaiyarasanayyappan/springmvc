package com.chainsys.introduction;

import java.util.Scanner;

public class Fourth {
	public static void main(String args[]) {
		taskA();
	taskB();
	taskC();
	taskD();
		
	}
	public static void taskA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("what is your name");
		String name=sc.nextLine();
		//sc.close();
		System.out.println(name);
	}
	public static void taskB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int Firstvalue=sc.nextInt();
		int result=Firstvalue*100;
		System.out.println(result);
		//sc.close();
		
	}
	public static void taskC()
	{
		String s1="100";
		String s2="25";
		System.out.println(s1+s2);
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		int z=x+y;
		System.out.println(z);
	}
	public static void taskD()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		sc.close();
		if(age<0)
		{
			System.out.println("invalid age!!!");
		}
		if(age<18)
		{
			System.out.println("sorry!!! you need to wait to get Dl");
		}
		else
		{
			System.out.println("happy biking...");
		}
	}

}
