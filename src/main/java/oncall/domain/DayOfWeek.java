package oncall.domain;

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
}
