/*
 * File: ReverseDigits.java
 * ------------------------
 * This program reads in a number and generates the number
 * that has the same digits in the reverse order.
 */

import acm.program.*;

public class ReverseDigits extends ConsoleProgram {
	
	public void run() {
		println("This program reverses the digits in an integer.");
		int x = readInt("Enter a positive integer: ");
		int nx = 0;
		while (x != 0) {
			nx = nx * 10 + x % 10;
			x /= 10;
		}
		println("The reversed number is " + nx);
	}

}
