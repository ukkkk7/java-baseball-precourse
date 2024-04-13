package baseball.validator;

public class RestartNumberValidator {
    private static final int RETRY_NUMBER = 1;
    private static final int FINISH_NUMBER = 2;
    private static final String NONVALID_COUNT_MESSAGE = "1과 2만 입력 가능합니다.";
    public void validRestartNumber(String num){
        if(!num.matches("[12]")){
            throw new IllegalArgumentException(NONVALID_COUNT_MESSAGE);
        }
    }
}
