package common;

import exception.ValidationException;

public class Calculation {

    public int calculate(int firstValue, char operator, int secondValue) {
        //enum 클래스로 리팩토링.
        if (operator == '+') {
            return add(firstValue, secondValue);
        }
        if (operator == '-') {
            return subtract(firstValue, secondValue);
        }
        if (operator == '*') {
            return multiply(firstValue, secondValue);
        }
        if (operator == '/') {
            return divide(firstValue, secondValue);
        }
        throw new ValidationException(ValidationException.DIVIDE_VALIDATION);
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        try {
            return a / b;
        } catch (ValidationException e) {
            //로깅, Exception
            throw new ValidationException(ValidationException.DIVIDE_VALIDATION);
        }
    }

}
