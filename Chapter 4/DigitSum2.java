/*
 * File: DigitSum2.java
 * --------------------
 * This program reads in an integer and calculates the digital root
 * of the input value
 */

import acm.program.*;

public class DigitSum2 extends ConsoleProgram {
	
	public void run() {
		println("This program sums the digits in an integer.");
		int x = readInt("Enter a positive integer: ");
		int dsum = 10;
		while (dsum > 9) {
			dsum = 0;
			while (x > 0) {
				dsum += (x % 10);
				x /= 10;
			}
			x = dsum;
		}
		println("Digital root = " + dsum);
	}

}
