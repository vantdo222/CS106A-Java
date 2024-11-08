/*
 * File: FindLargest.java
 * ----------------------
 * This program reads in a list of integers, one per line, 
 * until the user enters a sentinel value of 0 and display
 * the largest value in the list.
 */

import acm.program.*;

public class FindLargest extends ConsoleProgram {
	
	public void run() {
		println("This program finds the largest integer in a list."
				+ "Enter values, one per line, using a 0 to signal" 
				+ "the end of the list.");
		int largest = 0;
		int input = readInt("? ");
		while (input != 0) {
			largest = (input > largest ? input : largest);
			input = readInt("? ");
		}
		println("The largest value is " + largest);
	}

}
