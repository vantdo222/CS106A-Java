/*
 * File: CenteredText.java
 * -----------------------
 * This program displays the text message "CS106A
 * rocks my socks" in the center of the window.
 */

import acm.program.*;
import acm.graphics.*;

public class CenteredText extends GraphicsProgram {
	
	public void run() {
		GLabel text = new GLabel("CS106A rocks my socks!");
		text.setFont("SanSerif-28");
		double x = (getWidth() - text.getWidth()) / 2;
		double y = (getHeight() - text.getHeight()) / 2;
		text.setLocation(x, y);
		add(text);
	}
}
