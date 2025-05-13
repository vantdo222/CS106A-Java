/*
 * File: SpeedControlBar.java
 * --------------------------
 */

import acm.program.*;
import javax.swing.*;

public class SpeedControlBar extends GraphicsProgram {
	
	public void init() {
		add(new JButton("Start"), SOUTH);
		add(new JButton("Stop"), SOUTH);
		add(new JLabel(" Slow"), SOUTH);
		add(new JSlider(50, 1, 16), SOUTH);
		add(new JLabel("Fast "), SOUTH);
	}
	
}
