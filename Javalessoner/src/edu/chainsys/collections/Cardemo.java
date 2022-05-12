package edu.chainsys.collections;

import java.util.ArrayList;

public class Cardemo {
	String name;
	int model;
	int price;
	String companyname;
	public  Cardemo(String name,int model,int price,String companyname)
	{
		this.name=name;
		this.model=model;
		this.price=price;
		this.companyname=companyname;
	}
	void print()
	{
		System.out.println(name+" "+model+"   " +price+"  "+companyname);
	}
	public static void main(String args[])
	{
		Cardemo obj1=new Cardemo("hyndai",2021,220000,"hyndaicompany");
		Cardemo obj2=new Cardemo("ferrai",2012,120000,"ferraricompany");
		Cardemo obj3=new Cardemo("indica",2015,200000,"indicacompany");
		Cardemo obj4=new Cardemo("bmw",2018,2900000,"bmwcompany");
		ArrayList<Cardemo>al=new ArrayList<Cardemo>();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		System.out.println(al);
		MyComparator mc=new MyComparator();
	}
	@Override
	public String toString() {
		return "Cardemo [name=" + name + ", model=" + model + ", price=" + price + ", companyname=" + companyname + "]";
	}
	

}
