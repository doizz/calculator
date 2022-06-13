package servoce;

import common.InputView;
import domain.StringCalculator;

public class CalculatorService {

    public void calculatorStart(){
        String inputValue = InputView.inputCalculatorValue();
        System.out.println(StringCalculator.calculationResult(inputValue));
    }
}
