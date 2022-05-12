package Testprograms;
/*
 * @ author chainsys kalai
 * created on:30-03-2022
 * sub:FIRST TEST
 */

import java.util.Scanner;

public class Alphapetandeightchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String nameincase=name.toUpperCase();
		char[] ch=nameincase.toCharArray();
		int lengthofch=ch.length;
         int ascii=0;
         if(lengthofch<8)
 		{
 			System.out.println("name character should be 8");
 			return;
 		}
		for(int index=0;index<lengthofch;index++)
		{
			ascii=(int)ch[index];
		}
		
		if((ascii>=65) ||(90<=ascii))
		{
			System.out.println("Name update successful");
		}
		else
		{
			System.out.println("name should be alphabets");
		}

	}

	}

