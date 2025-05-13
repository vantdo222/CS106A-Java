/*
 * File: MouseTracker.java
 * -----------------------
 * This program displays the coordinates of the mouse as you move
 * or drag it in the window. The coordinates always appear slightly
 * to the left of the current mouse position.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class MouseTracker extends GraphicsProgram {
	
	public void init() {
		addMouseListeners();
		label = new GLabel("(0, 0)");
		add(label);
	}
	
	public void mouseMoved(MouseEvent e) {
		label.setLabel("(" + e.getX() + ", " + e.getY() + ")");
		label.setLocation(e.getX() - label.getWidth(), e.getY() + 5);
	}
	
	public void mouseDragged(MouseEvent e) {
		label.setLabel("(" + e.getX() + ", " + e.getY() + ")");
		label.setLocation(e.getX() - label.getWidth(), e.getY() + 5);
	}
	
	private GLabel label;
}
