package com.chainsys.unittest;

import com.chainsys.oops.Calculator;
import com.chainsys.oops.ICalculator;

public class CalculatorTest {

		public static void main(String[] args) 
		{
			Calculator c1=new ICalculator();
			System.out.println("Addition  is "+ c1.add(2, 2));
			System.out.println("multiply  is "+ c1.multiply(6,0));
			try
			{
				System.out.println("divide  is "+ c1.divide(2, 0));
			}
			catch(Exception ae)
			{
				System.out.println("enter value greater than 0");
			}
		}
}

		/*public static void testmarker()
		{
			CalculatorB firstCalculator=new CalculatorB();
			if(firstCalculator instanceof ICalculator)
			{
				ICalculator contract=firstCalculator;
				int output=0;
				output=contract.add(10,5);
				System.out.println(output);
				output=contract.multiply(10, 5);
				output=contract.divide(10, 5);
				System.out.println(output);
			}
			else
				System.out.println(firstCalculator.getClass().getName()+"does not Implement Icalculator");
			
		}
	}*/



