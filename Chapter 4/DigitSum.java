/*
 * File: DigitSum.java
 * -------------------
 * This program sums the digits in a positive integer.
 * The program depends on the fact that the last digit of
 * an integer n is given by n % 10 and the number consisting
 * of all but the last digit is given by the expression n / 10.
 */

import acm.program.*;

public class DigitSum extends ConsoleProgram {
	
	public void run() {
		println("This program sums the digits in an integer.");
		int x = readInt("Enter a positive integer: ");
		int dsum = 0;
		while (x != 0) {
			dsum += x % 10;
			x = x / 10;
		}
		println("The sum of the digits is " + dsum);
	}

}
