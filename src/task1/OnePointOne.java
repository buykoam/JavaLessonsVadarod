package task1;

import java.util.Scanner;

public class OnePointOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double div = a / b;
        double ostatok = a % b;
        double result = ((ostatok == 0) ? div : ostatok);

        System.out.println("Результат " + result);
    }
}
