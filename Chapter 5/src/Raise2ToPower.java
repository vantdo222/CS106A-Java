/*
 * File: Raise2ToPower.java
 * ------------------------
 * This program displays a table of 2^k for all values
 * of k from 0 to 10.
 */

import acm.program.*;

public class Raise2ToPower extends ConsoleProgram {
	
	public void run() {
		for (int i = 0; i <= 10; i++) {
			println("2 to the power of " + i + " is " + raiseIntToPower(2, i));
		}
	}
	
	private int raiseIntToPower(int n, int k) {
		int result = 1;
		for (int i = 0; i < k; i++) {
			result *= n;
		}
		return result;
	}

}
