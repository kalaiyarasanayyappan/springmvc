package edu.chainsys.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistdemo {
	public static void usingstringarraylist()
	{
		ArrayList<String>stringarraylist=new ArrayList<String>();
		System.out.println("initial size of stringarraylist:"+stringarraylist.size());
		try {
			stringarraylist.add("car");
			stringarraylist.add("auto");
			stringarraylist.add("egg");
			stringarraylist.add("box");
			stringarraylist.add("doll");
			stringarraylist.add("fan");
			//will insert a new value,
			//pushing the current value of index 1 to the next  index
			stringarraylist.add(1, "animal");
		 stringarraylist.add("girl");
		 stringarraylist.add("fan");
		 System.out.println("size of stringarraylist after addition:"+stringarraylist.size());
		 System.out.println("contents of stringarraylist:"+stringarraylist);
		 //will replace he value in index 2
		 stringarraylist.set(2, "xenas");
		 System.out.println("after set(2):"+stringarraylist);
		 System.out.println("lastindex of:'fan'"+stringarraylist.lastIndexOf("fan"));
		 //remove the first instance of 'fan'
		 stringarraylist.remove("fan");
		 stringarraylist.remove(2);
		 System.out.println("size after remove(2):"+stringarraylist.size());
		 System.out.println("cotents of stringarralist:"+stringarraylist);
		 //will reduce the capacity
		 stringarraylist.trimToSize();
		}
		catch(Exception err)
		{
			System.out.println(err.getMessage());
		}
		 
		
	}
	public static void lessonarraylist()
	{
		ArrayList<Emp>emparraylist=new ArrayList<Emp>(30);
		System.out.println("initialemparraylist size of emparraylist:"+emparraylist.size());//0
		try
		{
			for(int i=0;i<5;i++)
			{
				Emp e1=new Emp(i);
				e1.Name="emp"+i;
				emparraylist.add(e1);
			}
			System.out.println("size of emparraylist after additions:"+emparraylist.size());
			Emp e3=(Emp)emparraylist.get(4);
			emparraylist.add(e3);
			System.out.println("size of emparraylist after additions:"+emparraylist.size());
			Emp e4=new Emp(4);
			e4.Name="elon musk";
			emparraylist.add(e4);
			System.out.println("freq of[emp id 4]in arraylist"+Collections.frequency(emparraylist, e3));
			Iterator<Emp>empIterator=emparraylist.iterator();
			while(empIterator.hasNext())
			{
				Object element=empIterator.next();//return current object
				Emp e1=(Emp)element;
				System.out.println("\t"+e1.getid()+" "+e1.Name);
			}
		}
		catch(Exception err)
		{
			System.out.println("error!!!"+err.getMessage());
		}
	}

}
