/*
 * File: GFace.java
 * ----------------
 * This file defines a compound GFace class.
 */

import acm.graphics.*;

public class GFace extends GCompound {
	
	// Creates a new GFace object with the specified dimensions
	public GFace(double width, double height) {
		head = new GOval(width, height);
		leftEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		rightEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		nose = createNose(NOSE_WIDTH * width, NOSE_HEIGHT * height);
		mouth = new GRect(MOUTH_WIDTH * width, MOUTH_HEIGHT * height);
		add(head, 0 , 0);
		add(leftEye, 0.25 * width - EYE_WIDTH * width / 2,
				0.25 * height - EYE_HEIGHT * height / 2);
		add(rightEye, 0.75 * width - EYE_WIDTH * width / 2,
				0.25 * height - EYE_HEIGHT * height / 2);
		add(nose, 0.5 * width, 0.5 * height);
		add(mouth, 0.5 * width - MOUTH_WIDTH * width / 2,
				0.75 * height - MOUTH_HEIGHT * height / 2);
	}
	
	// Creates a triangle for the nose
	private GPolygon createNose(double width, double height) {
		GPolygon nose = new GPolygon();
		nose.addVertex(-width / 2, height / 3);
		nose.addEdge(width, 0);
		nose.addEdge(-width / 2, -height);
		return nose;
	}
	
	// Constants specifying feature size as a fraction of the head size
	private static final double EYE_WIDTH = 0.15;
	private static final double EYE_HEIGHT = 0.15;
	private static final double NOSE_WIDTH = 0.15;
	private static final double NOSE_HEIGHT = 0.10;
	private static final double MOUTH_WIDTH = 0.5;
	private static final double MOUTH_HEIGHT = 0.03;
	
	// Private instance variables
	private GOval head;
	private GOval leftEye, rightEye;
	private GPolygon nose;
	private GRect mouth;

}
