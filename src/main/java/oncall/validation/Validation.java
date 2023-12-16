package oncall.validation;

import java.util.List;
import java.util.stream.Collectors;

import oncall.domain.Calendar;
import oncall.domain.Workers;
import oncall.utils.Utils;

public class Validation {
	private static final int FIRST_INPUT_SIZE = 2;
	private static final int INDEX_ZERO = 0;
	private static final int INDEX_FIRST = 1;
	private static final String NOTHING = "";
	
	public static void validateWorkers(String input) {
		List<String> inputs = Utils.splitString(input);
		validateWorkersCount(inputs);
		validateDistinctName(inputs);
		for (String name : inputs) {
			validateNameSize(name);
		}
	}
	
	public static void validateDistinctName(List<String> inputs) {
		if (!isUniqueName(inputs)) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void validateNameSize(String input) {
		if (!isReasonableName(input)) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void validateWorkersCount(List<String> inputs) {
		if (!isReasonableCount(inputs)) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void validateFirstInput(String input) {
		List<String> inputs = Utils.splitString(input);
		validateFirstInputSize(inputs);
		validateMonth(Integer.parseInt(inputs.get(INDEX_ZERO)));
		validateDayOfWeek(inputs.get(INDEX_FIRST));
	}
	
	private static boolean isUniqueName(List<String> inputs) {
		List<String> distinct = inputs.stream()
				.distinct()
				.collect(Collectors.toList());
		return inputs.size() == distinct.size();
	}
	
	private static boolean isReasonableName(String input) {
		return !input.equals(NOTHING) 
				&& !input.equals(null)
				&& input.length() <= Workers.MAX_NAME_LENGTH;
	}
	
	private static boolean isReasonableCount(List<String> inputs) {
		return inputs.size() >= Workers.MIN && inputs.size() <= Workers.MAX;
	}
	
	private static void validateFirstInputSize(List<String> inputs) {
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
	
	private static boolean isValidSize(List<String> inputs) {
		return inputs.size() == FIRST_INPUT_SIZE;
	}
	
	private static boolean isValidMonth(int date) {
		return date >= Calendar.JANUARY && date <= Calendar.DECEMBER;
	}
	
	private static boolean isValidDayName(String input) {
		return Calendar.DAY_OF_WEEK.contains(input);
	}
	
}
