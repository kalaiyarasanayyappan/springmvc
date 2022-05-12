package Charstreams;

import java.util.ArrayList;
import java.util.Scanner;

public class Exitname {
	public static void main(String args[]) {
	ArrayList obj=new ArrayList();
	Scanner sc=new Scanner(System.in);
String n="exit";
//String s=sc.nextLine();
       int i=0;
    while(i<1)
	{
		System.out.println("enter the name");
		String s=sc.nextLine();
		
	if(s.equals("exit"))
	{
		break;
	}
	obj.add(s);
	System.out.println(obj)	;	
	}

	}
}
