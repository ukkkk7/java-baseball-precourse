package baseball.controller;


import baseball.model.GameScore;
import baseball.model.Numbers;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Console;

public class GameController {

    private static GameScore gameService;
    private static Numbers computerNumberList;

    public void play(){
        do {
            generateComNumber();
            GameStart();
        }while (restart());
        OutputView.printGameFinishMessage();
    }

    public void generateComNumber(){
        computerNumberList = new Numbers();
    }

    public void GameStart(){
        OutputView.printGameStartMessage();
        do {
            Numbers userNumberList = InputView.readInputNum();
            gameService = computerNumberList.compareToInputNumber(userNumberList);
            OutputView.printResult(gameService);
        } while (!gameService.allStrike());
        OutputView.printEndMessage();
    }

    public boolean restart(){
        return InputView.retryAsk().equals("1");
    }

}
