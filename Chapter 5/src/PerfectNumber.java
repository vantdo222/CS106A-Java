/*
 * File: PerfectNumber.java
 * ------------------------
 * A perfect number is a number  that is equal to the sum
 * of their proper divisors. This program checks whether a
 * number is a perfect number.
 */

import acm.program.*;

public class PerfectNumber extends ConsoleProgram {
	
	public void run() {
		println("This program checks for perfect number.");
		for (int i = 1; i <= 9999; i ++) {
			if (isPerfect(i)) {
				println(i);
			}
		}
	}
	
	private boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i ++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return (n == sum);
	}

}
