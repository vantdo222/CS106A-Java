/*
 * File: Add2Integer.java
 * ----------------------
 * This program simulates the operation of readInt by reading a
 * line and then translating the characters from that line into
 * an integer. 
 */

import acm.program.*;

public class Add2Integer extends ConsoleProgram {
	
	public void run() {
		println("This program adds two integers.");
		int n1 = myReadInt("Enter n1: ");
		int n2 = myReadInt("Enter n2: ");
		println("The total is " + (n1 + n2));
	}
	
	private int myReadInt(String prompt) {
		while (true) {
			String answer = readLine(prompt);
			for (int i = 0; i < answer.length();  i ++) {
				if (Character.isDigit(answer.charAt(i))) {
					return Integer.parseInt(answer);
				} else {
					println("Illegal integer format");

				}
			}
		}
	}

}
