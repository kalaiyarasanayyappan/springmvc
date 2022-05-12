package com.chainsys.strings;

public class Equals {
	public static void main(String args[]) {
		String a="kalai";
		String b="kalai";
		String c="KALAI";
		 String d=new String("kalai");
		 if(a==b)
		 {
			 System.out.println("equal");
		 }
		 else
		 {
			 System.out.println("not  equal");
		 }
		 if(a==c)
		 {
			 System.out.println("equal");
			 
		 }
		 else
		 {
			 System.out.println("not equal");
		 }
		if(d==c) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}

