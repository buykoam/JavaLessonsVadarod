package task1;

import java.util.Scanner;

public class DataTypesVariablesOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = a / b;
        double ostatok = a % b;
        double result = ((ostatok == 0) ? sum : ostatok);

        System.out.println("Результат " + result);
    }
}
