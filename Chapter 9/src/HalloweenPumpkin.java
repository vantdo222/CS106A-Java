/*
 * File: HalloweenPumpkin.java
 * ---------------------------
 * This program draws a picture of the Halloween pumpkin in
 * which the head is an orange circle, and the eyes, nose, and
 * mouth are filled polygons, the stem is a GRect.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class HalloweenPumpkin extends GraphicsProgram {
	
	public void run() {
		double x = (getWidth() - HEAD_RADIUS * 2) / 2;
		double y = (getHeight() - HEAD_RADIUS * 2) / 2;
		add(createFace(HEAD_RADIUS), x, y);
		add(createMouth(MOUTH_WIDTH, MOUTH_HEIGHT), x + (HEAD_RADIUS * 2) * (1.75 / 8.0), y + (HEAD_RADIUS * 2) * (6.0 / 8.0));
		add(createEye(EYE), x + (HEAD_RADIUS * 2) * (2.5 / 8.0), y + (HEAD_RADIUS * 2) * (2.5 / 8.0));
		add(createEye(EYE), x + (HEAD_RADIUS * 2) * (5.5 / 8.0), y + (HEAD_RADIUS * 2) * (2.5 / 8.0));
		add(createNose(NOSE), x + (HEAD_RADIUS * 2) * (4.0 / 8.0), y + (HEAD_RADIUS * 2) * (4 / 8.0));
	}
	
	private GPolygon createNose(int side) {
		GPolygon nose = new GPolygon();
		double height = Math.sqrt((side / 2) * (side / 2) + side * side);
		nose.addVertex(-side / 2, height / 3);
		nose.addEdge(side, 0);
		nose.addEdge(-side / 2, -height);
		nose.setFilled(true);
		nose.setColor(Color.black);
		return nose;
	}
	
	private GPolygon createEye(int side) {
		GPolygon eye = new GPolygon();
		double height = Math.sqrt((side / 2) * (side / 2) + side * side);
		eye.addVertex(-side / 2, -height / 3);
		eye.addEdge(side / 2, height);
		eye.addEdge(side / 2, -height);
		eye.setFilled(true);
		eye.setColor(Color.black);
		return eye;
	}
	
	private GOval createFace(int radius) {
		GOval face = new GOval(radius * 2, radius * 2);
		face.setFilled(true);
		face.setColor(Color.orange);
		return face;
	}
	
	private GPolygon createMouth(int width, int height) {
		GPolygon mouth = new GPolygon();
		double x = Math.sqrt((width / 5)  * (width / 5) / 2);
		mouth.addVertex(0, 0);
		int dir = 1;
		for (int i = 1; i < 11; i ++) {
			mouth.addPolarEdge(x, dir * 45);
			dir *= -1;
		}
		mouth.addPolarEdge(x * 2, -135);
		dir = 1;
		for (int i = 1; i < 7; i ++) {
			mouth.addPolarEdge(x, dir * 135);
			dir *= -1;
		}
		mouth.setFilled(true);
		mouth.setColor(Color.black);
		return mouth;
	}
	
	// Private constants
	private static final int HEAD_RADIUS = 80;
	private static final int EYE = 20;
	private static final int NOSE = 20;
	private static final int MOUTH_HEIGHT = 70;
	private static final int MOUTH_WIDTH = 90;
	private static final int STEM_WIDTH = 8;
	private static final int STEM_HEIGHT = 10;

}
