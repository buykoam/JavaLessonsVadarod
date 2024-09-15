package task4;

import java.util.Random;

public class Four {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        System.out.println("Исходный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                array[i] = 0;
            }
        }
    }
}
