package task16;

public class Car implements Runnable {
    private String name;
    private int stopTime;

    public Car(String name, int stopTime) {
        this.name = name;
        this.stopTime = stopTime;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " едет...");
                Thread.sleep(1000);
            }
            System.out.println("Останавливается на " + stopTime + "мс.");
            Thread.sleep(stopTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
