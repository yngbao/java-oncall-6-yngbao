package oncall.domain;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map.Entry;

public class Workday {
	private int month;
	private List<Entry<Integer, String>> days;
	
	public Workday(int month) {
		this.month = month;
	}
	
	public void makeWorkday(List<String> fromStart) {
		int lastDay = Month.findLastday(month);
		int date = 1;
		String dayOfWeek;
		while (days.size() < lastDay) {
			for (String day : fromStart) {
				dayOfWeek = day;
				Entry<Integer, String> entry = 
						new AbstractMap.SimpleEntry<>(date, dayOfWeek);
				days.add(entry);
			}
		}
	}
	
	public String findDayOfWeek(int date) {
		String dayOfWeek = days.stream()
				.filter(entry -> entry.getKey() == date)
				.map(entry -> entry.getValue())
				.findAny()
				.get();
		
		return dayOfWeek;
	}
	
	public List<Entry<Integer, String>> getDays() {
		return days;
	}
}
