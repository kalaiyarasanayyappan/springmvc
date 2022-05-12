package com.chainsys.variables;

public class Demo {
	public static int DataA;//static global variable
	public final int DataB;  //immutable global variable(not static)
	public final static int DataC=300;//constant
	private int dataD;
	
	//constructor
	/*
	 * construct is a special method
	 * the name of the constructor and the name of the class will be same
	 * constructor don't have return type
	 * constructor can take parameters
	 */
	public Demo(int dataB)
	{
		/*assigning value to the global read only field(this.Data)*/
		this.DataB=dataB;
	}
	//static method can be called without an object
	public static void SayHello()
	{
		System.out.println("Hello Developer!!!");
	}
	//greetuser is a
	public  void greetuser()
	{
		System.out.println("Greeting user!!!");
	}

}
