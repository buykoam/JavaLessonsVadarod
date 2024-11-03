package task16;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Car car1 = new Car("Машина1", 3000);
        Car car2 = new Car("Машина2", 1500);
        Car car3 = new Car("Машина3", 2000);

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        thread1.start();
        thread1.join();

        thread2.start();
        thread3.start();




    }
}
