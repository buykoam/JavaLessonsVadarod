package task1;

import java.util.Scanner;

public class OnePointThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double multip = a * b;
        double sum = a + b;
        double result = ((a == -1) ? sum : multip);

        System.out.println("Результат " + result);
    }
}
