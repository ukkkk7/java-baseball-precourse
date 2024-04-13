package baseball.model;

public class GameScore {

    private int strikeCount;
    private int ballCount;

    public GameScore(int strikeCount, int ballCount){
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public int getStrikeCount(){
        return strikeCount;
    }

    public int getBallCount(){
        return ballCount;
    }

    public boolean allStrike(){
      return strikeCount == 3;
    }


}
