/*
 * File: SimpleParameterTest.java
 * ------------------------------
 * This program is an example illustrating differences between
 * primitive types and objects.
 */

import acm.program.*;
import acm.util.*;

public class SimpleParameterTest extends ConsoleProgram {

	public void run() {
		EmbeddedInteger x = new EmbeddedInteger(17);
		increment(x);
		println("x = " + x);
	}
	private void increment(EmbeddedInteger n) {
		n.setValue(n.getValue() + 1);
		println("n = " + n);
	}
}
