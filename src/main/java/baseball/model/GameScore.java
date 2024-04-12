package baseball.model;

import baseball.validator.NumberValidator;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class GameService {

    private int strike = 0;
    private int ball = 0;


    public void strikeCount(){
        this.strike++;
    }

    public void ballCount(){
        this.ball++;
    }


}
