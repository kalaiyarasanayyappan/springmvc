package edu.chainsys.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String args[])
	{
		LinkedList<String>stringlinkedlist=new LinkedList();
		stringlinkedlist.add("F");
		stringlinkedlist.add("B");
		stringlinkedlist.add("D");
		stringlinkedlist.add("E");
		stringlinkedlist.add("C");
		stringlinkedlist.add("F");
		stringlinkedlist.add("B");
		stringlinkedlist.add("D");
		stringlinkedlist.add("E");
		stringlinkedlist.add("C");
		stringlinkedlist.addLast("Z");
		stringlinkedlist.addFirst("A");
		stringlinkedlist.add(1, "A2");
		Iterator<String>stringiterator=stringlinkedlist.iterator();
System.out.println();
		while(stringiterator.hasNext())
		{
			System.out.print(stringiterator.next()+ " ");
		}
		stringlinkedlist.remove("F");
		stringlinkedlist.remove(2);
		stringiterator=stringlinkedlist.iterator();
		System.out.println();
		while(stringiterator.hasNext())
		{
			System.out.print(stringiterator.next()+" ");
		}
		stringlinkedlist.removeFirst();
		stringlinkedlist.removeLast();
		stringiterator=stringlinkedlist.iterator();
		System.out.println();
		while(stringiterator.hasNext())
		{
			System.out.print(stringiterator.next()+" ");
		}
	}

}
