/*
 * File: Countdown2.java
 * ---------------------
 * This program counts backwards from the value START
 * to zero, as in the countdown preceding a rocket
 * launch.
 */

import acm.program.*;

public class Countdown2 extends ConsoleProgram {
	
	private static final int START = 10;
	
	public void run() {
		int x = START;
		while (x != -1) {
			println(x);
			x -= 1;
		}
		println("Liftoff!");
	}

}
