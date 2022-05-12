package com.chainsys.strings;

import java.util.Scanner;

public class StringlessonA {
	public static void lessonone()
	{//string is an array of characters
		String firststring="chainsys";
		System.out.println(firststring);
		char dataone[]= {'c','h','a','i','n'};
		String secondstring=new String(dataone);
		System.out.println(secondstring);
		String thirdstring=new String(new char[] {'c','h','a','i','n'});
		System.out.println(thirdstring);
	}	
	public static void lessonTWO()
	{
		String firststring="hello";
		String secondstring="hello";
		String thirdstring="hello";
		int firstNumber=100;
		int secondNumber=100;
		int thirdNumber=100;
       System.out.println(firststring);
       System.out.println(firststring);
       firststring="welcome";
       System.out.println(firststring);
       System.out.println(secondstring);
	}
       public static void creatingstringInaForLoop()
       {
    	   for(int count=0;count<10;count++)
    	   {
    		   String s1="hello";
    	   }
       }
       public static void stringToCharArray()
       {
    	   java.util.Scanner scanner=new java.util.Scanner(System.in);
    	   System.out.println("enter a word");
    	   String firststring=scanner.nextLine();
    	   scanner.close();
    	   int Stringlength=firststring.length();
    	   System.out.println("length"+Stringlength);
    	   char[]data=firststring.toCharArray();
    	   int dataarraylength=data.length;
    	   System.out.println("length"+dataarraylength);
       }
       public static void stringToUpperLower()
       {
    	   java.util.Scanner scanner=new java.util.Scanner(System.in);
    	   System.out.println("enter a word");
    	   String firststring=scanner.nextLine();
    	   scanner.close();
    	   System.out.println(firststring);
    	   String stringinUppercase=firststring.toUpperCase();
    	   //string in firststring is not modified,because strings re immutable
    	   System.out.println("toUppercase"+stringinUppercase);
    	   System.out.println("s1"+firststring);
    	   String stringinLowercase=firststring.toLowerCase();
    	   System.out.println("toLowercase"+stringinLowercase);
    	   System.out.println("s1"+firststring);
    	   //substring
    	   //from the 4th char till end
    	   String Substring =firststring.substring(3);
    	   System.out.println(Substring);
    	   //from 3rd char to 6th char (i.e excluding 7th char)
    	   //from index 2 to index 5
    	   Substring =firststring.substring(2, 6);
    	   System.out.println(Substring);
    	   //replace
    	   String replacedstring=firststring.replace('a', 'e');
    	   System.out.println(replacedstring);
    	   //equals
    	   boolean flag1=firststring.equals(stringinUppercase);//false
    	   System.out.println(flag1);
    	   //equalsignorecase
    	   boolean flag=firststring.equalsIgnoreCase(stringinUppercase);//true
    	   System.out.println(flag);
       
	}
       public static void teststringtrim()
       {
    	   String secondstring="Hope it    rain     ";
    	   System.out.println("Before Trim"+secondstring.length());
    	   secondstring=secondstring.trim();
    	   System.out.println("AfterTrim"+secondstring.length());
       }
       public static void testsplit()
       {
    	   String firststring="  Tom and Jerry are good friends  ";
    	   String trimmedstring=firststring.trim();
    	   String[]data=trimmedstring.split(" ");
    	   int count=data.length;
    	   System.out.println("word count"+count);
    	   for(int index=0;index<count;index++)
    	   {
    		   System.out.println(data[index]);
    	   }
       }
       public static void testsplitdays()
       {
    	   String weekdays="mon;tue;wed;thu;fri;sat;sun";
    	   String[]data=weekdays.split(";");
    	   int count=data.length;
    	   System.out.println("days count"+count);
    	   for(int index=0;index<count;index++)
    	   {
    		   System.out.println(data[index]);
    	   }
       }
       //write code to reverse a string
       public static void reverse()
       {
    	   java.util.Scanner scanner=new Scanner(System.in);
    	   System.out.println("enter a sentence");
    	   String sentence="";
    	   String sentenceA="";
    	   try {
    		   sentence=scanner.nextLine();
    	   
    	   }
    	   finally
    	   {
    		   scanner.close();
    	   }
    	   char[]charsentence=sentence.toCharArray();
    	   for(int name=charsentence.length-1;name>=0;name--)
    	   {
    		   sentenceA=sentenceA+charsentence[name];
    		   
    	   }
    	   System.out.println(sentenceA);
       }
       public static void verifystring(String s1)//verify and print
       {
    	   if(null==s1)
    	   {
    		   System.out.println("string is Null");
    		   return;
    	   }
    	   else
    		   System.out.println("string is not Null"+s1);
    	   if(!s1.isEmpty())
    		   System.out.println("\t  not Empty"+s1);
    	   else
    		   System.out.println("\t String is Empty");
       }
}


