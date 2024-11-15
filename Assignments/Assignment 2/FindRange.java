/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL = 0;
	
	public void run() {
		println("This program finds the largest and smallest numbers.");
		int input = readInt("? ");
		if (input == 0) {
			println("No values have been entered.");
		} else {
			int biggest = input;
			int smallest = input;
			while (input != SENTINEL) {
				if (input > biggest) {
					biggest = input;
				} else if (input < smallest) {
					smallest = input;
				}
				input = readInt("? ");
			}
			println("smallest: " + smallest);
			println("biggest: " + biggest);
		}
	}
}

