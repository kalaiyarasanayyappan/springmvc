package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

/**
 * 
 * @author kalai3120
 *
 */
public class Cartester {
	public static void testCar()
	{
		Car firstCar=new Car("TN 10A 001");
		firstCar.setColor("red");
		firstCar.setFuel("petrol");
		firstCar.setYearofpurchase(2022);

		System.out.println(firstCar.getRegno());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getYearofpurchase());
	}

}
