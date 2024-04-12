package baseball.view;

import baseball.model.Numbers;
import baseball.validator.NumberValidator;
import baseball.validator.RestartNumberValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static NumberValidator numberValidator;
    private static RestartNumberValidator restartNumberValidator;

    public static Numbers readInputNum(){

        OutputView.printGameStartMessage();
        OutputView.printInputMessage();
        String inputNum = Console.readLine();

        numberValidator.validNumberCount(inputNum);
        numberValidator.validNumberFormat(inputNum);
        numberValidator.validNumberRange(inputNum);
        numberValidator.validDuplicateNumber(inputNum);

        return new Numbers(inputNum);
    }

    public static int retryAsk(){
        OutputView.printRetryMessage();
        int answer = Integer.parseInt(Console.readLine());
        restartNumberValidator.validRestartNumber(answer);
        return answer;
    }




}
