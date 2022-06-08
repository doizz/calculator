import common.InputView;
import domain.StringCalculator;

public class Calculator {
    public static void main(String[] args) {
        String inputValue = InputView.inputCalculatorValue();
        System.out.println(StringCalculator.calculationResult(inputValue));
    }
}
