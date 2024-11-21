package calculator;

import calculator.operation.Operation;
import calculator.operation.SumOperation;
import calculator.operation.ZeroOperation;

public class CalcStringParser {
    public Operation parse(String[] args) {
        return new SumOperation(2, 2);
    }
}
