/*
 * File: CapitalizeWord.java
 * -------------------------
 * This program takes in a word and capitalize the initial character
 * and all other letters are converted so that they appear in
 * lowercase form.
 */

import acm.program.*;

public class CapitalizeWord extends ConsoleProgram {
	
	public void run() {
		String word = readLine("Enter a word: ");
		String result = "";
		result += Character.toUpperCase(word.charAt(0));
		result += word.substring(1).toLowerCase();
		println(result);
	}

}
