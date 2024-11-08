/*
 * File: BouncingBall.java
 * -----------------------
 * This program bounces a ball inside the boundaries of the
 * graphics window.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class BouncingBall extends GraphicsProgram {
	
	private static final int SIZE = 50;
	private static final int PAUSE_TIME = 5;
	
	public void run() {
		double x = (getWidth() - SIZE) / 2;
		double y = (getHeight() - SIZE) / 2;
		GOval ball = new GOval(x, y, SIZE, SIZE);
		ball.setFilled(true);
		ball.setFillColor(Color.red);
		add(ball);
		double dx = 1;
		double dy = 1;
		while (true) {
			ball.move(dx, dy);
			pause(PAUSE_TIME);
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

}
