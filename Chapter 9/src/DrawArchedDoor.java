/*
 * File: DrawArchedDoor.java
 * -------------------------
 */

import acm.graphics.*;
import acm.program.*;

public class DrawArchedDoor extends GraphicsProgram {
	
	public void run() {
		GPolygon door = new GPolygon();
		int height = 100;
		int width = 50;
		double lengthOfVerticalEdge = height - width / 2;
		door.addVertex(-width / 2, 0);
		door.addEdge(width, 0);
		door.addEdge(0, -lengthOfVerticalEdge);
		door.addArc(width, width, 0, 180);
		door.addEdge(0, lengthOfVerticalEdge);
		add(door, 50, 100);
		
	}


}
