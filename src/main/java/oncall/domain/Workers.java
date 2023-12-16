package oncall.domain;

import java.util.List;

import oncall.validation.Validation;

public class Workers {
	public static final int MIN = 5;
	public static final int MAX = 35;
	public static final int MAX_NAME_LENGTH = 5;
	
	private List<String> names;
	
	public Workers(String input) {
		this.names = Validation.validateWorkers(input);;
	}
	
	public List<String> getNames() {
		return names;
	}
}
