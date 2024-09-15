package task4;

public class Two {
    public static void main(String[] args) {
        int [] numbers = {1, 3, 5, 6, 7, 8};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number  : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
    }
}
