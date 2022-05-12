package Testprograms;
/*
 * @ author chainsys kalai
 * created on:30-03-2022
 * sub:FIRST TEST
 */

public class Countwordandreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		String s2="Tom and jerry are good friends";
     String firsttrim=s2.trim();
     String[] data=firsttrim.split(" ");
     int count=data.length;
     System.out.println("Number of words in string is="+count);
     sb.append(s2);
     sb.reverse();
     System.out.println("The reverse of string is="  +sb);
     
     
	}

}
