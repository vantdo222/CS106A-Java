/*:
 * File: Calendar.java
 * -------------------
 * This program draws a simple calendar showing a 31-day month
 * that begins on a Friday. The calendar has 6 rows.
 */

import acm.graphics.*;
import acm.program.*;

public class Calendar extends GraphicsProgram {
	
	public void run() {
		double x = getWidth();
		double y = getHeight();
		add(new GLine(0, y / 13, x, y / 13));
		for (int i = 1; i < 7; i ++) {
			add(new GLine(x / 7 * i, y / 13, x / 7 * i, y));
		}
		add(createDay("SUN"), x / 7 - 70, 28);
		add(createDay("MON"), x * 2 / 7 - 75, 28);
		add(createDay("TUE"), x * 3 / 7 - 70, 28);
		add(createDay("WED"), x * 4 / 7 - 72, 28);
		add(createDay("THU"), x * 5 / 7 - 70, 28);
		add(createDay("FRI"), x * 6 / 7 - 65, 28);
		add(createDay("SAT"), x * 7 / 7 - 65, 28);
		
		if (DAYS_IN_MONTHS % 7 > 1) {
			if ((DAYS_IN_MONTHS % 7) + DAY_MONTH_STARTS > 7) {
				for (int i = 1; i < 6; i ++) {
					add(new GLine(0, y * 12.0 / 13.0 / 6.0 * i + y / 13, x, y * 12.0 / 13.0 / 6.0 * i + y / 13));
				} 
			} else {
				for (int i = 1; i < 5; i ++) {
					add(new GLine(0, y * 12.0 / 13.0 / 5.0 * i + y / 13, x, y * 12.0 / 13.0 / 5.0 * i + y / 13));
				}
			}
		} else {
			if (DAY_MONTH_STARTS > 0) {
				for (int i = 1; i < 5; i ++) {
					add(new GLine(0, y * 12.0 / 13.0 / 5.0 * i + y / 13, x, y * 12.0 / 13.0 / 5.0 * i + y / 13));
				}
			} else {
				for (int i = 1; i < 4; i ++) {
					add(new GLine(0, y * 12.0 / 13.0 / 4.0 * i + y / 13, x, y * 12.0 / 13.0 / 4.0 * i + y / 13));
				}
			}
			
		}
	}
	
	private GLabel createDay(String dayInWeek) {
		GLabel day = new GLabel(dayInWeek);
		day.setFont("SansSerif-bold-20");
		return day;
	}
	
	// The number of days in the month
	private static final int DAYS_IN_MONTHS = 30;
	
	// The day of the week on which the month starts
	// (Sunday = 0, Monday = 1, Tuesday = 2, and so on)
	private static final int DAY_MONTH_STARTS = 5;
	
	// The list of day in the week
	private enum DAY_IN_WEEK {
		SUN, MON, TUE, WED, THU, FRI, SAT
	}

}
