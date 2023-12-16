package oncall.view.message;

public enum ErrorMessage {
	INPUT_ERROR("유효하지 않은 입력 값입니다.");
	
	private final String message;
	
	ErrorMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
