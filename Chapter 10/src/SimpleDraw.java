/*
 * File: SimpleDraw.java
 * ---------------------
 * This program is a drawing program including a palette of
 * the five shapes - a filled rectangle, an outlined
 * rectangle, a filled oval, an outlined oval, and a straight
 * line - along the left side of the canvas as shown in the
 * following diagram
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleDraw extends GraphicsProgram {
	
	public void init() {
		
		ImageIcon filledRectIcon = new ImageIcon("FilledRect.gif");
		ImageIcon outlineRectIcon = new ImageIcon("OutlineRect.gif");
		ImageIcon filledOvalIcon = new ImageIcon("FilledOval.gif");
		ImageIcon outlineOvalIcon = new ImageIcon("OutlineOval.gif");
		ImageIcon lineIcon = new ImageIcon("Line.gif");
		
		FilledRect = new JButton(filledRectIcon);
		OutlineRect = new JButton(outlineRectIcon);
		FilledOval = new JButton(filledOvalIcon);
		OutlineOval = new JButton(outlineOvalIcon);
		Line = new JButton(lineIcon);
		
		FilledRect.setActionCommand("FilledRect");
		OutlineRect.setActionCommand("OutlineRect");
		FilledOval.setActionCommand("FilledOval");
		OutlineOval.setActionCommand("OutlineOval");
		Line.setActionCommand("Line");
		
		add(FilledRect, WEST);
		add(OutlineRect, WEST);
		add(FilledOval, WEST);
		add(OutlineOval, WEST);
		add(Line, WEST);
	
		addMouseListeners();
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("FilledRect")) tool = 1;
		else if (e.getActionCommand().equals("OutlineRect")) tool = 2;
		else if (e.getActionCommand().equals("FilledOval")) tool = 3;
		else if (e.getActionCommand().equals("OutlineOval")) tool = 4;
		else if (e.getActionCommand().equals("Line")) tool = 5;
	}
	
	public void mousePressed(MouseEvent e) {
		startX = e.getX();
		startY = e.getY();
		switch (tool) {
		case 1:
			rectangle = new GRect(e.getX(), e.getY(), 0, 0);
			rectangle.setFilled(true);
			add(rectangle);
			break;
		case 2:
			rectangle = new GRect(e.getX(), e.getY(), 0, 0);
			add(rectangle);
			break;
		case 3:
			oval = new GOval(e.getX(), e.getY(), 0, 0);
			oval.setFilled(true);
			add(oval);
			break;
		case 4:
			oval = new GOval(e.getX(), e.getY(), 0, 0);
			add(oval);
			break;
		case 5:
			line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
			add(line);
			break;
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		
		switch (tool) {
		case 1:
			rectangle.setBounds(Math.min(startX, e.getX()), Math.min(startY, e.getY()), Math.abs(e.getX() - startX), Math.abs(e.getY() - startY));
			break;
		case 2:
			rectangle.setBounds(Math.min(startX, e.getX()), Math.min(startY, e.getY()), Math.abs(e.getX() - startX), Math.abs(e.getY() - startY));
			break;
		case 3: 
			oval.setBounds(Math.min(startX, e.getX()), Math.min(startY, e.getY()), Math.abs(e.getX() - startX), Math.abs(e.getY() - startY));
			break;
		case 4: 
			oval.setBounds(Math.min(startX, e.getX()), Math.min(startY, e.getY()), Math.abs(e.getX() - startX), Math.abs(e.getY() - startY));
			break;
		case 5:
			line.setEndPoint(e.getX(), e.getY());
			break;
		}
	}
	
	private int tool;
	private JButton FilledRect;
	private JButton OutlineRect;
	private JButton FilledOval;
	private JButton OutlineOval;
	private JButton Line;
	private GRect rectangle;
	private GOval oval;
	private GLine line;
	private double startX;
	private double startY;
}
