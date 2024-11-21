package calculator;

public class Main {
    public static void main(String[] args) {
        final CalcStringParser calcStringParser = new CalcStringParser();
        final Calculator calculator = new Calculator(calcStringParser);
        calculator.calculate(args);
    }
}
