package task16;

import java.util.Random;

public class RandomArrayGenerator implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(Thread.currentThread().getName() + " - Максимальный элемент: " + max);
    }
}

