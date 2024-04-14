package baseball.validator;

public class RestartNumberValidator {
    private static final String NONVALID_COUNT_MESSAGE = "1과 2만 입력 가능합니다.";
    public void validRestartNumber(String num){
        if(!num.matches("[12]")){
            throw new IllegalArgumentException(NONVALID_COUNT_MESSAGE);
        }
    }
}
