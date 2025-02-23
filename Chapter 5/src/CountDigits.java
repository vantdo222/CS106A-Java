/*
 * File: CountDigits.java
 * ----------------------
 * This program tests the method countDigits(n).
 */

import acm.program.*;

public class CountDigits extends ConsoleProgram {
	
	public void run() {
		println("This program counts the number of digits in a given integer.");
		int input = readInt("Enter a number: ");
		println(input + " has " + countDigits(input) + " digits.");
	}
	
	private int countDigits(int n) {
		int count = 0;
		while (n > 0) {
			count ++;
			n /= 10;
		}
		return count;
	}

}
