/*
 * File: HexToDecimalConverter.java
 * --------------------------------
 * This program converts hexadecimal values into their decimal
 * equivalents. It continues to read hexadecimal values until
 * the user enters a 0.
 */

import acm.program.*;

public class HexToDecimalConverter extends ConsoleProgram {
	
	private static final int STOP = 0;
	
	public void run() {
		println("This program converts hexadecimal to decimal.");
		println("Enter " + STOP + " to stop.");
		
		String hex = readLine("Enter a hexademical number: ");
		while (Integer.parseInt(hex, 8) != STOP) {
			println(hex + " hex = " + Integer.parseInt(hex, 8) + " decimal");
			hex = readLine("Enter a hexademical number: ");
		}
	}

}
