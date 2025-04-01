/*
 * File: OrdinalForm.java
 * ----------------------
 * This program takes an integer and returns a string indicating
 * the corresponding ordinal number.
 */

import acm.program.*;

public class OrdinalForm extends ConsoleProgram {
	
	public void run() {
		println("This program takes an integer and creates the corresponding ordinal number.");
		println("Indicate the end of the input with 0.");
		int num = readInt("Enter a number: ");
		while (num != 0) {
			println(createOrdinalForm(num));
			num = readInt("Enter a number: ");
		}
	}
	
	private String createOrdinalForm(int n) {
		String result = Integer.toString(n);
		if (result.endsWith("11") || result.endsWith("12") || result.endsWith("13")) {
			return result + "th";
		} else {
			switch (result.charAt(result.length() - 1)) {
			case '1':
				return result + "st";
			case '2':
				return result + "nd";
			case '3':
				return result + "rd";
			default:
				return result + "th";
			}
		}
	}

}
