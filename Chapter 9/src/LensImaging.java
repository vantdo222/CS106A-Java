/*
 * File: LensImaging.java
 * ----------------------
 * This program illustrates how lenses form images. Light rays that
 * enter a lens parallel to its horizontal axis are bent so that
 * they pass through a single point called the focal point of the
 * lens; the distance from the center of the lens to the focal
 * point is called the focal length. Those light rays continue on
 * and form an upside-down image to an observer on the far side of
 * the focal point.
 */

import acm.program.*;
import acm.graphics.*;

public class LensImaging extends GraphicsProgram {
	
	public void run() {
		double x = getWidth();
		double y = getHeight();
		add(new GLens(20, 70), (x - 20) / 2, (y - 70) / 2);
		
		
	}

}
