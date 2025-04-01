/*
 * File: SlotMachine.java
 * ----------------------
 * This program simulates playing a slot machine. The player
 * started with an initial stake of $50 and then let the user play
 * until either the money runs out or the user decides to quit.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.*;

public class SlotMachine extends GraphicsProgram {
	
	public void run() {
		setBackground(Color.gray);
		int stake = 50;
		double dx = (getWidth() - 3 * 199 - 100) / 2;
		for (int i = 0; i < 3; i ++) {
			addSlot(dx + 249 * i, 50);
		}
		GLabel l1 = createText("Welcome to the slot machine!");
		add(l1, 50, 300);
		GLabel l2 = createText("You now have $" + Integer.toString(stake));
		add(l2, 50, 340);
		GLabel l3 = createText("Click to play.");
		add(l3, 50, 380);
		
		while (true) {
			waitForClick();
			
			remove(l1);
			remove(l2);
			
			String s1 = Spin();
			String s2 = Spin();
			String s3 = Spin();
			int result = 0;
			
			GImage slot1 = createImage(s1);
			add(slot1, dx + 0.5, 50.5);
			pause(1000);
			GImage slot2 = createImage(s2);
			add(slot2, dx + 249.5, 50.5);
			pause(1000);
			GImage slot3 = createImage(s3);
			add(slot3, dx + 249 * 2 + 0.5, 50.5);
			pause(1000);
			
			if (s1.equals("Cherry.gif")) {
				if (s2.equals(s1)) {
					if (s3.equals(s1)) {
						result = 7;
					} else {
						result = 5;
					}
				} else {
					result = 2;
				}
			} else if (s1.equals("Orange.gif") && s2.equals(s1) && (s3.equals(s1) || s3.equals("Bar.gif"))) {
				result = 10;
			} else if (s1.equals("Plum.gif") && s2.equals(s1) && (s3.equals(s1) || s3.equals("Bar.gif"))) {
				result = 14;
			} else if (s1.equals("Bell.gif") && s2.equals(s1) && (s3.equals(s1) || s3.equals("Bar.gif"))) {
				result = 20;
			} else if (s1.equals("Bell.gif") && s2.equals(s1) && (s3.equals(s1) || s3.equals("Bar.gif"))) {
				result = 250;
			}
			stake = stake + result - 1;
			
			l1 = createText("You win $" + Integer.toString(result));
			add(l1, 50, 300);
			l2 = createText("You now have $" + Integer.toString(stake));
			add(l2, 50, 340);
		}
	}
	
	private GImage createImage(String image) {
		GImage pic = new GImage(image);
		pic.setSize(199, 199);
		return pic;
	}
	
	private void addSlot(double x, double y) {
		GRect slot = new GRect(x, y, 200, 200);
		slot.setFilled(true);
		slot.setFillColor(Color.white);
		add(slot, x, y);
	}
	
	private GLabel createText(String text) {
		GLabel label = new GLabel(text);
		label.setFont("SansSerif-30");
		label.setColor(Color.black);
		return label;
	}
	
	// Create an instance variable for the random number generator
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	// Spin a wheel and get result
	private String Spin() {
		int n = rgen.nextInt(1, 6);
		switch(n) {
		case 1:
			return "Cherry.gif";
		case 2:
			return "Lemon.gif";
		case 3:
			return "Orange.gif";
		case 4:
			return "Plum.gif";
		case 5:
			return "Bell.gif";
		default:
			return "Bar.gif";
		}
	}
}
