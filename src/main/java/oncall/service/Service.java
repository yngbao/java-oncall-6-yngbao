package oncall.service;

import static oncall.view.message.SystemMessage.*;
import static oncall.view.message.ErrorMessage.*;

import oncall.domain.Calendar;
import oncall.domain.DayOfWeek;
import oncall.domain.Workday;
import oncall.domain.Workers;
import oncall.view.ErrorView;
import oncall.view.InputView;

public class Service {
	Calendar calendar;
	Workers weekdayPeople;
	Workers holidayPeople;
	Workday workday;
	
	public void monthSetting() {
		try {
			String input = InputView.getInput(INPUT_MONTH_SETTING);
			calendar = new Calendar(input);
		} catch (NumberFormatException e) {
			ErrorView.printError(INPUT_ERROR);
		} catch (IllegalArgumentException e) {
			ErrorView.printError(INPUT_ERROR);
		}
	}
	
	public void weekdayPeopleSetting() {
		try {
			String input = InputView.getInput(INPUT_WEEKDAY_PEOPLE);
			weekdayPeople = new Workers(input);
		} catch (IllegalArgumentException e) {
			ErrorView.printError(INPUT_ERROR);
		}
	}
	
	public void holidayPeopleSetting() {
		try {
			String input = InputView.getInput(INPUT_HOLIDAY_PEOPLE);
			holidayPeople = new Workers(input);
		} catch (IllegalArgumentException e) {
			ErrorView.printError(INPUT_ERROR);
		}
	}
	
	public void setWorkdays() {
		workday = new Workday(calendar.getMonth());
		workday.makeWorkday(DayOfWeek.fromStart(calendar.getStartDay()));
	}
	
	public void showResult() {
		
	}
	
}