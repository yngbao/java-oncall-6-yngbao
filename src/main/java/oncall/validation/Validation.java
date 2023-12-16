package oncall.validation;

import java.util.Calendar;

public class Validation {
	private static final int FIRST_INPUT_SIZE = 2;
	private static final char SPLIT_CHARACTER = ',';
	
	public static void validateMonth(int date) {
		if (!isValidMonth(date)) {
			throw new IllegalArgumentException();
		}
	}
	
	private static boolean isValidMonth(int date) {
		return date >= Calendar.FEBRUARY && date <= Calendar.DECEMBER;
	}
	
}
