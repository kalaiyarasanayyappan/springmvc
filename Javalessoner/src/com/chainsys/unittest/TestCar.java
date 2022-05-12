package com.chainsys.unittest;

import edu.lessons.day60.oops.inheritence.Car;
import edu.lessons.day60.oops.inheritence.Vechcle;

public class TestCar {
		public static void main(String[] args) {
			Car c1=new Car();
			c1.Regno="TN10X1234";
			c1.move();
			
			Vechcle v1=new Vechcle("");
			v1.Regno="TN22X5678";
			v1.move();
			
			Vechcle innova=new Vechcle("TN22X5679");
			Vechcle m800=new Vechcle("TN22X5677");
			Vechcle ae3=new Vechcle("TN22X5676");
			Vechcle fer=new Vechcle("TN22X5675");
		}
	}


