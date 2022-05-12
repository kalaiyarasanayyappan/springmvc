package com.chainsys.unittest;

import com.chainsys.variables.Demo;

public class Variabletester {
//Test static variable,constant,immutable variable
	public static void testsglobalvariable()
	{ 
		//display the value of static field
		//value is zero(default value)
		//DataA is accessed without creating an object
		System.out.println("DataA:" +Demo.DataA);
		//display the value of immutable field
		//this is not posssible without an object
		//System.out.println("DataB:"+Demo.DataB);
		//display the value of constant field
		System.out.println("DataC:"+Demo.DataC);
		Demo.DataA=2345;
		System.out.println("DataA:"+Demo.DataA);
		//modifying value of the static field DataC
		//ERROR:The final field Demo.DataC cannot be assigned
		//Demo.DataC=2345;
	}
	public static void testimmutablevariable()
	{//cannot make a static reference to the non static field Demo.DtaB
		//Demo.Data=123;
		/**
		 * first create an object or the class
		 * pass an int value as an argument to the constructor
		 * access the immutable instance field using the object reference
		 * 
		 */
		Demo firstobject=new Demo(123);
		System.out.println(firstobject.DataB);
		/*
		 * value assigned to an immutable field can not be changed
		 * value for the immutable field can be assigned only through the constructor
		 * 
		 */
		//firstobject.DataB=567;


	}
	/**
	 * calling static method using class name
	 * without creating an object
	 * created on:25 march 2022
	 */
	public static void teststaticmethod()
	{
		Demo.SayHello();
	}
	/**
	 * calling non static method using object reference
	 * without creating an object,non static methods can not be called
	 * created on:25 march 2022
	 */
	public static void testNonstaticmethod()
	{   //ERROR
		//Demo.greetuser();
		Demo firstobject=new Demo(111);
		//call the non static method
		firstobject.greetuser();
	}
}


