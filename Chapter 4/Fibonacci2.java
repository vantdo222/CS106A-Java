/*
 * File: Fibonacci2.java
 * ---------------------
 * This program displays 15 values in the Fibonacci sequence. 
 */

import acm.program.*;

public class Fibonacci2 extends ConsoleProgram {
	
	public void run() {
		int x0 = 0;
		int x1 = 1;
		println(x0);
		println(x1);
		for (int i = 0; i < 14; i++) {
			int x3 = x0 + x1;
			println(x3);
			x0 = x1;
			x1 = x3;
		}
	}

}
