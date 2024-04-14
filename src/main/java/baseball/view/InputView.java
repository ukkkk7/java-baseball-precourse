package baseball.view;

import baseball.model.Numbers;
import baseball.validator.NumberValidator;
import baseball.validator.RestartNumberValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {


    public static Numbers readInputNum(){

        OutputView.printInputMessage();
        String inputNum = Console.readLine();
        NumberValidator numberValidator = new NumberValidator();
        numberValidator.validNumberFormat(inputNum);
        numberValidator.validNumberRange(inputNum);
        numberValidator.validDuplicateNumber(inputNum);
        numberValidator.validNumberCount(inputNum);

        return new Numbers(inputNum);
    }

    public static String retryAsk(){
        OutputView.printRetryMessage();
        String input = Console.readLine();
        RestartNumberValidator restartNumberValidator = new RestartNumberValidator();
        restartNumberValidator.validRestartNumber(input);
        return input;
    }




}
