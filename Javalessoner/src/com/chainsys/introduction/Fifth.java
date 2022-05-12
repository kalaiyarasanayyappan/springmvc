package com.chainsys.introduction;

public class Fifth {
	public static void main(String args[]) {
		//printtriangleD();
		//printtriangleC();
		//printmatrix();
	printevennumbers();
	}
	public static void printnumbersonetoten()
	{
		int count=0;
		for(count=0;count<=10;count++)
		{
			System.out.print(count +" ");
		}
		
		
	}
	public static void printnumberstentoone()
	{
		int count=0;
		for(count=10;count>=1;count--)
		{
			System.out.print(count +" ");
		}
		
		
	}
	//nested for loop
	public static void printmatrix()
	{
		int countA=0;
		for(countA=1;countA<=5;countA++)
		{
			for(int countB=1;countB<=10;countB++)
			{
				System.out.print(countB +" ");
			}
			System.out.println();
		}
		
		
	}
	public static void printtriangle()
	{
		int countA=0;
		for(countA=1;countA<=5;countA++)
		{
			for(int countB=1;countB<=countA;countB++)
			{
				System.out.print(countB +" ");
			}
			System.out.println();
		}
		
		
	}
	public static void printtriangleB()
	{
		int countA=0;
		for(countA=1;countA<=5;countA++)
		{
			for(int countB=5;countB>countA;countB--)
			{
				System.out.print(".");
			}
			for(int countC=countA;countC>=1;countC--)
			{
			System.out.print(countC);
		}
			System.out.println();
		
		
	}
	}
	public static void printtriangleC()
	{
		int countA=0;
		for(countA=1;countA<=5;countA++)
		{
			for(int countB=1;countB<=countA;countB++)
			{
				System.out.print(countB +" ");
			}
			System.out.println();
		}
		
		
	}
	public static void printtriangleD()
	{
		int countA=0;
		for(countA=1;countA<=9;countA++)
		{
			if(countA<6)
			{
			for(int countB=5;countB>=countA;countB--)
			{
				System.out.print(" ");
			}
			for(int countC=countA;countC>=1;countC--)
			{
			System.out.print(countC);
		}
			for(int countC=2;countC<=countA;countC++)
			{
				System.out.print(countC);
			}
			}
			else {
				for(int count=0;count<=countA-5;count++)
				{
					System.out.print(" ");
				}
				for(int i=10-countA;i>=1;i--)
				{
					System.out.print(i);
				}
				for(int j=2;j<=10-countA;j++)
				{
					System.out.print(j);
				}
			}
			System.out.println(" ");
	}

			
		}
	public static void printevennumbers()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i);
			}
		}
	}
	}



	
