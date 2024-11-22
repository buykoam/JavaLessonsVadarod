package calculator;

import calculator.parser.CalcStringParser;
import calculator.parser.CorrectionParser;

public class Main {
    public static void main(String[] args) {
        final CalcStringParser calcStringParser = new CorrectionParser();
        final Calculator calculator = new Calculator(calcStringParser);
        calculator.calculate(args);
    }
}
