package domain;

import common.Calculation;
import common.StringUtil;
import exception.ValidationException;

import java.util.Objects;

public class StringCalculator {

    public static int calculationResult(String inputValue) {
        isNull(inputValue);
        return calculate(StringUtil.stringSplit(inputValue));
    }

    private static void isNull(String inputValue) {
        if (inputValue.isBlank() || Objects.isNull(inputValue)) {
            throw new ValidationException(ValidationException.BLANK_VALIDATION);
        }
    }

    public static int calculate(String[] splitInputValue) {
        int resultValue = StringUtil.StringByInt(splitInputValue[0]);

        for (int i = 0; i < splitInputValue.length - 2; i += 2) {
            resultValue = Calculation.result(String.valueOf(splitInputValue[i + 1].charAt(0)), resultValue,StringUtil.StringByInt(splitInputValue[i + 2]));
        }
        return resultValue;
    }


}
