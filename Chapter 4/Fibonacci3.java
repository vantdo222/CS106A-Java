/*
 * File: Fibonacci3.java
 * ---------------------
 * This program displays all values in the Fibonacci sequence
 * that are smaller than 10,000. 
 */
import acm.program.*;

public class Fibonacci3 extends ConsoleProgram {
	
	public void run() {
		int x0 = 0;
		int x1 = 1;
		println(x0);
		println(x1);
		int x3 = x0 + x1;
		while (x3 < 10000) {			
			println(x3);
			x0 = x1;
			x1 = x3;
			x3 = x0 + x1;
		}
	}

}
