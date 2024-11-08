/*
 * File: AverageList.java
 * ----------------------
 * This program reads in a list of integers representing exam
 * scores and then prints out the average.
 */

import acm.program.*;

public class AverageList extends ConsoleProgram {
	
	public void run() {
		int sum = 0;
		int student = 0;
		int score = readInt("Enter student score: ");
		while (score != -1) {
			sum += score;
			student += 1;
			score = readInt("Enter student score: ");
		}
		println("Average score = " + (sum / student));
	}

}
