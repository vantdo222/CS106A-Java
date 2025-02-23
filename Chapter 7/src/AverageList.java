/*
 * File: AverageList.java
 * ----------------------
 * This program reads in a list of integers representing exam
 * scores and then prints out the average. It uses a blank line
 * to mark the end of the input.
 */

import acm.program.*;

public class AverageList extends ConsoleProgram {
	
	public void run() {
		int sum = 0;
		int student = 0;
		String score = readLine("Enter student score: ");
		while (!score.isEmpty()) {
			sum += Integer.parseInt(score);
			student += 1;
			score = readLine("Enter student score: ");
		}
		println("Average score = " + (sum / student));
	}

}
