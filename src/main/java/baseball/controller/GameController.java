package baseball.controller;

import baseball.model.GameService;

public class GameController {

    private static GameService gameService;


    public void GameStart(){
        do {
            gameService.generateNumber();
        }while (restart());
    }

    public boolean restart(){
        return true;
    }


}
