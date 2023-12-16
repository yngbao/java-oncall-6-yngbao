package oncall.view;

import camp.nextstep.edu.missionutils.Console;
import oncall.view.message.SystemMessage;

public class InputView {
	public static String getInput(SystemMessage message) {
		System.out.print(message.getMessage());
		return Console.readLine();
	}
}
