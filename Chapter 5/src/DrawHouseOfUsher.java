/*
 * File: DrawHouseOfUser.java
 * This program a diagram of the House of Usher.
 */

import acm.program.*;
import acm.graphics.*;

public class DrawHouseOfUsher extends GraphicsProgram {
	
	// Dimensions of the house
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 210;
	private static final double ROOF_HEIGHT = 140;
	
	// Dimensions of the window
	private static final double WINDOW_RADIUS = 15;
	
	// Dimensions of the door
	private static final double DOOR_WIDTH = 40;
	private static final double DOOR_HEIGHT = 70;
	private static final double DOOR_ROOF = 30;
	
	// Dimensions of the towers
	private static final double TOWER_WIDTH = 50;
	private static final double TOWER_HEIGHT = 280;
	private static final double TOWER_ROOF = 70;
	
	// Dimensions of the trees
	private static final double TREE_WIDTH = 25;
	private static final double TREE_HEIGHT = 126;
	private static final double LEAF_HEIGHT = 84;
	private static final double DISTANCE = 50;
	
	public void run() {
		double x = getWidth() / 2;
		double y = (getHeight() - TOWER_HEIGHT - TOWER_ROOF) / 2;
		
		drawHouse(x - HOUSE_WIDTH - TOWER_WIDTH, y, HOUSE_WIDTH, HOUSE_HEIGHT, ROOF_HEIGHT);
		
		drawFrame(x - HOUSE_WIDTH - TOWER_WIDTH * 2, y, TOWER_WIDTH, TOWER_HEIGHT, TOWER_ROOF);
		drawFrame(x - TOWER_WIDTH, y, TOWER_WIDTH, TOWER_HEIGHT, TOWER_ROOF);
		
		for (int i = 0; i < 3; i ++) {
			drawFrame(x + (TREE_WIDTH + DISTANCE) * i + TOWER_WIDTH, y + TOWER_HEIGHT + TOWER_ROOF - TREE_HEIGHT - LEAF_HEIGHT, TREE_WIDTH, TREE_HEIGHT, LEAF_HEIGHT);
		}
	}

	private void drawHouse(double x, double y, double width, double height, double roof) {
		drawFrame(x, y, width, height, roof);
		drawFrame(x + (HOUSE_WIDTH - DOOR_WIDTH) / 2, y + HOUSE_HEIGHT + ROOF_HEIGHT - DOOR_HEIGHT - DOOR_ROOF, DOOR_WIDTH, DOOR_HEIGHT, DOOR_ROOF);
		add(new GOval(x + ((HOUSE_WIDTH / 2) - WINDOW_RADIUS * 2) / 2, y + ROOF_HEIGHT + HOUSE_HEIGHT * 2.0 / 7, WINDOW_RADIUS * 2, WINDOW_RADIUS * 2));
		add(new GOval(x + (HOUSE_WIDTH / 2) + ((HOUSE_WIDTH / 2) - WINDOW_RADIUS * 2) / 2, y + ROOF_HEIGHT + HOUSE_HEIGHT * 2.0 / 7, WINDOW_RADIUS * 2, WINDOW_RADIUS * 2));
	}
	
	private void drawFrame(double x, double y, double width, double height, double roof) {
		GRect lower = new GRect(x, y + roof, width, height);
		add(lower);
		add(new GLine(x, y + roof, x + width / 2, y));
		add(new GLine(x + width, y + roof, x + width / 2, y));
	}
}
