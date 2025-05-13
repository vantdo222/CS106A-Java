/*
 * File: Breakout.java
 * -------------------
 * Name: Van Do
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

	// Dimensions of the canvas, in pixels
	// These should be used when setting up the initial size of the game,
	// but in later calculations you should use getWidth() and getHeight()
	// rather than these constants for accurate size information.
	public static final double CANVAS_WIDTH = 420;
	public static final double CANVAS_HEIGHT = 600;

	// Number of bricks in each row
	public static final int NBRICK_COLUMNS = 10;

	// Number of rows of bricks
	public static final int NBRICK_ROWS = 10;

	// Separation between neighboring bricks, in pixels
	public static final double BRICK_SEP = 4;

	// Width of each brick, in pixels
	public static final double BRICK_WIDTH = Math.floor(
			(CANVAS_WIDTH - (NBRICK_COLUMNS + 1.0) * BRICK_SEP) / NBRICK_COLUMNS);

	// Height of each brick, in pixels
	public static final double BRICK_HEIGHT = 8;

	// Offset of the top brick row from the top, in pixels
	public static final double BRICK_Y_OFFSET = 70;

	// Dimensions of the paddle
	public static final double PADDLE_WIDTH = 60;
	public static final double PADDLE_HEIGHT = 10;

	// Offset of the paddle up from the bottom 
	public static final double PADDLE_Y_OFFSET = 30;

	// Radius of the ball in pixels
	public static final double BALL_RADIUS = 10;

	// The ball's vertical velocity.
	public static final double VELOCITY_Y = 3.0;

	// The ball's minimum and maximum horizontal velocity; the bounds of the
	// initial random velocity that you should choose (randomly +/-).
	public static final double VELOCITY_X_MIN = 1.0;
	public static final double VELOCITY_X_MAX = 3.0;

	// Animation delay or pause time between ball moves (ms)
	public static final double DELAY = 1000.0 / 60.0;

	public int turns = 3;
	public int remainingBricks = 100;
	private GRect paddle;
	private GOval ball;
	private GPoint last;
	private GObject gobj;
	private AudioClip bounceClip;
	private double vx, vy;
	private boolean bounce = false;

	public void run() {
		// Set the window's title bar text
		setTitle("CS 106A Breakout");

		// Set the canvas size.  In your code, remember to ALWAYS use getWidth()
		// and getHeight() to get the screen dimensions, not these constants!
		
		GLabel startLabel = new GLabel("Click the paddle to start playing");
		startLabel.setFont("SansSerif-bold-20");
		startLabel.setColor(Color.RED);
		add(startLabel, (getWidth() - startLabel.getWidth()) / 2, paddle.getY() - 50);
		waitForStart();
		
		vx = rgen.nextDouble(1.0, 3.0);
		vy = rgen.nextDouble(1.0, 3.0);
		if (rgen.nextBoolean(0.5)) vx = -vx;
		
		while (turns != 0 && remainingBricks > 0) {
			if (bounce) {
				ball.move(vx, vy);
				pause(9);
				remove(startLabel);
			}
			
			if (ball.getX() > getWidth() - ball.getWidth() || ball.getX() < 0) vx *= -1;
			if (ball.getY() < 0) vy *= -1;
			if (ball.getY() + ball.getHeight() > paddle.getY() + paddle.getHeight()) {
				remove(ball);
				add(ball, (getWidth() - BALL_RADIUS * 2) / 2, (getHeight() - BALL_RADIUS * 2) / 2);
				turns -= 1;
				bounce = false;
			}
			
			GObject collider = getCollidingObject(ball);
			if (collider == paddle) {
				vy *= -1;
				bounceClip.play();
			} else if (collider != null) {
				vy *= -1;
				remove(collider);
				remainingBricks -= 1;
				bounceClip.play();
			}
		}
		
		if (remainingBricks == 0) {
			GLabel winLabel = new GLabel("Congratulations, you won!");
			winLabel.setFont("SansSerif-bold-20");
			winLabel.setColor(Color.RED);
			add(winLabel, (getWidth() - winLabel.getWidth()) / 2, paddle.getY() - 50);
		} else if (turns == 0) {
			GLabel lostLabel = new GLabel("You lose!");
			lostLabel.setFont("SansSerif-bold-20");
			lostLabel.setColor(Color.RED);
			add(lostLabel, (getWidth() - lostLabel.getWidth()) / 2, paddle.getY() - 50);
		}
		
	}
	
	public void init() {
		
double x = getWidth();
		
		// Set up bricks
		double distance_brick = (x - BRICK_WIDTH * NBRICK_COLUMNS) / (NBRICK_COLUMNS + 1);
		
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
		
		// Set up paddle
		paddle = new GRect((getWidth() - PADDLE_WIDTH) / 2, getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT, PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		paddle.addMouseListener(this);
		add(paddle);
		
		// Set up ball
		ball = new GOval((getWidth() - BALL_RADIUS * 2) / 2, (getHeight() - BALL_RADIUS * 2) / 2, BALL_RADIUS * 2, BALL_RADIUS * 2);
		ball.setFilled(true);
		ball.addMouseListener(this);
		add(ball);
		
		// Set up audio
		bounceClip = MediaTools.loadAudioClip("bounce.au");
	}
	
	public GObject getCollidingObject(GOval ball) {
		if (getElementAt(ball.getX(), ball.getY()) != null) {
			return getElementAt(ball.getX(), ball.getY());
		} else if (getElementAt(ball.getX() + ball.getWidth(), ball.getY()) != null) {
			return getElementAt(ball.getX() + ball.getWidth(), ball.getY());
		} else if (getElementAt(ball.getX(), ball.getY() + ball.getHeight()) != null) {
			return getElementAt(ball.getX(), ball.getY() + ball.getHeight());
		}
		return getElementAt(ball.getX() + ball.getWidth(), ball.getY() + ball.getHeight());
	}
	
	public void createBrick(double x, double y, double width, double height, Color color) {
		GRect brick = new GRect(x, y, width, height);
		brick.setFilled(true);
		brick.setColor(color);
		add(brick);
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void waitForStart() {
		while (!bounce) {
			pause(100);
		}
	}
	
	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getPoint());
		gobj = (GRect) getElementAt(last);
		if (gobj.equals(paddle)) {
			bounce = true;
		}
		
	}
	
	public void mouseDragged(MouseEvent e) {
		double dx = e.getX() - last.getX();
		if (gobj.equals(paddle)) {
			if (paddle.getX() < 0) {
				paddle.setLocation(0, paddle.getY());
			} else if (paddle.getX() + PADDLE_WIDTH > getWidth()) {
				paddle.setLocation(getWidth() - PADDLE_WIDTH, paddle.getY());
			}
			paddle.move(dx, 0);
			last = new GPoint(e.getPoint());
		}
	}
}
