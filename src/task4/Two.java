package task4;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа: ");

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0 && a % 5 == 0 && b % 5 == 0 && c % 5 == 0 ) {
            System.out.println(a + " " + b + " " + " " + c);
        } else if (a % 2 == 0 && b % 2 == 0 && a % 5 == 0 && b % 5 == 0) {
            System.out.println(a + " " + b);
        } else if (a % 2 == 0 && c % 2 == 0 && a % 5 == 0 && c % 5 == 0) {
            System.out.println(a + " " + c);
        } else if (b % 2 == 0 && c % 2 == 0 && b % 5 == 0 && c % 5 == 0) {
            System.out.println(b + " " + c);
        } else if (a % 2 == 0) {
            System.out.println(a);
        } else if (b % 2 == 0){
            System.out.println(b);
        } else if (c % 2 == 0) {
            System.out.println(c);
        } else if (a % 5 == 0) {
            System.out.println(a);
        } else if (b % 5 == 0) {
            System.out.println(b);
        } else if (c % 5 == 0){
            System.out.println(c);
        } else System.out.println("Ни одно число не делится на 5 и на 2");
    }
}
