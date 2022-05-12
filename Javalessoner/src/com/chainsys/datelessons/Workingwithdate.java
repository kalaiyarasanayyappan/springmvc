package com.chainsys.datelessons;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Workingwithdate {
	public static void displaycurrentdate()
	{
		Calendar vCalendar=Calendar.getInstance();
		Date date=vCalendar.getTime();
		System.out.println(date);
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MMM-dd");
		System.out.println(dateformat.format(date));
		
	}
	public static void displayDOB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your DOB:(YYY-mm-dd");
		String DoB=sc.nextLine();
		sc.close();
		int year=Integer.parseInt(DoB.substring(0,4));
		int month=Integer.parseInt(DoB.substring(5,7))-1;
		int day=Integer.parseInt(DoB.substring(8,10));
		System.out.println(year+"-"+month+"-"+day);
		Calendar date=new GregorianCalendar(year,month,day);
		Date dob=date.getTime();
		SimpleDateFormat f1=new SimpleDateFormat("yyyy-MMM-dd");
		System.out.println("DoB"+f1.format(dob));
		//retirement date
		date.add(Calendar.YEAR, 60);
		date.add(Calendar.MONTH, 1);
		date.set(Calendar.DAY_OF_MONTH, 1);
		date.add(Calendar.DATE, -1);
		System.out.println("dob"+f1.format(date.getTime()));
		
		
	}
	

}
