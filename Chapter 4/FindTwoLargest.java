/*
 * File: FindTwoLargest.java
 * -------------------------
 * This program reads in a list of integers, one per line,
 * until the user enter a sentinel value of 0 and display the
 * two largest values in the list.
 */

import acm.program.*;

public class FindTwoLargest extends ConsoleProgram {
	
	public void run() {
		println("This program finds the two largest integers in"
				+ "a list. Enter values, one per line, using a"
				+ "0 to signal the end of the list.");
		int l1 = 0;
		int l2 = 0;
		int input = readInt("? ");
		while (input != 0) {
			if (input > l1) {
				l2 = l1;
				l1 = input;
			}
			input = readInt("? ");
		}
		println("The largest value is " + l1);
		println("The second largest value is " + l2);
	}

}
