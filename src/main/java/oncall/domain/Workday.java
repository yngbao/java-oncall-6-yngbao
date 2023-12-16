package oncall.domain;

import java.util.List;
import java.util.Map.Entry;

public class Workday {
	private int month;
	private List<Entry<Integer, String>> days;
	
	public Workday(int month) {
		this.month = month;
	}
	
	public void makeWorkday() {
		int lastDay = Month.findLastday(month);
		for (int i = 0; i < array.length; i++) {
			
		}
	}
}
