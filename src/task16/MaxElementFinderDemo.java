package task16;

public class MaxElementFinderDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new RandomArrayGenerator(), "Поток " + (i+1));
            thread.start();
        }
    }
}
