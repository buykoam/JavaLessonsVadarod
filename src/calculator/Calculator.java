package calculator;

import calculator.operation.Operation;

public class Calculator {
    private final static String START_RESULT_STRING = "= ";
    private CalcStringParser calcStringParser;
    public Calculator(CalcStringParser calcStringParser){
        this.calcStringParser = calcStringParser;
    }

    public void calculate(String[] calcArgs) {
        final Operation operation = calcStringParser.parse(calcArgs);
        System.out.println(START_RESULT_STRING + operation.operate());
    }
}
