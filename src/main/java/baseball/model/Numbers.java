package baseball.model;

import baseball.validator.NumberValidator;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {

    private List<String> comNumberList;
    private List<String> userNumberList;
    private static NumberValidator numberValidator;

    public Numbers(){
        this.comNumberList = generateNumber();
    }

    public Numbers(String number){
        validUserNumber(number);
        this.userNumberList = Arrays.asList(number);
    }

    //난수생성 메소드
    public List<String> generateNumber() {

        while(comNumberList.size()<3) {
            String randomNumber = Integer.toString(Randoms.pickNumberInRange(1, 9));

            if(!comNumberList.contains(randomNumber)){
                comNumberList.add(randomNumber);
            }
        }
        return comNumberList;
    }

    public String validUserNumber(String input){
        numberValidator.validNumberCount(input);
        numberValidator.validNumberFormat(input);
        numberValidator.validNumberRange(input);
        numberValidator.validDuplicateNumber(input);
        return input;
    }

    public GameScore compareToInputNumber(Numbers userNumbers) {
        GameScore score = new GameScore(countBall(userNumbers), countStrike(userNumbers));
        return score;
    }

    private boolean isSamePosition(int number, int position){
        return comNumberList.contains(number) && comNumberList.indexOf(number) == position;
    }
    private boolean isContainNumber(int number, int position){
        return comNumberList.contains(number) && comNumberList.indexOf(number) != position;
    }


    public int countStrike(Numbers userNumbers) {
        int strike = 0;
        for(int i=0; i<comNumberList.size(); i++){
            if(userNumbers.isSamePosition(Integer.parseInt(comNumberList.get(i)), i)){
                strike++;
            }
        }
        return strike;
    }

    public int countBall(Numbers userNumbers){
        int ball = 0;
        for(int i=0; i<comNumberList.size(); i++){
            if(userNumbers.isContainNumber(Integer.parseInt(comNumberList.get(i)), i)){
                ball++;
            }
        }
        return ball;
    }


}
