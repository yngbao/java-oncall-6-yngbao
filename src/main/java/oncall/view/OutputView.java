package oncall.view;

import java.util.Map.Entry;

import static oncall.view.message.SystemMessage.*;

public class OutputView {
	public static void printWorkday(
			int month, 
			Entry<Integer, String> day,
			String worker) {
		System.out.printf(DAY_FORM.getMessage(), 
				month, day.getKey(), 
				day.getValue(), 
				worker);
	}
	
}
