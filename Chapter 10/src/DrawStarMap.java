/*
 * File: DrawStarMap.java
 * ----------------------
 * This program creates a five-pointed star everytime the user
 * clicks the mouse on the canvas.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawStarMap extends GraphicsProgram {
	
	// Initializes the mouse listeners
	public void init() {
		addMouseListeners();
		add(new JButton("Clear"), SOUTH);
		addActionListeners();
		fillCheckBox = new JCheckBox("Filled");
		fillCheckBox.setSelected(true);
		add(fillCheckBox, SOUTH);
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(smallButton);
		sizeGroup.add(mediumButton);
		sizeGroup.add(largeButton);
		mediumButton.setSelected(true);
		add(smallButton, SOUTH);
		add(mediumButton, SOUTH);
		add(largeButton, SOUTH);
		
	}
	
	// Called whenever the user clicks the mouse
	public void mouseClicked(MouseEvent e) {
		GStar star = new GStar(getCurrentSize());
		star.setFilled(fillCheckBox.isSelected());
		add(star, e.getX(), e.getY());
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) removeAll();
	}
	
	private double getCurrentSize() {
		if(smallButton.isSelected()) return SMALL_SIZE;
		if(largeButton.isSelected()) return LARGE_SIZE;
		return MEDIUM_SIZE;
		
	}
	
	// Private constants
	private static final double MEDIUM_SIZE = 20;
	private static final double SMALL_SIZE = 10;
	private static final double LARGE_SIZE = 30;
	private JCheckBox fillCheckBox;
	private JRadioButton smallButton = new JRadioButton("Small");
	private JRadioButton mediumButton = new JRadioButton("Medium");
	private JRadioButton largeButton = new JRadioButton("Large");

}
