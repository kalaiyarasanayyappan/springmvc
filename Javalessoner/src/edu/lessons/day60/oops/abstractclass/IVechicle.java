package edu.lessons.day60.oops.abstractclass;

public interface IVechicle {
	//constant
	public final int maxspeed=150;
	abstract void echo();
	abstract void start();
	abstract void move();
	abstract void stop();

}
/***
 * all interfaces are contract,and markers
 */
// null interface can be only markers,not a contract
