package com.chainsys.variables;

import java.util.Scanner;
/**
 * 
 * @author kalai3120
 *25 march 2022
 */

public class Bank {

	public static String customername;
	public static long accountnumber;
	 public static int   accountbalance=1000;
	public  static void deposite(int Amount)
	{
		accountbalance=Amount+accountbalance;
	}
	
	public  static int withdraw(int Amount)
	{

		accountbalance=accountbalance-Amount;
		return accountbalance;
	}
	public static void openaccount(String name,long accountNumber1)
	{
	

		customername=name;
	accountnumber=accountNumber1;
		
		
	}
}



