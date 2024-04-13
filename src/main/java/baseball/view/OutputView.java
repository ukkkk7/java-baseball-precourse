package baseball.view;

import baseball.model.GameScore;

public class OutputView {
    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String  INPUT_MESSAGE= "숫자를 입력하세요.";
    private static final String STRIKE_MESSAGE = "%d스트라이크";
    private static final String BALL_MESSAGE = "%d볼";
    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RETRY_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";



    public static void printGameStartMessage(){
        System.out.println(GAME_START_MESSAGE);
    }
    public static void printInputMessage(){
        System.out.println(INPUT_MESSAGE);
    }

    public static void printEndMessage(){
        System.out.println(END_MESSAGE);
    }
    public static void printRetryMessage(){
        System.out.println(RETRY_MESSAGE);
    }
    public static void printResult(GameScore gameScore){
        StringBuilder message = new StringBuilder();
        if(gameScore.getBallCount() != 0){
            message.append(String.format(BALL_MESSAGE, gameScore.getBallCount())).append(" ");
        }
        if(gameScore.getStrikeCount() != 0){
            message.append(String.format(STRIKE_MESSAGE, gameScore.getStrikeCount()));
        }
        if(gameScore.getBallCount() == 0 && gameScore.getStrikeCount() == 0){
            message.append(NOTHING_MESSAGE);
        }
        System.out.println(message);
    }



}
