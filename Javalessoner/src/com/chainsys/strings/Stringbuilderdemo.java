package com.chainsys.strings;

public class Stringbuilderdemo {
	public static void testA()
	{
		String firststring="Hello how are you today.Is the weather hot or cold.";
		StringBuilder stringbuilder=new StringBuilder();
		stringbuilder.ensureCapacity(250);
		System.out.println("length="+stringbuilder.length());
		System.out.println("capacity="+stringbuilder.capacity());
		stringbuilder.append(firststring);
		System.out.println("buffer="+stringbuilder);
		System.out.println("length="+stringbuilder.length());
		System.out.println("capacity="+stringbuilder.capacity());
		firststring=" wish it rains this week";
		stringbuilder.append(firststring);
		System.out.println("buffer="+stringbuilder);
		System.out.println("length="+stringbuilder.length());
		System.out.println("capacity="+stringbuilder.capacity());
		//reduce capacity to length
		stringbuilder.trimToSize();
		System.out.println("\tlength="+stringbuilder.length());
		System.out.println("\tcapacity="+stringbuilder.capacity());
		stringbuilder.replace(3, 8, "-This is August-");
		System.out.println("replace="+stringbuilder);
		stringbuilder.insert(10, "-This is August-");
		System.out.println("insert="+stringbuilder);
		System.out.println("\tlength="+stringbuilder.length());
		System.out.println("capacity="+stringbuilder.capacity());
		stringbuilder.delete(5,20);
        System.out.println("delete= "+stringbuilder);
        System.out.println("Length= "+stringbuilder.length());
        System.out.println("Capacity= "+stringbuilder.capacity());
        
        System.out.println("Before reverse: "+stringbuilder);
        stringbuilder.reverse();
        System.out.println("After reverse: "+stringbuilder);
	}

}
