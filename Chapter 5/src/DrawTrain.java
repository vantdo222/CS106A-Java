/*
 * File: DrawTrain.java
 * --------------------
 * This program draws a train with an engine, a box car and
 * a caboose.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawTrain extends GraphicsProgram {
	
	// Dimensions of the frame of a train car
	private static final double CAR_WIDTH = 75;
	private static final double CAR_HEIGHT = 36;
	
	// Distance from the bottom of a train car to the track below it
	private static final double CAR_BASELINE = 10;
	
	// Width of the connector, which overlaps between successive cars
	private static final double CAR_CONNECTOR = 6;
	
	// Radius of the wheels on each car
	private static final double WHEEL_RADIUS = 8;
	
	// Distance from the edge of the frame to the center of the wheel
	private static final double WHEEL_INSET = 16;
	
	// Dimensions of the cab on the engine
	private static final double CAB_WIDTH = 35;
	private static final double CAB_HEIGHT = 8;
	
	// Dimensions of the smokestack and its distance from the front
	private static final double SMOKESTACK_WIDTH = 8;
	private static final double SMOKESTACK_HEIGHT = 8;
	private static final double SMOKESTACK_INSET = 8;
	
	// Dimensions of the door panels on the boxcar
	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;
	
	// Dimensions of the cupola on the caboose
	private static final double CUPOLA_WIDTH = 35;
	private static final double CUPOLA_HEIGHT = 8;
	
	public void run() {
		double trainWidth = CAR_WIDTH * 3 + CAR_CONNECTOR * 6;
		double x = (getWidth() - trainWidth) / 2;
		double y = getHeight();
		
		drawEngine(x, y);
		drawBoxcar(x + CAR_WIDTH + CAR_CONNECTOR * 2, y, Color.green);
		drawCaboose(x + CAR_WIDTH * 2 + CAR_CONNECTOR * 4, y);
	}
	
	private void drawCaboose(double x, double y) {
		drawCarFrame(x, y, Color.red);
		drawCab(x + (CAR_WIDTH - CUPOLA_WIDTH) / 2, y, Color.red);
	}
	
	private void drawBoxcar(double x, double y, Color color) {
		drawCarFrame(x, y, color);
		drawDoor(x, y);
	}
	
	private void drawEngine(double x, double y) {
		drawCarFrame(x, y, Color.black);
		drawSmokestack(x + SMOKESTACK_INSET, y);
		drawCab(x + CAR_WIDTH  - CUPOLA_WIDTH, y, Color.black);
		drawCowcatcher(x, y);
	}
	
	private void drawDoor(double x, double y) {
		double cx = x + CAR_CONNECTOR + (CAR_WIDTH - DOOR_WIDTH * 2) / 2;
		double cy = y - CAR_BASELINE - DOOR_HEIGHT;
		
		add(new GRect(cx , cy, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GRect(cx + DOOR_WIDTH , cy, DOOR_WIDTH, DOOR_HEIGHT));
	}
	
	private void drawSmokestack(double x, double y) {
		GRect smokestack = new GRect(x + CAR_CONNECTOR, y - CAR_HEIGHT - SMOKESTACK_HEIGHT - CAR_BASELINE, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
		smokestack.setFilled(true);
		smokestack.setFillColor(Color.black);
		add(smokestack);
	}
	
	private void drawCab (double x, double y, Color color) {
		GRect cab = new GRect(x + CAR_CONNECTOR, y - CAR_HEIGHT - SMOKESTACK_HEIGHT - CAR_BASELINE, CUPOLA_WIDTH, CUPOLA_HEIGHT);
		cab.setFilled(true);
		cab.setFillColor(color);
		add(cab);
	}
	
	private void drawCowcatcher (double x, double y) {
		double cx = x + CAR_CONNECTOR;
		double cy = y - CAR_BASELINE;
		
		add(new GLine(x, cy, cx, cy - CAR_HEIGHT / 2));
		add(new GLine(x + CAR_CONNECTOR / 2, cy, cx, cy - CAR_HEIGHT / 2));
	}
	
	private void drawCarFrame(double x, double y, Color color) {
		double cx = x + CAR_CONNECTOR;
		double cy = y - CAR_BASELINE;
		
		add(new GLine(x, cy, x + CAR_CONNECTOR * 2 + CAR_WIDTH, cy));
		
		drawWheel(cx + WHEEL_INSET, y - WHEEL_RADIUS);
		drawWheel(cx + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
		
		GRect frame = new GRect(cx, cy - CAR_HEIGHT, CAR_WIDTH, CAR_HEIGHT);
		frame.setFilled(true);
		frame.setFillColor(color);
		add(frame);
	}

	private void drawWheel(double x, double y) {
		double r = WHEEL_RADIUS;
		GOval wheel = new GOval(x - r, y - r, r * 2, r * 2);
		wheel.setFilled(true);
		wheel.setFillColor(Color.darkGray);
		add(wheel);
	}
}
