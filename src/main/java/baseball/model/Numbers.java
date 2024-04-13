package baseball.model;

import baseball.validator.NumberValidator;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {

    //private List<String> comNumberList;
    private List<String> numberList;
    private static NumberValidator numberValidator;

    public Numbers(){
        this.numberList = generateNumber();
    }

    public Numbers(String number){
        this.numberList = Arrays.asList(number.split(""));
    }

    //난수생성 메소드
    public List<String> generateNumber() {

        List<String> numbers = new ArrayList<>();

        while(numbers.size()<3) {
            String randomNumber = Integer.toString(Randoms.pickNumberInRange(1, 9));

            if(!numbers.contains(randomNumber)){
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }


    public GameScore compareToInputNumber(Numbers userNumbers) {
        GameScore score = new GameScore(countStrike(userNumbers), countBall(userNumbers));
        return score;
    }
/*
    private boolean isSamePosition(int number, int position) {
       return numberList.contains(number) && numberList.indexOf(number) == position;
    }

    private boolean isContainNumber(int number, int position){
        return (numberList.contains(number) && numberList.indexOf(number) != position);
    }

*/
    public int countStrike(Numbers userNumbers) {
        int strike = 0;
        for(int i=0; i<numberList.size(); i++){
            if(userNumbers.numberList.contains(numberList.get(i)) &&  userNumbers.numberList.indexOf(numberList.get(i)) == i ){
                strike++;
            }
        }
        return strike;
    }

    public int countBall(Numbers userNumbers){
        int ball = 0;
        for(int i=0; i<numberList.size(); i++){
            if(userNumbers.numberList.contains(numberList.get(i)) &&  userNumbers.numberList.indexOf(numberList.get(i)) != i ){
                ball++;
            }
        }
        return ball;
    }


}
