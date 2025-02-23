/*
 * File: PrimeNumber.java
 * ----------------------
 * This program checks whether a number is prime.
 */

import acm.program.*;

public class PrimeNumber extends ConsoleProgram {
	
	public void run() {
		int input = readInt("Enter a number: ");
		if (isPrime2(input)) {
			println(input + " is a prime number.");
		} else {
			println(input + " is not a prime number.");
		}
	}
	
	private boolean isPrime1(int n) {
		boolean result = true;
		if (n <= 1) {
			result = false;
		} else {
			for (int i = 2; i < n; i ++ ) {
				if (n % i == 0) {
					result = false;
				}
			}
		}
		return result;
	}
	
	private boolean isPrime2(int n) {
		boolean result = true;
		if (n <= 1) {
			result = false;
		} else {
			for (int i = 2; i < n / 2; i ++ ) {
				if (n % i == 0) {
					result = false;
				}
			}
		}
		return result;
	}
	
}
