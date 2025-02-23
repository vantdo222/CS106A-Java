/*
 * File: GCTest.java
 * -----------------
 * This program allocates 10,000 Rational objects without
 * saving any of them in variables so they all become garbage
 */

import acm.program.*;
import acm.util.*;

public class GVTest extends ConsoleProgram {
	
	public void run() {
		println("Allocating 10,000 Rational objects");
		Runtime myRuntime = Runtime.getRuntime();
		for (int i = 0; i < 10000; i++) {
			new Rational();
		}
		long start = myRuntime.freeMemory();
		myRuntime.gc();
		long end = myRuntime.freeMemory();
		
		println("Garbage collection freed " + (end - start) + " bytes");
	}

}
