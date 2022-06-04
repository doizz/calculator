import common.CalculationTest;
import common.StringUtilTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class calculatorTest {

    @ParameterizedTest
    @DisplayName("공백 문자열이 있으면 split 으로 문자를 나누는 테스트")
    @ValueSource(strings = {"1 + 3 * 2"})
    public void 문자열나누기(String input) {
        String[] array = input.split(" ");
        String[] array2 = {"1", "+", "3", "*", "2"};
        assertThat(array).isEqualTo(array2);
    }

    @ParameterizedTest
    @DisplayName("null 이거나 빈 문자열일 경우 예외처리 테스트")
    @ValueSource(strings = {"", " "})
    public void 문자열예외처리(String inputValue) {
        assertThatThrownBy(() -> {
            StringUtilTest.isNull(inputValue);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("더하기")
    public void 더하기테스트() {
        assertThat(25).isEqualTo(CalculationTest.addTest(10, 15));
    }

    @Test
    @DisplayName("빼기")
    public void 빼기테스트() {
        assertThat(5).isEqualTo(CalculationTest.subtractTest(15, 10));
    }

    @Test
    @DisplayName("곱하기")
    public void 곱하기테스트() {
        assertThat(20).isEqualTo(CalculationTest.multiplyTest(10, 2));
    }

    @Test
    @DisplayName("나누기")
    public void 나누기테스트() {
        assertThat(2).isEqualTo(CalculationTest.divideTest(10, 5));
    }


    @ParameterizedTest
    @DisplayName("사칙연산기호가 아닌경우 예외처리")
    @ValueSource(strings = {"1 * 2 % 3"})
    public void 사칙연산기호가아닐경우(String inputValue) {
        assertThatThrownBy(() -> {
            calculation(inputValue.split(" "));
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("사칙연산을 모두 포함하는 기능 구현")
    @ValueSource(strings = {"1 * 2 * 3"})
    public void 사칙연산을모두포함하는경우(String inputValue) {
        int resultValue = calculation(inputValue.split(" "));
        assertThat(6).isEqualTo(resultValue);

    }

    public int calculation(String[] splitInputValue) {
        int resultValue = Integer.parseInt(splitInputValue[0]);
        for (int i = 0; i < splitInputValue.length - 2; i += 2) {
            resultValue = CalculationTest.calculate(resultValue, splitInputValue[i + 1].charAt(0), Integer.parseInt(splitInputValue[i + 2]));
        }
        return resultValue;
    }


}