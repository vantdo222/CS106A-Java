import acm.program.*;

public class Interest  extends ConsoleProgram {
	
	public void run() {
		println("Interest calculation program");
		int start_bal = readInt("Enter starting balance: ");
		double interest = readDouble("Enter annual interest rate: ");
		println("Balance after one year = " + (start_bal * (1 + interest/100)));
	}

}
