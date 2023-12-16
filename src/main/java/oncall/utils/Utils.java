package oncall.utils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {
	private static final String SPLIT_CHARACTER = ",";
	
	public static List<String> splitString(String input) {
		return Stream.of(input.split(SPLIT_CHARACTER))
				.map(String::trim) 
				.collect(Collectors.toList());
	}
}
