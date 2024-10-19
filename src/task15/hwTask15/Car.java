package task15.hwTask15;

import java.io.Serializable;

public class Car implements Serializable {
    String mark;
    String color;
    int MaxSpeed;
    public Car(String mark, String color, int maxSpeed) {
        this.mark = mark;
        this.color = color;
        MaxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Car{" +
                "Марка " + mark + '\'' +
                ", Цвет " + color + '\'' +
                ", Максимальная скорось " + MaxSpeed + "км/ч" +
                '}';
    }
}
