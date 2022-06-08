package exception;

public class ValidationException extends IllegalArgumentException {
    public static final String BLANK_VALIDATION = "빈값이나 NULL은 입력하실수 없습니다.";
    public static final String DIVIDE_VALIDATION = "0으로 나눌 수 없습니다.";
    public static final String CALCULATOR_VALIDATION = "연산자를 잘못 입력 하셨습니다.";

    public ValidationException(String message) {
        super(message);
    }
}
