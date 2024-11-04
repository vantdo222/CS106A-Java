import acm.program.ConsoleProgram;

public class Interest2  extends ConsoleProgram {
	
	public void run() {
		println("Interest calculation program");
		int start_bal = readInt("Enter starting balance: ");
		double factor = 1 + readDouble("Enter annual interest rate: ")/100;
		println("Balance after one year = " + (start_bal * factor));
		println("Balance after two years = " + (start_bal * factor * factor));
	}

}
