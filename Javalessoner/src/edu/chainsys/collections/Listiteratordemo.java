package edu.chainsys.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listiteratordemo {
	public static void main(String args[])
	{
		ArrayList<String>stringarraylist=new ArrayList<String>();
		String s1="B";
		stringarraylist.add("c");
		stringarraylist.add(s1);
		stringarraylist.add("A");
		stringarraylist.add("E");
		stringarraylist.add(s1);
		stringarraylist.add("D");
		stringarraylist.add("F");
		stringarraylist.add(s1);
		Iterator<String>string_itr=stringarraylist.iterator();
		while(string_itr.hasNext())
		{
			System.out.print(string_itr.next()+" ");
		}
		System.out.println();
		ListIterator<String>string_list_itr=stringarraylist.listIterator();
		while(string_list_itr.hasNext())
		{
			String element=string_list_itr.next();
			string_list_itr.set(element+"-- ");
		}
		string_itr=stringarraylist.iterator();
		while(string_itr.hasNext())
		{
			Object element=string_itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		while(string_list_itr.hasPrevious())
		{
			String element=string_list_itr.previous();
			System.out.print(element+ " ");
		}
	}

}
