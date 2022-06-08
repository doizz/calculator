package common;

public class CalculationTest {

    public static int addTest(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public static int subtractTest(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public static int multiplyTest(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    public static int divideTest(int firstValue, int secondValue) {
        return firstValue / secondValue;
    }

    public static int calculate(int firstValue, char operator, int secondValue) {
        if (operator == '+') {
            return CalculationTest.addTest(firstValue, secondValue);
        }
        if (operator == '-') {
            return CalculationTest.subtractTest(firstValue, secondValue);
        }
        if (operator == '*') {
            return CalculationTest.multiplyTest(firstValue, secondValue);
        }
        if (operator == '/') {
            return CalculationTest.divideTest(firstValue, secondValue);
        } else {
            throw new IllegalArgumentException("사칙연산이 아닙니다.");
        }
    }
}