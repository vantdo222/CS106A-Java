/*
 * File: Train.java
 * ----------------
 * This file defines the Train class, which can contains any
 * number of train cars linked end to end.
 */

import acm.graphics.*;

/**
 * This class deines a GCompound that represents a train.
 * The primary operation is append, which adds a Traincar
 * at the end of the train.
 */

public class Train extends GCompound {
	
/**
 * Creates a new train that contains no cars. Clients can add
 * cars at the end by calling append.
 */
	public Train() {
		// No operations necessary
	}
	
	public void append(TrainCar car) {
		double width = getWidth();
		double x = (width == 0) ? 0: width - TrainCar.CONNECTOR;
		add(car, x, 0);
	}

}
