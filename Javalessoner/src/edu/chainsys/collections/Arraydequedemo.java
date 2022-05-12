package edu.chainsys.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Arraydequedemo {
	public static void main(String args[])
	{
		ArrayDeque<String>arraydeque=new ArrayDeque<String>();
		//use an arraydeque like a stack
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");//duplicate value
		arraydeque.push("Z");//duplicate value
		arraydeque.push("E");
		arraydeque.push("F");
	//	System.out.println("Before popping the stack:"+arraydeque.size());
	//	while(arraydeque.peek()!=null)
		//	System.out.println(arraydeque.pop()+" ");
		//System.out.println("After popping the stack :"+arraydeque.size());
		Iterator<String>iterator=arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.print("\t"+iterator.next());
		}
		System.out.println();
		Iterator<String>striterator=arraydeque.descendingIterator();
		while(striterator.hasNext())
		{
			System.out.print("\t"+striterator.next());
		}
		arraydeque.addFirst("H");
		arraydeque.addLast("T");
		iterator=arraydeque.iterator();
		System.out.println();
		while(iterator.hasNext())
		{
			System.out.print("\t"+iterator.next());
		}
		System.out.println();
		//----
		//pollfirst
		//retrieves and removes te first element of this deque,or
		//returns null if this deque is empty
		System.out.println("************pollFirst:"+arraydeque.pollFirst());
		System.out.println();
		System.out.println(arraydeque);
		System.out.println();
		System.out.println("**********polllast:"+arraydeque.pollLast());
		System.out.println();
		System.out.println(arraydeque);
		System.out.println();
		//---
		//peekfirst
		//retrieves,but does not remove,the first element of this deque,or
		//returns null if this deque is empty.
		System.out.println("*******peekFirst:"+arraydeque.peekFirst());
		System.out.println(arraydeque);
		System.out.println("******peeklast:"+arraydeque.peekLast());
		System.out.println(arraydeque);
		//---
		//removeFirst
		//retrieves and removes the first elemet of this deque.
		//this method differs from pollfirst only in that it throws an exception
		//if this deque is empty.
		System.out.println("********removefirst:"+arraydeque.removeFirst());
		System.out.println(arraydeque);
		System.out.println("********removelast:"+arraydeque.removeLast());
		System.out.println(arraydeque);
		//---
		System.out.println("*remove");
		System.out.println("************removeFirstOccurrence :"+arraydeque.removeFirstOccurrence("X"));
	     System.out.println(arraydeque);
	     System.out.println("**************removeLastOaccurrence :"+arraydeque.removeLastOccurrence("Z"));
	     System.out.println(arraydeque);
	}

}
