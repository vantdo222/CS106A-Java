/*
 * File: DrawFace.java
 * -------------------
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
import java.awt.*;

public class DrawFace extends GraphicsProgram {

	public void init() {
		addMouseListeners();
		face = new GFace(200, 200);
		add(face, (getWidth() - face.getWidth()) / 2, (getHeight() - face.getHeight()) / 2);
		
		left_center_X = face.leftEye.getX() + face.leftEye.getWidth() / 2;
		left_center_Y = face.leftEye.getY() + face.leftEye.getHeight() / 2;
		
		right_center_X = face.rightEye.getX();
		right_center_Y = face.rightEye.getY();
		
		eye_width = face.leftEye.getWidth();
		eye_height = face.leftEye.getHeight();
		
		left_pupil = createPupil(0.035 * face.getWidth());
		right_pupil = createPupil(0.035 * face.getWidth());
		add(left_pupil, face.getX() + face.leftEye.getX() + face.leftEye.getWidth(), face.getY() + face.leftEye.getY());
		add(right_pupil, 0.73 * face.getWidth() - 0.035 * face.getWidth() / 2,
				0.23 * face.getHeight() - 0.035 * face.getHeight() / 2);
	}
	
	private GCompound createPupil(double radius) {
		GOval circle = new GOval(radius * 2, radius * 2);
		circle.setFilled(true);
		circle.setColor(Color.BLACK);
		GCompound pupil = new GCompound();
		pupil.add(circle);
		return pupil;
	}
	
	public void mouseMoved(MouseEvent e) {
		//pupilMove(left_pupil, left_center_X, left_center_Y, e.getX(), e.getY());
		
	}
	
	public void pupilMove(GCompound pupil, double centerX, double centerY, double mouseX, double mouseY) {
		double max_width = eye_width - pupil.getWidth() / 2;
		double max_height = eye_height - pupil.getHeight() / 2;
		if ((Math.abs(mouseX - centerX) <= max_width) && (Math.abs(mouseY - centerY) <= max_height)) {
			pupil.setLocation(mouseX, mouseY);
		} else {
			
		}
	}
	
	private GFace face;
	private GCompound left_pupil;
	private GCompound right_pupil;
	private double eye_width;
	private double eye_height;
	private double left_center_X;
	private double left_center_Y;
	private double right_center_X;
	private double right_center_Y;
}
