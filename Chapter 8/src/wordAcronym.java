/*
 * File: wordAcronym.java
 * ----------------------
 * This program takes in a string composed of separate words
 * and return its acronym.
 */

import java.util.StringTokenizer;

import acm.program.*;

public class wordAcronym extends ConsoleProgram {
	
	private static final String DELIMITERS = " !@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\";
	
	public void run() {
		String line = readLine("Enter a line: ");
		println(acronym(line));
	}
	
	private String acronym(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS);
		String token = tokenizer.nextToken();
		String result = "" + token.charAt(0);
		while (tokenizer.hasMoreTokens()) {
			token = tokenizer.nextToken();
			result += token.charAt(0);
		}
		return result;
	}

}
