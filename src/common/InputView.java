package common;

import java.util.Scanner;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    private InputView() {
    }

    public static String inputCalculatorValue() {
        System.out.println("계산할 숫자와 연산자를 공백 구분으로 입력해주세요.");
        return sc.nextLine();
    }
}
