/*
 * File: AddCommas.java
 * --------------------
 * This program takes a string of decimal digits representing a
 * number and returns the string formed by inserting commas at
 * every third position, starting on the right.
 */

import acm.program.*;

public class AddCommas extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String digits = readLine("Enter a number: ");
			if (digits.length() == 0) break;
			println(addCommas(digits));
		}
	}
	
	private String addCommas(String num) {
		if (num.length() > 3) {
			String result = "";
			if (num.length() % 3 != 0) {
				result = num.substring(0, num.length() % 3) + ",";
			}
			for (int i = num.length() % 3; i < num.length(); i += 3) {
				result += num.substring(i, i + 3);
				if (i + 3 < num.length()) {
					result += ",";
				}
			}
			return result;
		}
		return num;
	}

}
