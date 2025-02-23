/*
 * File: DrawHouse.java
 * This program draws a line drawing of a house
 */

import acm.program.*;
import acm.graphics.*;

public class DrawHouse extends GraphicsProgram {
	
	// Dimensions of the house
	private static final double HOUSE_WIDTH = 350;
	private static final double HOUSE_HEIGHT = 300;
	
	// Dimensions of the roof
	private static final double ROOF_HEIGHT = 100;
	
	// Dimensions of the door
	private static final double DOOR_WIDTH = 65;
	private static final double DOOR_HEIGHT = 100;
	private static final double DOOR_KNOB = 5;
	
	// Dimensions of the winder
	private static final double WINDOW_WIDTH = 25;
	private static final double WINDOW_HEIGHT = 30;
	
	public void run() {
		double x = (getWidth() - HOUSE_WIDTH) / 2;
		double y = (getHeight() - HOUSE_HEIGHT - ROOF_HEIGHT) / 2;
		double cx = (HOUSE_WIDTH / 2 - (WINDOW_WIDTH * 2)) / 2;
		
		drawHouseFrame(x, y);
		drawDoor(x + (HOUSE_WIDTH - DOOR_WIDTH) / 2, y + HOUSE_HEIGHT + ROOF_HEIGHT - DOOR_HEIGHT);
		drawWindow(x + cx, y + ROOF_HEIGHT + HOUSE_HEIGHT * 1.0 / 7, 2, 2);
		drawWindow(x + cx + HOUSE_WIDTH / 2, y + ROOF_HEIGHT + HOUSE_HEIGHT * 1.0 / 7, 2, 2);
		drawWindow(x + cx - WINDOW_WIDTH / 2, y + ROOF_HEIGHT + HOUSE_HEIGHT * 4.0 / 7, 2, 3);
		drawWindow(x + cx - WINDOW_WIDTH / 2 + (HOUSE_WIDTH / 2), y + ROOF_HEIGHT + HOUSE_HEIGHT * 4.0 / 7, 2, 3);
	}
	
	private void drawHouseFrame(double x, double y) {
		GRect house = new GRect(x, y + ROOF_HEIGHT, HOUSE_WIDTH, HOUSE_HEIGHT);
		add(house);
		add(new GLine(x, y + ROOF_HEIGHT, x + HOUSE_WIDTH / 2, y));
		add(new GLine(x + HOUSE_WIDTH, y + ROOF_HEIGHT, x + HOUSE_WIDTH / 2, y));
	}
	
	private void drawDoor(double x, double y) {
		GRect door = new GRect(x, y, DOOR_WIDTH, DOOR_HEIGHT);
		add(door);
		
		GOval knob = new GOval(x + DOOR_WIDTH * 7.0 / 9, y + (DOOR_HEIGHT - DOOR_KNOB * 2) / 2, DOOR_KNOB * 2, DOOR_KNOB * 2);
		add(knob);
	}
	
	private void drawWindow(double x, double y, int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				GRect window = new GRect(x + WINDOW_WIDTH * j, y + WINDOW_HEIGHT * i, WINDOW_WIDTH, WINDOW_HEIGHT);
				add(window);
			}
		}
	}
}
