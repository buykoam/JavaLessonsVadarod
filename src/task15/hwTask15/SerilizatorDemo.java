package task15.hwTask15;

import java.io.*;

public class SerilizatorDemo {
    public static void main(String[] args) {
        Car car = new Car("Volvo", "черная", 180);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.ser"))) {
            oos.writeObject(car);
            System.out.println("Объект автомобилю сериализован: " + car);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.ser"))) {
            Car deserializedCar = (Car) ois.readObject();
            System.out.println("Объект автомобилю десериализован: " + deserializedCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

