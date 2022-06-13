import common.InputView;
import domain.StringCalculator;
import servoce.CalculatorService;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.calculatorStart();
    }
}
