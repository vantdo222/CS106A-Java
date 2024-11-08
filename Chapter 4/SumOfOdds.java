/*
 * File: SumOfOdds.java
 * --------------------
 * This programs reads in a positive integer N and then
 * calculates and displays the sum of the first N odd integers.
 */

import acm.program.*;

public class SumOfOdds extends ConsoleProgram {
	
	public void run() {
		int n = readInt("Enter the number of odd integers: ");
		int sum = 0;
		for (int i = 1; i < n * 2; i += 2) {
			sum += i;
		}
		println("Sum of the first " + n + " odd integers is " + sum);
	}

}
