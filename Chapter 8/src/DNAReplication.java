/*
 * File: DNAReplication.java
 * -------------------------
 * This program takes two strings of letters representing the
 * bases in DNA strands and returns the first index position
 * at which the first DNA strand would bind onto the second,
 * or -1 if no matching position exists.
 * The rules for DNA replication is as follows:
 * - Adenosine links only with thymine, and vice versa.
 * - Cytosine links only with guanine, and vice versa. 
 */

import acm.program.*;

public class DNAReplication extends ConsoleProgram {
	
	public void run() {
		String shortDNA = readLine("Enter the short DNA strand: ");
		String longDNA = readLine("Enter the long DNA strand: ");
		println("This strand can bind to the longer one at position " + findFirstMatchingPosition(shortDNA, longDNA));
	}
	
	private int findFirstMatchingPosition(String shortDNA, String longDNA) {
		return longDNA.indexOf(findReplicate(shortDNA));
	}
	
	private String findReplicate(String shortDNA) {
		String result = "";
		for (int i = 0; i < shortDNA.length(); i ++) {
			if (shortDNA.charAt(i) == 'T') {
				result += 'A';
			} else if (shortDNA.charAt(i) == 'A') {
				result += 'T';
			} else if (shortDNA.charAt(i) == 'G') {
				result += 'C';
			} else {
				result += 'G';
			}
		}
		return result;
	}

}
