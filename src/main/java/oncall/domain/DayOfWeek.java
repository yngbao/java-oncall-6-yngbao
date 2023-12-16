package oncall.domain;

import java.util.ArrayList;
import java.util.List;

public enum DayOfWeek {
	WHOLE(List.of("일", "월", "화", "수", "목", "금", "토")),
	WEEKDAY(List.of("월", "화", "수", "목", "금")),
	WEEKEND(List.of("토", "일"));
	
	private final List<String> days;
	
	DayOfWeek(List<String> days) {
		this.days = days;
	}
	
	public List<String> getDays() {
		return days;
	}
	
	public static List<String> fromStart(String input) {
		List<String> days = new ArrayList<>();
		int index = WHOLE.days.indexOf(input);
		while(days.size() < WHOLE.getDays().size()) {
			if (index >= WHOLE.getDays().size()) {
				index = 0;
			}
			days.add(WHOLE.getDays().get(index));
			index++;
		}
		return days;
	}
	
	public static boolean isWeekDay(String dayOfWeek) {
		if (WEEKDAY.getDays().contains(dayOfWeek)) {
			return true;
		}
		return false;
	}
}
