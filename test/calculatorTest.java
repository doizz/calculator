import common.Calculation;
import common.CalculationTest;
import common.StringUtil;
import common.StringUtilTest;
import domain.StringCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class calculatorTest {

    @ParameterizedTest
    @DisplayName("공백 문자열이 있으면 split 으로 문자를 나누는 테스트")
    @ValueSource(strings = {"1 + 3 * 2"})
    public void StringSplit(String input) {
        String[] array = StringUtil.stringSplit(input);
        String[] array2 = {"1", "+", "3", "*", "2"};
        assertThat(array).isEqualTo(array2);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("null 이거나 빈 문자열일 경우 예외처리 테스트")
    public void stringValidation(String inputValue) {
        assertThatThrownBy(() -> {
            StringCalculator.calculationResult(inputValue);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("사칙연산테스트")
    public void calculation() {
        assertThat(25).isEqualTo(Calculation.result("+",10, 15));
        assertThat(8).isEqualTo(Calculation.result("-",10, 2));
        assertThat(100).isEqualTo(Calculation.result("*",10, 10));
        assertThat(1).isEqualTo(Calculation.result("/",10, 10));
    }


    @ParameterizedTest
    @DisplayName("사칙연산기호가 아닌경우 예외처리")
    @ValueSource(strings = {"1 % 2 * 3"})
    public void operatorValidation(String inputValue) {
        assertThatThrownBy(() -> {
            StringCalculator.calculate(inputValue.split(" "));
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("사칙연산을 모두 포함하는 기능 구현")
    @ValueSource(strings = {"1 * 2 * 3"})
    public void calculationValidation(String inputValue) {
        int resultValue = StringCalculator.calculate(inputValue.split(" "));
        assertThat(6).isEqualTo(resultValue);
    }

}