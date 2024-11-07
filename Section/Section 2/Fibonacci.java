/*
 * File: Fibonacci.java
 * --------------------
 * This program displays the terms in the Fibonacci sequence, 
 * starting with Fib(0) and continuing as long as the terms are
 * less than or equal to 10,000.
 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	private static final int MAX_TERM_VALUE = 100000;
	
	public void run() {
		println("This program lists the Fibonacci sequence.");
		int x1 = 0;
		int x2 = 1;
		while (x1 < MAX_TERM_VALUE) {
			println(x1);
			int x3 = x1 + x2;
			x1 = x2;
			x2 = x3;
		}
		
	}

}
