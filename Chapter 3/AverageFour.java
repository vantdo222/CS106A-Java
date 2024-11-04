import acm.program.*;

public class AverageFour extends ConsoleProgram {
	
	public void run() {
		int x1 = readInt("Enter first integer: ");
		int x2 = readInt("Enter second integer: ");
		int x3 = readInt("Enter third integer: ");
		int x4 = readInt("Enter fourth integer: ");
		double average = (double)(x1 + x2 + x3 + x4)/4;
		println("Average of 4 integers = " + average);
	}

}
