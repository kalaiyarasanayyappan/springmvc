package com.chainsys.unittest;

import edu.lessons.day60.oops.abstractclass.AbsDemoA;
import edu.lessons.day60.oops.abstractclass.DemoAChild;

public class TestDemoChild {
	
		public static void testDemoA() {
//			AbsDemoA a1=new AbsDemoA();//abstract class
			AbsDemoA.show();// static method

			DemoAChild b1 = new DemoAChild();// child class
			b1.echo();// parent.echo()
		}

	

	}


