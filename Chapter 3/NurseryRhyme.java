import acm.program.*;

public class NurseryRhyme extends ConsoleProgram {
	
	public void run() {
		int wives = 7;
		int sacks = 7 * wives;
		int cats = 7 * sacks;
		int kits = 7 * cats;
		println("Total wives = " + wives);
		println("Total sacks = " + sacks);
		println("Total cats = " + cats);
		println("Total kits = " + kits);
		println("Total = " + (wives + sacks + cats + kits));
	}

}
