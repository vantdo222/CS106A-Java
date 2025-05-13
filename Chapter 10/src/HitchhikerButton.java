/*
 * File: HitchhikerButton.java
 * ---------------------------
 * This program puts up a button on the screen, which triggers a
 * message inspired by Douglas Adams's novel.
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class HitchhikerButton extends ConsoleProgram {
	
// Initializes the user-interface buttons
	public void init() {
		ImageIcon icon = new ImageIcon("RedSquare.gif");
		JButton button = new JButton(icon);
		button.setActionCommand("Red");
		add(button, SOUTH);
		addActionListeners();
	}
	
// Responds to a button action
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Red")) {
			println("Please do not press this button again.");
		}
	}

}
