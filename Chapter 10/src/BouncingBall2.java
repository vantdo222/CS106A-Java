/*
 * File: BouncingBall2.java
 * -----------------------
 * This program bounces a ball inside the boundaries of the
 * graphics window.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BouncingBall2 extends GraphicsProgram {
	
	public void init() {
		double x = (getWidth() - SIZE) / 2;
		double y = (getHeight() - SIZE) / 2;
		ball = new GOval(x, y, SIZE, SIZE);
		ball.setFilled(true);
		ball.setFillColor(Color.red);
		add(ball);
		
		startButton = new JButton("Start");
		add(startButton, SOUTH);
		
		stopButton = new JButton("Stop");
		add(stopButton, SOUTH);
		
		speedSlider = new JSlider(MIN_SPEED, MAX_SPEED, DEFAULT_SPEED);
		add(new JLabel (" Slow"), SOUTH);
		add(speedSlider, SOUTH);
		add(new JLabel ("Fast "), SOUTH);
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton) {
			bounce = true;
		} else if (e.getSource() == stopButton) {
			bounce = false;
		}
	}
	
	public void run() {
		double dx = 1;
		double dy = 1;
		
		waitForStart();
		
		while (true) {
			if (bounce) {
				pauseTime = 101 - speedSlider.getValue();
				ball.move(dx, dy);
				pause(pauseTime);
			}
			if (ball.getY() > getHeight() - SIZE) {
				dy *= -1;
			} else if (ball.getY() < 0) {
				dy *= -1;
			} else if (ball.getX() > getWidth() - SIZE) {
				dx *= -1;
			} else if (ball.getX() < 0) {
				dx *= -1;
			}
		}
	}
	
	public void waitForStart() {
		while (!bounce) {
			pause(100);
		}
	}
	
	private static final int SIZE = 50;
	private double pauseTime = DEFAULT_SPEED;
	private boolean bounce = false;
	private static final int MIN_SPEED = 1;
	private static final int MAX_SPEED = 100;
	private static final int DEFAULT_SPEED = 50;
	
	private JButton startButton;
	private JButton stopButton;
	private JSlider speedSlider;
	private GOval ball;

}