package oncall.controller;

import oncall.service.Service;

public class Controller {

	Service service = new Service();
	
	public void set() {
		service.monthSetting();
		service.weekdayPeopleSetting();
		service.holidayPeopleSetting();
	}
	
	public void makedays() {
		service.setWorkdays();
		
	}
}
