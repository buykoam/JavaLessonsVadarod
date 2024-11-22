package calculator.parser;

import calculator.operation.Operation;
import calculator.operation.SumOperation;
import calculator.operation.ZeroOperation;

public class CalcStringParser {
    public Operation parse(String[] calcArgs) {
        final String firstOperand = calcArgs[0];
        final Number firstValue;
        if(firstOperand.contains(".")) {
            firstValue = Double.valueOf(firstOperand);
        } else {
            firstValue = Long.valueOf(firstOperand);
        }
        final String secondOperand = calcArgs[2];
        final Number secondValue;
        if (firstOperand.contains(".")) {
            secondValue = Double.valueOf(secondOperand);
        } else {
            secondValue = Long.valueOf(secondOperand);
        }
        return new SumOperation(firstValue, secondValue);
    }
}
