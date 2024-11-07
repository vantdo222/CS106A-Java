/* 
 *File: RobotFace.java
 *--------------------
 *This program displays a robot-looking face.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {
	
	private static final double HEAD_WIDTH = 150;
	private static final double HEAD_HEIGHT = 250;
	private static final double EYE_RADIUS = 30;
	private static final double MOUTH_WIDTH = 100;
	private static final double MOUTH_HEIGHT = 30;
	
	public void run() {
		double x = (getWidth() - HEAD_WIDTH) / 2;
		double y = (getWidth() - HEAD_HEIGHT) / 2;
		
		// Head
		drawRectangle(x, y, HEAD_WIDTH, HEAD_HEIGHT, Color.gray);
		
		// Eyes
		drawCircle(x + HEAD_WIDTH / 8, y + HEAD_HEIGHT / 5, EYE_RADIUS, Color.yellow);
		drawCircle(x + HEAD_WIDTH * (5.0 / 8), y + HEAD_HEIGHT / 5, EYE_RADIUS, Color.yellow);
		
		// Mouth
		drawRectangle(x + ((HEAD_WIDTH - MOUTH_WIDTH)/2), y + HEAD_HEIGHT * (5.0 / 7), MOUTH_WIDTH, MOUTH_HEIGHT, Color.white);
	}
	public void drawRectangle(double cx, double cy, double w, double h, Color c) {
		GRect rect = new GRect(cx, cy, w, h);
		rect.setFilled(true);
		rect.setColor(c);
		add(rect);
	}
	public void drawCircle(double cx, double cy, double r, Color c) {
		GOval circle = new GOval(cx, cy, r, r);
		circle.setFilled(true);
		circle.setColor(c);
		add(circle);
	}

}
