package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    private List<String> comNumberList = new ArrayList<>();
    private String comNumber;

    public void generateNumber() {

        while(comNumberList.size()<3) {
            String randomNumber = Integer.toString(Randoms.pickNumberInRange(1, 9));

            if(!comNumberList.contains(randomNumber)){
                comNumberList.add(randomNumber);
            }
            comNumber = String.join("", comNumberList);
        }

    }




}
