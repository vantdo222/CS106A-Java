/*
 * File: Calculator.java
 * ---------------------
 * This program implements a simple four-function calculator
 */

import acm.gui.*;
import acm.program.*;
import acm.gui.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends Program {
	
	public void init() {
		setLayout(new TableLayout(5, 4));
		display = new CalculatorDisplay();
		add(display, "gridwidth = 4 height =" + BUTTON_SIZE);
		addButtons();
		addActionListeners();
	}

/* Called on each action event; the response is determined by the
 * button
*/
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source instanceof CalculatorButton) {
			((CalculatorButton) source).action(display);
		}
	}
	
/* Adds the buttons to the calculator */
	private void addButtons() {
		String constraint = "width=" + BUTTON_SIZE + " height=" + BUTTON_SIZE;
		add(new DigitButton(7), constraint);
		add(new DigitButton(8), constraint);
		add(new DigitButton(9), constraint);
		add(new AddButton(), constraint);
		add(new DigitButton(4), constraint);
		add(new DigitButton(5), constraint);
		add(new DigitButton(6), constraint);
		add(new SubtractButton(), constraint);
		add(new DigitButton(1), constraint);
		add(new DigitButton(2), constraint);
		add(new DigitButton(3), constraint);
		add(new MultiplyButton(), constraint);
		add(new ClearButton(), constraint);
		add(new DigitButton(0), constraint);
		add(new EqualsButton(), constraint);
		add(new DivideButton(), constraint);
	}

// Private constants and instance variables
	private static final int BUTTON_SIZE = 60;
	private CalculatorDisplay display;
}
