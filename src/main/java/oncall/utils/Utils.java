package oncall.utils;

public class Utils {
	private static final String SPLIT_CHARACTER = ",";
	
	public static String[] splitString(String input) {
		return input.split(SPLIT_CHARACTER);
	}
}
