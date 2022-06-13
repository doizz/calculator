package common;

import exception.ValidationException;

import java.util.Arrays;
import java.util.function.BiFunction;


public enum Calculation {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> {
        if(num2 == 0)
            throw new IllegalArgumentException(ValidationException.DIVIDE_VALIDATION);
        return num1 / num2;
    });

    private String operator;
    private BiFunction<Integer, Integer, Integer> expression;

    Calculation(String operator, BiFunction<Integer, Integer, Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static int result(String operator, int firstValue, int secondValue) {
        return operatorFind(operator).expression.apply(firstValue, secondValue);
    }

    public static Calculation operatorFind(String type) {
        return Arrays.stream(Calculation.values())
                .filter(operator -> operator.operator.equals(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ValidationException.CALCULATOR_VALIDATION));
    }

}

