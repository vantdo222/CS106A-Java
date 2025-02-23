/*
 * File: FibonacciN.java
 * ---------------------
 * This program displays 15 values in the Fibonacci sequence. 
 */

import acm.program.*;

public class FibonacciN extends ConsoleProgram {
	
	public void run() {
		println(0);
		println(1);
		for (int i = 0; i <= 13; i ++) {
			println(fibonacci(i));
		}
	}
	//Calculates the nth Fibonacci number.
	private int fibonacci(int n) {
		int x0 = 0;
		int x1 = 1;
		int x2 = x0 + x1;
		int count = 0;
	
		while (count < n) {
			x0 = x1;
			x1 = x2;
			x2 = x0 + x1;
			count ++;
		}
		return x2;
	}

}
