/*
 * File: createHexagon.java
 * ------------------------
 */

import acm.program.*;
import acm.graphics.*;

public class createHexagon extends GraphicsProgram {
	
	public void run() {
		add(createHexagon(50), getWidth() / 2, getHeight() / 2);
	}
	
	private GPolygon createHexagon(double side) {
		GPolygon hex = new GPolygon();
		hex.addVertex(-side, 0);
		int angle = 60;
		for (int i = 0; i < 6; i ++) {
			hex.addPolarEdge(side, angle);
			angle -= 60;
		}
		return hex;
	}

}
