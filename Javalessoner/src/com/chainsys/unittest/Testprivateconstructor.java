package com.chainsys.unittest;

import edu.chainsys.oops.usingfinal.ShapeAPrivateConstructor;

public class Testprivateconstructor {
	public static void testPrivateConstructor() {
		ShapeAPrivateConstructor refShapeA=
				ShapeAPrivateConstructor.getObject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}

}
