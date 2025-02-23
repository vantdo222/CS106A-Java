/*
 * File: YesNoExample.java
 * -----------------------
 * This program prints the string prompt as a question
 * for the user and then waits for a response.
 */

import acm.program.*;

public class YesNoExample extends ConsoleProgram {
	
	public void run() {
		if (askYesNoQuestion("Would you like instruction? ")) {
			println("Here is you instruction!");
		} else {
			println("End of program. Thank you!");
		}
	}

	private Boolean askYesNoQuestion(String prompt) {
		String answer = readLine(prompt);
		while (!(answer.equals("yes")) && !(answer.equals("no"))) {
			println("Please answer yes or no");
			answer = readLine(prompt);
		}
		return (answer.equals("yes"));
	}
}
