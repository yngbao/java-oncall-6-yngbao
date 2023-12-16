package oncall.controller;

import oncall.service.Service;

public class Controller {

	Service service = new Service();
	
	public void run() {
		set();
		makedays();
	}
	
	private void set() {
		service.monthSetting();
		service.workersSetting();
	}
	
	private void makedays() {
		service.setWorkdays();
		service.showResult();
	}
}
