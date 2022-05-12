package com.chainsys.unittest;
/**
 * this class is for unit testing the calculator class and its methods
 * methods to test
 * </list>
 * </list>
 * @author kala3120
 * created on:25 mar 2022
 */

import com.chainsys.variables.Calculator;

public class Testcalculator {
	public static void Testadd()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.add(arg1, arg2);
	System.out.println("Result of add is:"+output);
		
	}
	public static void Testmultipy()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.multiply(arg1, arg2);
	System.out.println("Result of multipy is"+output);
		
	}
	public static void Testsub()
	{
		int arg1=100;
	int arg2=50;
	int output=Calculator.subract(arg1, arg2);
	System.out.println("Result of subtract is"+output);
		
	}
	public static void Testdivide()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.divide(arg1, arg2);
	System.out.println("Result of divide is "+output);
		
	}

}
