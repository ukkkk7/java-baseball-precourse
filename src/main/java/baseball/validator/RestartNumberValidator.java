package baseball.validator;

public class RestartNumberValidator {
    private static final String NONVALID_COUNT_MESSAGE = "1과 2만 입력 가능합니다.";
    public void validRestartNumber(int num){
        if(num != 1 || num != 2){
            throw new IllegalArgumentException(NONVALID_COUNT_MESSAGE);
        }
    }
}
