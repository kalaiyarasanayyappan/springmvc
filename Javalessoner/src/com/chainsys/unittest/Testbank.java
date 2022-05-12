package com.chainsys.unittest;

import com.chainsys.variables.Bank;

public class Testbank {
	
	public static void testdeposite()
	{
       System.out.println("before deposite balance"+Bank.accountbalance);
       
		Bank.deposite(1000);
		System.out.println("After deposite balance"+Bank.accountbalance);
	
	}
	public static void testwithdraw()
	{
		System.out.println("before withdraw balance"+Bank.accountbalance);
		int withdraw=Bank.withdraw(500);
		System.out.println("Total amount is"+withdraw);
		System.out.println("after withdraw balance"+Bank.accountbalance);
		
	}
	public static void testopenAccount()
	{
		Bank.openaccount("kalai", 142253647);
	System.out.println(Bank.customername);
	System.out.println(Bank.accountnumber);
	}

}
