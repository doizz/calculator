package common;

import exception.ValidationException;

public class Calculation {

    public int calculate(int firstValue, char operator, int secondValue) {
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
        } else {
            throw new ValidationException(ValidationException.divideValidation);
        }

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            throw new ValidationException(ValidationException.divideValidation);
        }
    }

}
