import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class addNumberTest {

    @ParameterizedTest
    @DisplayName("공백 문자열이 있으면 split 으로 문자를 나누는 테스트")
    @ValueSource(strings = {"1 3 4 5"})
    public void 문자열나누기(String input){
        String[] array = input.split(" ");
        System.out.println(input);

    }

    @Test
    @DisplayName("null 이거나 빈 문자열일 경우 예외처리 테스트")
    public void 문자열예외처리(){

    }

    @Test
    @DisplayName("숫자만 있는 경우 예외처리 테스트")
    public void 숫자만들어올경우(){

    }
    @Test
    @DisplayName("연산자만 있는 경우 예외처리 테스트")
    public void 연산자만들어올경우(){

    }
    @Test
    @DisplayName("계산 가능한 식인지 테스트(1. 홀수자리는 피연산자, 짝수자리는 연산자)")
    public void 계산신연산처리(){

    }
    @Test
    @DisplayName("계산 가능한 식인지 테스트(2. 피연산자와 연산자의 갯수의 합은 무조건 홀수다)")
    public void 계산식판별(){

    }
    @Test
    @DisplayName("덧셈, 뺄셈, 곱셈, 나눗셈 테스트")
    public void 산술테스트(){

    }


}