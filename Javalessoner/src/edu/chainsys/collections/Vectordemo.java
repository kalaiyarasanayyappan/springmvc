package edu.chainsys.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vectordemo {
	public static void main(String args[])
	{
		//initial capacity is 3 increment it by 2
		Vector<Integer>v=new Vector<Integer>(3,2);
		System.out.println("Initial size:"+v.size());
		System.out.println("Initial capacity:"+v.capacity());
		v.addElement(1);//new integer(1)
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("Capacity:"+v.capacity());
		v.addElement(5);
		v.addElement(6);
		System.out.println("Capacity:"+v.capacity());
		System.out.println("First element:"+(Integer)v.firstElement());
		System.out.println("Lastelement:"+(Integer)v.lastElement());
		if(v.contains(3))
			System.out.println("vector contains 3.");
		Enumeration<Integer>vEnum=v.elements();
		System.out.println("\nElements in vector:");
		while(vEnum.hasMoreElements())
			System.out.println(vEnum.nextElement()+" ");
		
		
	}

}
