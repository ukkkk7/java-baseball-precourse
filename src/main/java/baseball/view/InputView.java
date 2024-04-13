package baseball.view;

import baseball.model.Numbers;
import baseball.validator.NumberValidator;
import baseball.validator.RestartNumberValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static NumberValidator numberValidator;
    private static RestartNumberValidator restartNumberValidator;

    public static Numbers readInputNum(){

        OutputView.printInputMessage();
        String inputNum = Console.readLine();
        numberValidator = new NumberValidator();
        numberValidator.validNumberFormat(inputNum);
        numberValidator.validNumberRange(inputNum);
        numberValidator.validDuplicateNumber(inputNum);
        numberValidator.validNumberCount(inputNum);

        return new Numbers(inputNum);
    }

    public static int retryAsk(){
        OutputView.printRetryMessage();
        int answer = Integer.parseInt(Console.readLine());
        restartNumberValidator = new RestartNumberValidator();
        restartNumberValidator.validRestartNumber(answer);
        return answer;
    }




}
