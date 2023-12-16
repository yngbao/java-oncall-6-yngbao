package oncall.domain;

import java.util.ArrayList;
import java.util.List;

import oncall.validation.Validation;

public class Calendar {
	public static final int JANUARY = 1;
	public static final int DECEMBER = 12;
	
	private int month;
	private String startDay;
	
	public Calendar(String input) {
		List<String> inputs = new ArrayList<>();
		inputs = Validation.validateMonthSetting(input);
		this.month = Integer.parseInt(inputs.get(0));
		this.startDay = inputs.get(1);
	}
	
	public int getMonth() {
		return month;
	}
	
	public String getStartDay() {
		return startDay;
	}
}
