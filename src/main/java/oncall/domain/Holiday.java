package oncall.domain;

public enum Holiday {
	신정(1,1),
	삼일절(3,1),
	어린이날(5,5),
	현충일(6,6),
	광복절(8,15),
	개천절(10,3),
	한글날(10,9),
	성탄절(12,25);
	
	private final int month;
	private final int date;
	
	Holiday(int month, int date) {
		this.month = month;
		this.date = date;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
}
