/*
 * File: LongestWord.java
 * ----------------------
 * This program returns the longest word in a line.
 */

import java.util.StringTokenizer;

import acm.program.*;

public class LongestWord extends ConsoleProgram{
	
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\ ";
	
	public void run() {
		String line = readLine("Enter a line: ");
		println("The longest word is \"" + longestWord(line) + "\"");
	}
	
	private String longestWord(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS, true);
		String result = tokenizer.nextToken();
		while(tokenizer.hasMoreTokens()) {
			String next = tokenizer.nextToken();
			if (next.length() > result.length()) {
				result = next;
			}
		}
		return result;
	}

}
