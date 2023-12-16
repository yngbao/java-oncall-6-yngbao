package oncall.domain;

import java.util.Arrays;

public enum Month {
	JAN(1,31),
	FEB(2,28),
	MAR(3,31),
	APR(4,30),
	MAY(5,31),
	JUN(6,30),
	JUL(7,31),
	AUG(8,31),
	SEP(9,30),
	OCT(10,31),
	NOV(11,30),
	DEC(12,31);
	
	private final int number;
	private final int lastDay;
	
	Month(int number, int lastDay) {
		this.number = number;
		this.lastDay = lastDay;
	}
	
	public static int findLastday(int number) {
		Month month = Arrays.stream(Month.values())
				.filter(value -> (value.getNumber() == number))
				.findAny()
				.get();
		
		return month.lastDay;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getLastDay() {
		return lastDay;
	}
	
}
