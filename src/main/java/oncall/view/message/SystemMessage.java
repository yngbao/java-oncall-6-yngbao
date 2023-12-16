package oncall.view.message;

public enum SystemMessage {
	INPUT_MONTH_SETTING("비상 근무를 배정할 월과 시작 요일을 입력하세요>"),
	INPUT_WEEKDAY_PEOPLE("평일 비상 근무 순번대로 사원 닉네임을 입력하세요>"),
	INPUT_HOLIDAY_PEOPLE("휴일 비상 근무 순번대로 사원 닉네임을 입력하세요>"),
	DAY_FORM("%d월 %d일 %s"),
	HOLIDAY("(휴일)");
	
	private final String message;
	
	SystemMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
