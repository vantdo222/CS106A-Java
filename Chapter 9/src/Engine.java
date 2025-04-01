/*
 * File: Engine.java
 * -----------------
 * This file defines the engine as a subclass of the more general
 * Traincar class.
 */

import acm.graphics.*;
import java.awt.*;

/**
 * This class represents an engine. Like all TrainCar subclasses,
 * an Engine is a graphic object that you can add to a GCanvas.
 * @author Van Do
 *
 */
public class Engine extends TrainCar {
	
	/**
	 * Creates a new engine with the specified color.
	 * @param color The color of the new engine
	 */
	public Engine(Color color) {
		super(color);
		
	}

}
