package domain;

import common.Calculation;
import common.StringUtil;
import exception.ValidationException;

public class StringCalculator {

    public static int calculationResult(String inputValue) {
        isNull(inputValue);
        return calculate(StringUtil.stringSplit(inputValue));
    }

    private static void isNull(String inputValue) {
        if (inputValue.trim().isEmpty()) {
            throw new ValidationException(ValidationException.blankValidation);
        }
    }

    private static int calculate(String[] splitInputValue) {
        Calculation cal = new Calculation();
        int resultValue = StringUtil.StringByInt(splitInputValue[0]);
        for (int i = 0; i < splitInputValue.length - 2; i += 2) {
            resultValue = cal.calculate(resultValue, splitInputValue[i + 1].charAt(0), StringUtil.StringByInt(splitInputValue[i + 2]));
        }
        return resultValue;
    }


}
