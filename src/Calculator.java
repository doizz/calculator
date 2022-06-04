import common.InputView;
import domain.StringCalculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(StringCalculator.calculationResult(InputView.inputCalculatorValue()));
    }
}
