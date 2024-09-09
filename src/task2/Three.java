package task2;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        double x = scanner.nextDouble();

        double result = 15/x;

        switch ((int) result){
            case 3:
            System.out.println("Результат деления равен 3");
            break;
            case 5:
                System.out.println("Результат деления равен 5");
             break;
            default:
                System.out.printf("Результат деления равен дробному числу: %.2f%n", result);
                break;
        }
    }
}
