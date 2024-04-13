package baseball.validator;

import java.util.Arrays;
import java.util.regex.Pattern;

public class NumberValidator {

    private static final int MIN_NUMBER_RANGE = 1;
    private static final int MAX_NUMBER_RANGE = 9;
    private static final int NUMBER_COUNT = 3;

    private static final String NONVALID_COUNT_MESSAGE = "3개의 숫자만 입력 가능합니다.";
    private static final String NUMBER_RANGE_ERROR_MESSAGE = "1 ~ 9 사이의 숫자만 입력 가능합니다.";
    private static final String NUMBER_FORMAT_ERROR_MESSAGE = "숫자만 입력 가능합니다.";
    private static final String DUPLICATE_ERROR_MESSAGE = "중복된 숫자는 입력할 수 없습니다.";


    public void validNumberCount(String input){
        if(input.length() != NUMBER_COUNT){
            throw new IllegalArgumentException(NONVALID_COUNT_MESSAGE);
        }
    }

    public void validDuplicateNumber(String input){
        String[] inputNumber = input.split("");
        if(inputNumber.length != Arrays.stream(inputNumber).distinct().count()){
            throw new IllegalArgumentException(DUPLICATE_ERROR_MESSAGE);
        }
    }

    public void validNumberFormat(String input){
        if(!input.matches("^[\\d]*$")){
            throw new IllegalArgumentException(NUMBER_FORMAT_ERROR_MESSAGE);
        }
    }

    public void validNumberRange(String input){

        String[] numbers = input.split("");

        for (String number : numbers) {
            if(Integer.parseInt(number) < MIN_NUMBER_RANGE || Integer.parseInt(number) > MAX_NUMBER_RANGE){
                throw new IllegalArgumentException(NUMBER_RANGE_ERROR_MESSAGE);
            }
        }


    }





}
