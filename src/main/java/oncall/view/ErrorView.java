package oncall.view;

import oncall.view.message.ErrorMessage;

public class ErrorView {
	private static final String INTRO = "[EEROR] ";
	private static final String RETRY = " 다시 입력해 주세요.";
	
	public static void printError(ErrorMessage message) {
		System.out.println(INTRO + message.getMessage() + RETRY);
	}
}
