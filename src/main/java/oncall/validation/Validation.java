package oncall.validation;

import oncall.domain.Calendar;
import oncall.domain.Workers;
import oncall.utils.Utils;

public class Validation {
	private static final int FIRST_INPUT_SIZE = 2;
	private static final int INDEX_ZERO = 0;
	private static final int INDEX_FIRST = 1;
	private static final String NOTHING = "";
	
	public static void validateWorkersCount(String[] inputs) {
		if (!isReasonableCount(inputs)) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void validateFirstInput(String input) {
		String[] inputs = Utils.splitString(input);
		validateFirstInputSize(inputs);
		validateMonth(Integer.parseInt(inputs[INDEX_ZERO]));
		validateDayOfWeek(inputs[INDEX_FIRST]);
	}
	
	private static boolean isReasonableCount(String[] inputs) {
		return inputs.length >= Workers.MIN && inputs.length <= Workers.MAX;
	}
	
	private static void validateFirstInputSize(String[] inputs) {
		if (!isValidSize(inputs)) {
			throw new IllegalArgumentException();
		}
	}
	
	private static void validateDayOfWeek(String input) {
		if (!isValidDayName(input)) {
			throw new IllegalArgumentException();
		}
	}
	
	private static void validateMonth(int date) {
		if (!isValidMonth(date)) {
			throw new IllegalArgumentException();
		}
	}
	
	private static boolean isValidSize(String[] inputs) {
		return inputs.length == FIRST_INPUT_SIZE;
	}
	
	private static boolean isValidMonth(int date) {
		return date >= Calendar.JANUARY && date <= Calendar.DECEMBER;
	}
	
	private static boolean isValidDayName(String input) {
		return Calendar.DAY_OF_WEEK.contains(input);
	}
	
}
