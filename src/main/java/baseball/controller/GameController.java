package baseball.controller;


import baseball.model.GameScore;
import baseball.model.Numbers;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

    private static GameScore gameService;
    private static Numbers computerNumberList;

    public void play(){
        do {
            GameStart();
        }while (!restart());
    }

    public void GameStart(){
        do {
            computerNumberList = new Numbers();
            Numbers userNumberList = InputView.readInputNum();
            gameService = computerNumberList.compareToInputNumber(userNumberList);
            OutputView.printResult(gameService);
        } while (!gameService.allStrike());
        OutputView.printEndMessage();
    }

    public boolean restart(){
        if(InputView.retryAsk() == 1){
            return true;
        }
        return false;
    }


}
