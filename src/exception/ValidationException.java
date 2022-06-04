package exception;

public class ValidationException extends IllegalArgumentException {
    public static final String blankValidation= "빈값이나 NULL은 입력하실수 없습니다.";
    public static final String divideValidation = "0으로 나눌 수 없습니다.";
    public static final String calculatorValidation = "연산자를 잘못 입력 하셨습니다.";


    public ValidationException(String message) {
        super(message);
    }

}
