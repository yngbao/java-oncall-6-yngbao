package oncall.view;

public class OutputView {
	public void printDayAndWorker(Boolean isHolidayOnWeekday) {
		if (isHolidayOnWeekday) {
			System.out.println();
		}
		if (!isHolidayOnWeekday) {
			System.out.println();
		}
	}
	
}
