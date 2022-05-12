package com.chainsys.unittest;

import edu.lessons.day60.oops.abstractclass.IVechicle;
import edu.lessons.day60.oops.abstractclass.VehicleCar;
import edu.lessons.day60.oops.abstractclass.Vehicleship;

public class Testvechicle {
	public static void main(String args[])
	{
		testVehicle();
	}
	public static void testVehicle()
	{
		IVechicle v1;//=new IVehicle();
		v1=new VehicleCar();
		v1.echo();
		v1.start();
		v1.stop();
		//v1.park();
		// type cast the Object to the Car class
		VehicleCar c1=(VehicleCar)v1;			
		c1.park();
		v1 = new Vehicleship();
		v1.echo();
		v1.start();
		v1.stop();
	}
}
