package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class Employeetester {
	public static void Testemplyees()
	{
	Employee firstemployee=new Employee(123);
	firstemployee.setName("kalai");
	System.out.println(firstemployee.getname());
}
	public static void testcity()
	{
		Employee firstEmployee=new Employee(123);
		firstEmployee.setcity("chennai");
		System.out.println(firstEmployee.getCity());
	}
	public static void testsalary()
	{
		Employee firstemployee=new Employee(123);
		firstemployee.setSalary(50000);
		System.out.println(firstemployee.getsalary());
	}
}
