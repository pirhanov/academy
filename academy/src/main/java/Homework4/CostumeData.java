package Homework4;

import java.util.*;

public class CostumeData {
	public static void main(String args[]) {
		int year = 2020;
		int month = 11;
		showGrid(year, month);
	}

	public static void showGrid(int year, int month) {

		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, 1); // create a new Gregorian Calendar
																				// Object, which allows us to call
																				// methods that the GregorianCalendar
																				// class has
		int firstDay = calendar.get(Calendar.DAY_OF_WEEK); // get the weekday of the first day of the month
		int currentDay = 0, currentWeekDay = 1; // assign counter variables
		System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat"); // print header
		System.out.println(""); // new line to begin printing days

		for (int i = 0; i < firstDay - 1; i++) { // print empty spaces until we get to where the first day should be
			System.out.print("      |");
		}

		for (int day = 1; day <= daysInMonth(month, year);) { // while there are still days left in the month to print
			for (int j = 0; j < 7 && (day <= daysInMonth(month, year)); j++) { // and there are still days left in the
																				// specfic week
				System.out.printf("  %2d  |", day); // print out the day
				day++; // increment the day counter for the next time we loop through
				currentWeekDay++; // ""
				if (7 - (firstDay - 2) == day) { // special case for if we are in the first week (subtracting two from
													// firstDay because zero indexed and we have already incremented
													// above
					break;
				}
				currentDay = day; // set the currentDay value, used in below calculations
			}
			if (currentDay <= daysInMonth(month, year)) { // if we have finished printing a week, but there are still
															// days remaining, start printing on a new line
				emptyLine();
				currentWeekDay = 1;
			}
		}
	}

	private static void emptyLine() {

	}

	public static int daysInMonth(int month, int year) {
		if (month == 2) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						return 29;
					} else {
						return 28;
					}
				} else {
					return 29;
				}
			}
			return 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else {
			return 31;
		}
	}
}
