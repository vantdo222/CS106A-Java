/*
 * File: Boxcar.java
 * -----------------
 * This file defines the boxcar class as a subclass of the more
 * general Traincar class.
 */

import acm.graphics.*;
import java.awt.*;

/**
 * This class represents a box car. Like all TrainCar subclasses,
 * a Boxcar is a graphical object that you can add to a GCanvas.
 */
public class Boxcar extends TrainCar {

	/**
	 * Creates a new boxcar with the specified color.
	 * @param color The color of the new boxcar
	 */
	public Boxcar(Color color) {
		super(color);
		double xRightDoor = CONNECTOR + CAR_WIDTH / 2;
		double xLeftDoor = xRightDoor - DOOR_WIDTH;
		double yDoor = -CAR_BASELINE - DOOR_HEIGHT;
		add(new GRect(xLeftDoor, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GRect(xRightDoor, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
	}
	
	// Dimensions of the door panels on the boxcar
	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;

}
