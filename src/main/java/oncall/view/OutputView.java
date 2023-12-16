package oncall.view;

import java.util.Map.Entry;

import oncall.domain.DayOfWeek;
import oncall.domain.Holiday;

import static oncall.view.message.SystemMessage.*;

public class OutputView {
	public static void printWorkday(
			int month, 
			Entry<Integer, String> day) {
		if (DayOfWeek.isWeekDay(day.getValue()) && Holiday.isHoliday(month, day.getKey())) {
			System.out.printf(DAY_FORM.getMessage()+HOLIDAY.getMessage()+"\n", 
					month, day.getKey(), 
					day.getValue());
		} else {
			System.out.printf(DAY_FORM.getMessage()+"\n", 
					month, day.getKey(), 
					day.getValue());
		}
	}
	
}
