/*
 * File: GameDisplay.java
 * ----------------------
 */

import acm.graphics.*;

import java.awt.Color;
import java.awt.event.*;

public class GameDisplay extends GCanvas implements ComponentListener {
	
	// Dimensions of the canvas, in pixels
	// These should be used when setting up the initial size of the game,
	// but in later calculations you should use getWidth() and getHeight()
	// rather than these constants for accurate size information.
	//public static final double CANVAS_WIDTH = 420;
	//public static final double CANVAS_HEIGHT = 600;

	// Number of bricks in each row
	public static final int NBRICK_COLUMNS = 10;

	// Number of rows of bricks
	public static final int NBRICK_ROWS = 10;

	// Separation between neighboring bricks, in pixels
	public static final double BRICK_SEP = 4;

	// Height of each brick, in pixels
	public static final double BRICK_HEIGHT = 8;

	// Offset of the top brick row from the top, in pixels
	public static final double BRICK_Y_OFFSET = 70;
	
	public GameDisplay() {
		addComponentListener(this);
		
		// Width of each brick, in pixels
		final double BRICK_WIDTH = Math.floor(
				(getWidth() - (NBRICK_COLUMNS + 1.0) * BRICK_SEP) / NBRICK_COLUMNS);
		
		double dx = getWidth();
		double dy = getHeight();
		
		double distance_brick = (dx - BRICK_WIDTH * NBRICK_COLUMNS) / (NBRICK_COLUMNS + 1);
		
		for (int i = 1; i <= NBRICK_COLUMNS; i++) {
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET, BRICK_WIDTH, BRICK_HEIGHT, Color.red);
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + distance_brick + BRICK_HEIGHT, BRICK_WIDTH, BRICK_HEIGHT, Color.red);
		}
		for (int i = 1; i <= NBRICK_COLUMNS; i++) {
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 2, BRICK_WIDTH, BRICK_HEIGHT, Color.orange);
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 3, BRICK_WIDTH, BRICK_HEIGHT, Color.orange);
		}
		for (int i = 1; i <= NBRICK_COLUMNS; i++) {
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 4, BRICK_WIDTH, BRICK_HEIGHT, Color.yellow);
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 5, BRICK_WIDTH, BRICK_HEIGHT, Color.yellow);
		}
		for (int i = 1; i <= NBRICK_COLUMNS; i++) {
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 6, BRICK_WIDTH, BRICK_HEIGHT, Color.green);
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 7, BRICK_WIDTH, BRICK_HEIGHT, Color.green);
		}
		for (int i = 1; i <= NBRICK_COLUMNS; i++) {
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 8, BRICK_WIDTH, BRICK_HEIGHT, Color.cyan);
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 9, BRICK_WIDTH, BRICK_HEIGHT, Color.cyan);
		}
	}
	
	public void createBrick(double x, double y, double width, double height, Color color) {
		GRect brick = new GRect(x, y, width, height);
		brick.setFilled(true);
		brick.setColor(color);
		add(brick);
	}
	
	public void update() {
		removeAll();
		
		double dx = getWidth();
		double dy = getHeight();
		
		// Width of each brick, in pixels
		final double BRICK_WIDTH = Math.floor(
				(getWidth() - (NBRICK_COLUMNS + 1.0) * BRICK_SEP) / NBRICK_COLUMNS);
		
		double distance_brick = (dx - BRICK_WIDTH * NBRICK_COLUMNS) / (NBRICK_COLUMNS + 1);
		
		for (int i = 1; i <= NBRICK_COLUMNS; i++) {
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET, BRICK_WIDTH, BRICK_HEIGHT, Color.red);
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + distance_brick + BRICK_HEIGHT, BRICK_WIDTH, BRICK_HEIGHT, Color.red);
		}
		for (int i = 1; i <= NBRICK_COLUMNS; i++) {
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 2, BRICK_WIDTH, BRICK_HEIGHT, Color.orange);
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 3, BRICK_WIDTH, BRICK_HEIGHT, Color.orange);
		}
		for (int i = 1; i <= NBRICK_COLUMNS; i++) {
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 4, BRICK_WIDTH, BRICK_HEIGHT, Color.yellow);
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 5, BRICK_WIDTH, BRICK_HEIGHT, Color.yellow);
		}
		for (int i = 1; i <= NBRICK_COLUMNS; i++) {
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 6, BRICK_WIDTH, BRICK_HEIGHT, Color.green);
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 7, BRICK_WIDTH, BRICK_HEIGHT, Color.green);
		}
		for (int i = 1; i <= NBRICK_COLUMNS; i++) {
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 8, BRICK_WIDTH, BRICK_HEIGHT, Color.cyan);
			createBrick(BRICK_WIDTH * (i - 1) + distance_brick * i, BRICK_Y_OFFSET + (distance_brick + BRICK_HEIGHT) * 9, BRICK_WIDTH, BRICK_HEIGHT, Color.cyan);
		}
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		update();
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

