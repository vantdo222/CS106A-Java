/*
 * File: DrawStarMap2.java
 * -----------------------
 * This program creates a five-pointed star every time the
 * user clicks the mouse on the canvas. This version includes
 * a JButton to clear the screen, a JSlider to choose the size,
 * and a JComboBox to choose the color.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawStarMap3 extends GraphicsProgram {
	
	//Initializes the graphical user interface
	public void init() {
		setBackground(Color.GRAY);
		add(new JButton("Clear"), SOUTH);
		sizeSlider = new JSlider(MIN_SIZE, MAX_SIZE, INITIAL_SIZE);
		add(new JLabel(" Small"), SOUTH);
		add(sizeSlider, SOUTH);
		add(new JLabel("Large "), SOUTH);
		initColorChooser();
		add(colorChooser, SOUTH);
		starNameField = new JTextField("Enter your star name");
		starNameField.addActionListener(this);
		add(starNameField, SOUTH);
		
		addMouseListeners();
		addActionListeners();
		addKeyListeners();
	}
	
	// Initializes the color chooser
	private void initColorChooser() {
		colorChooser = new JComboBox();
		colorChooser.addItem(new LabeledColor(Color.WHITE, "White"));
		colorChooser.addItem(new LabeledColor(Color.RED, "Red"));
		colorChooser.addItem(new LabeledColor(Color.YELLOW, "Yellow"));
		colorChooser.addItem(new LabeledColor(Color.ORANGE, "Orange"));
		colorChooser.addItem(new LabeledColor(Color.GREEN, "Green"));
		colorChooser.addItem(new LabeledColor(Color.BLUE, "Blue"));
		colorChooser.addItem(new LabeledColor(Color.BLACK, "Black"));
		colorChooser.setEditable(false);
		colorChooser.setSelectedItem(new LabeledColor(Color.WHITE, "White"));
	}
	
	// Returns the current size
	private double getCurrentSize() {
		return sizeSlider.getValue();
	}
	
	// Called whenever the user clicks the mouse
	public void mouseClicked(MouseEvent e) {
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
		if (gobj != null) gobj.sendToFront();
		else {
			GStar star = new GStar(getCurrentSize());
			star.setFilled(true);
			star.setColor((Color) colorChooser.getSelectedItem());
			add(star, e.getX(), e.getY());
			selectedStar = star;
		}
	}
	
	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
		if (gobj != null) gobj.sendToFront();
		else {
			GStar star = new GStar(getCurrentSize());
			star.setFilled(true);
			star.setColor((Color) colorChooser.getSelectedItem());
			add(star, e.getX(), e.getY());
			selectedStar = star;
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if (gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if (gobj != null) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP: gobj.move(0,  -1); break;
			case KeyEvent.VK_DOWN: gobj.move(0, +1); break;
			case KeyEvent.VK_LEFT: gobj.move(-1, 0); break;
			case KeyEvent.VK_RIGHT: gobj.move(+1, 0); break;
			}
		}
	}
	
	// Called whenever an action event occurs
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) removeAll();
		else if (e.getSource() == starNameField && selectedStar != null) {
			GLabel starName = new GLabel(starNameField.getText());
			starName.setColor((Color) colorChooser.getSelectedItem());
			add(starName, selectedStar.getX() + (double) (selectedStar.getWidth() * 0.75), selectedStar.getY());
			selectedLabel = starName;
		}
	}
	
	// Private constants
	private static final int MIN_SIZE = 1;
	private static final int MAX_SIZE = 50;
	private static final int INITIAL_SIZE = 16;
	
	
	// Private instance variables
	private JSlider sizeSlider;
	private JComboBox colorChooser;
	private GStar selectedStar;
	private GPoint last;
	private JTextField starNameField;
	private GLabel selectedLabel;
	private GObject gobj;
}
