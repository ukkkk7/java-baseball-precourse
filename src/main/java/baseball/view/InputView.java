package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public void readInputNum(){

        OutputView.printGameStartMessage();
        OutputView.printInputMessage();
        String inputNum = Console.readLine();

    }



}
