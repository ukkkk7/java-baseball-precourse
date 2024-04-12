package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String readInputNum(){

        OutputView.printGameStartMessage();
        OutputView.printInputMessage();
        String inputNum = Console.readLine();

        return inputNum;
    }



}
