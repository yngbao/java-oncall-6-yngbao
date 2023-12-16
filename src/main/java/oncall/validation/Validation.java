package oncall.validation;

import oncall.domain.Calendar;

public class Validation {
	private static final int FIRST_INPUT_SIZE = 2;
	private static final char SPLIT_CHARACTER = ',';
	
	public static void validateDayOfWeek(String input) {
		if (!isValidDayName(input)) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void validateMonth(int date) {
		if (!isValidMonth(date)) {
			throw new IllegalArgumentException();
		}
	}
	
	private static boolean isValidMonth(int date) {
		return date >= Calendar.JANUARY && date <= Calendar.DECEMBER;
	}
	
	private static boolean isValidDayName(String input) {
		return Calendar.DAY_OF_WEEK.contains(input);
	}
	
}
