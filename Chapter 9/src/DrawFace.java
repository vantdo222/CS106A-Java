/*
 * File: DrawFace.java
 * -------------------
 */

import acm.program.*;
import acm.graphics.*;

public class DrawFace extends GraphicsProgram {

	public void run() {
		GFace face = new GFace(200, 200);
		//add(createNose(10,10), 50, 50);
		add(face, 50, 50);
	}
	
	private GPolygon createNose(double width, double height) {
		GPolygon nose = new GPolygon();
		nose.addVertex(-width / 2, height / 3);
		nose.addEdge(width, 0);
		nose.addEdge(-width / 2, -height);
		return nose;
	}
}
