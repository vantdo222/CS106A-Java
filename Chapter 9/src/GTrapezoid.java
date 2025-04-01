/*
 * File: GTrapezoie.java
 * ---------------------
 */

import acm.graphics.*;

/**
 * Defines a new GObject class that appears as a trapezoid
 * @author Van Do
 */

public class GTrapezoid extends GPolygon {

/**
 * Creates a new GTrapezoid centered at the origin with the
 * specified upper, lower bases and height
 * @param upperbase The upperbase length of the trapezoid
 * @param lowerbase The lowerbase length of the trapezoid
 * @param altitude The altitude of the trapezoid
 * @param angle The left lower angle of the trapezoid
 */
	public GTrapezoid(double upperbase, double lowerbase, double altitude, double angle) {
		if (angle != 90) {
			double diff = altitude / GMath.tanDegrees(angle);
			double leg = Math.sqrt(diff * diff + altitude * altitude);
			addVertex(upperbase / 2, - altitude / 2);
			addEdge(-upperbase, 0);
			addPolarEdge(leg, -(180 - angle));
			addPolarEdge(lowerbase, 0);
		} else {
			addVertex(upperbase / 2, - altitude / 2);
			addEdge(-upperbase, 0);
			addEdge(0, altitude);
			addEdge(lowerbase, 0);
			
		}
	}
}
