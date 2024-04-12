package baseball.model;

public class GameScore {

    private int strikeCount;
    private int ballCount;

    public GameScore(int strikeCount, int ballCount){
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }

    public int getStrikeCount(){
        return this.strikeCount;
    }

    public int getBallCount(){
        return this.ballCount;
    }

    public boolean allStrike(){
        if(strikeCount == 3){
            return true;
        } else {
            return false;
        }
    }


}
