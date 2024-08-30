package task1;

import java.util.Scanner;

public class DataTypesVariablesOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double sum = 0;

        sum = a / b;
        int result = (int) ((sum == 0) ? sum : a % b);

        System.out.println("Результат " + result);
    }
}
