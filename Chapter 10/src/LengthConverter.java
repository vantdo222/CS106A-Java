/*
 * File: LengthConverter.java
 * --------------------------
 * This program translates back and forth between the 
 * tradditional English system of units and the modern
 * system of units.
 */

import acm.graphics.*;
import acm.program.*;
import acm.gui.*;
import javax.swing.*;
import java.awt.event.*;

public class LengthConverter extends Program {
	
	private JComboBox leftUnitChooser, rightUnitChooser;
	private DoubleField leftField, rightField;
	
	public void init() {
		setLayout(new TableLayout(3, 2));
		
		leftUnitChooser = initUnitChooser();
		leftUnitChooser.setSelectedItem("Miles");
		rightUnitChooser = initUnitChooser();
		rightUnitChooser.setSelectedItem("Feet");
		
		leftField = new DoubleField(1.0);
		leftField.setActionCommand("Convert ->");
		leftField.addActionListener(this);
		rightField = new DoubleField(5280.0);
		rightField.setActionCommand("<- Convert");
		rightField.addActionListener(this);
		
		add(leftUnitChooser);
		add(rightUnitChooser);
		add(leftField);
		add(rightField);
		add(new JButton("Convert ->"));
		add(new JButton("<- Convert"));
		addActionListeners();
	}
	
	public JComboBox initUnitChooser() {
		JComboBox unitChooser = new JComboBox();
		unitChooser.addItem("Miles");
		unitChooser.addItem("Inches");
		unitChooser.addItem("Feet");
		unitChooser.addItem("Yards");
		unitChooser.addItem("Fathoms");
		unitChooser.addItem("Rods");
		unitChooser.addItem("Furlongs");
		return unitChooser;
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		String leftUnit = (String) leftUnitChooser.getSelectedItem();
		String rightUnit = (String) rightUnitChooser.getSelectedItem();
		
		if (cmd.equals("Convert ->")) {
			rightField.setValue(converter(leftField.getValue(), leftUnit, rightUnit));
		} else if (cmd.equals("<- Convert")){
			leftField.setValue(converter(rightField.getValue(), rightUnit, leftUnit));
		}
	}
	
	public double converter(double a, String origin, String goal) {
		switch (origin) {
		default:
			switch (goal) {
			default: return a * 12.0;
			case "Yards": return a / 3.0;
			case "Miles": return a / 5280.0;
			case "Fathoms": return a / 6.0;
			case "Rods": return a / 16.5;
			case "Furlongs": return a / 660.0;
			}
		case "Yard":
			switch (goal) {
			default: return a * 3.0;
			case "Inches": return a * 36.0;
			case "Miles": return a / 1760.0;
			case "Fathoms": return a / 2.0;
			case "Rods": return a / 5.5;
			case "Furlongs": return a / 220.0;
			}
		case "Miles":
			switch (goal) {
			default: return a * 5280;
			case "Inches": return a * 63360.0;
			case "Yards": return a  * 1760.0;
			case "Fathoms": return a * 880.0;
			case "Rods": return a * 320.0;
			case "Furlongs": return a * 8.0;
			}
		case "Fathoms":
			switch (goal) {
			default: return a * 6.0;
			case "Inches": return a * 72.0;
			case "Yards": return a * 2;
			case "Miles": return a / 880.0;
			case "Rods": return a / 2.75;
			case "Furlongs": return a / 110.0;
			}
		case "Rods":
			switch (goal) {
			default: return a * 16.5;
			case "Inches": return a * 198.0;
			case "Yards": return a * 5.5;
			case "Miles": return a / 320.0;
			case "Fathoms": return a * 2.75;
			case "Furlongs": return a / 40.0;
			}
		case "Furlongs":
			switch (goal) {
			default: return a * 660.0;
			case "Inches": return a * 7920.0;
			case "Yards": return a * 220.0;
			case "Miles": return a / 8.0;
			case "Rods": return a * 40.0;
			case "Fathoms": return a * 110;
			}
		case "Inches":
			switch (goal) {
			default: return a / 12.0;
			case "Yards": return a / 36.0;
			case "Miles": return a / 63360.0;
			case "Rods": return a / 198.0;
			case "Fathoms": return a / 72.0;
			case "Furlongs": return a / 7920.0;
			}
		}
	}

}
