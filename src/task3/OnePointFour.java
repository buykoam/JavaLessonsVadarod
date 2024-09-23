package task3;

import java.util.Scanner;

public class OnePointFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double div = a / b;
        double sum = a + b;
        double result = ((a != 0 && a > 1) ? div : sum);

        System.out.println("Результат " + result);
    }
}
