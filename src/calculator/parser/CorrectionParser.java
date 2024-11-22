package calculator.parser;

import calculator.operation.Operation;

public class CorrectionParser extends CalcStringParser {
    @Override
    public Operation parse(String[] calcArgs) {
        final String joining = String.join("", calcArgs);
        return super.parse(joining.split(""));



    }
}
