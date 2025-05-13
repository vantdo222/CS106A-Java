/*
 * File: DrawRectangle.java
 * ------------------------
 * This program allows you to create a rectangle by pressing
 * the mouse at one corner and then dragging it to the
 * opposite corner.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
import java.awt.*;

public class DrawRectangle extends GraphicsProgram {
	
	public void init() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		rectangle = new GRect(e.getX(), e.getY(), 0, 0);
		rectangle.setFilled(true);
		//rectangle.setFillColor(Color.BLACK);
		add(rectangle);
		startX = rectangle.getX();
		startY = rectangle.getY();
	}
	
	public void mouseDragged(MouseEvent e) {
		double currentX = e.getX();
		double currentY = e.getY();

		double x = Math.min(startX, currentX);
		double y = Math.min(startY, currentY);
		double width = Math.abs(currentX - startX);
		double height = Math.abs(currentY - startY);

		rectangle.setBounds(x, y, width, height);
	}

	private GRect rectangle;
	private double startX;
	private double startY;
}
