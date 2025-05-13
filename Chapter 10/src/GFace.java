/*
 * File: GFace.java
 * ----------------
 * This file defines a compound GFace class.
 */

import acm.graphics.*;
import java.awt.*;

public class GFace extends GCompound {
	
	// Creates a new GFace object with the specified dimensions
	public GFace(double width, double height) {
		head = new GOval(width, height);
		leftEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		rightEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		nose = createNose(NOSE_WIDTH * width, NOSE_HEIGHT * height);
		mouth = new GRect(MOUTH_WIDTH * width, MOUTH_HEIGHT * height);
		//left_pupil = createPupil(PUPIL_RADIUS * width);
		//right_pupil = createPupil(PUPIL_RADIUS * width);
		
		add(head, 0 , 0);
		add(leftEye, 0.25 * width - EYE_WIDTH * width / 2,
				0.25 * height - EYE_HEIGHT * height / 2);
		add(rightEye, 0.75 * width - EYE_WIDTH * width / 2,
				0.25 * height - EYE_HEIGHT * height / 2);
		add(nose, 0.5 * width, 0.5 * height);
		add(mouth, 0.5 * width - MOUTH_WIDTH * width / 2,
				0.75 * height - MOUTH_HEIGHT * height / 2);
		//add(left_pupil, 0.23 * width - PUPIL_RADIUS * width / 2,
			//	0.23 * height - PUPIL_RADIUS * height / 2);
		//add(right_pupil, 0.73 * width - PUPIL_RADIUS * width / 2,
			//	0.23 * height - PUPIL_RADIUS * height / 2);
	}
	
	// Creates a triangle for the nose
	private GPolygon createNose(double width, double height) {
		GPolygon nose = new GPolygon();
		nose.addVertex(-width / 2, height / 3);
		nose.addEdge(width, 0);
		nose.addEdge(-width / 2, -height);
		return nose;
	}
	
	/* private GCompound createPupil(double radius) {
		GOval circle = new GOval(radius * 2, radius * 2);
		circle.setFilled(true);
		circle.setColor(Color.BLACK);
		GCompound pupil = new GCompound();
		pupil.add(circle);
		return pupil;
	}
	*/ 
	
	// Constants specifying feature size as a fraction of the head size
	private static final double EYE_WIDTH = 0.15;
	private static final double EYE_HEIGHT = 0.15;
	private static final double NOSE_WIDTH = 0.15;
	private static final double NOSE_HEIGHT = 0.10;
	private static final double MOUTH_WIDTH = 0.5;
	private static final double MOUTH_HEIGHT = 0.03;
	private static final double PUPIL_RADIUS = 0.035;
	
	// Private instance variables
	private GOval head;
	GOval leftEye, rightEye;
	private GPolygon nose;
	private GRect mouth;
	GCompound left_pupil, right_pupil;
}
