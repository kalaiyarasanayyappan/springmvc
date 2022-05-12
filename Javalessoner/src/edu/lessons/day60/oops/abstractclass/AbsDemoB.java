package edu.lessons.day60.oops.abstractclass;

public abstract  class AbsDemoB {
	public abstract void echo();

}
//abstract class must be inherited
//abstract methods must be overriden
class DemoBChild extends AbsDemoB
{
	public void echo() {
		System.out.println("overriding the abstract method");
	}
}
