package task20;

import java.util.Arrays;

public class analyzeClass {
    public static void analyzeClass (Object o){
        Class clazz = o.getClass();
        System.out.println("Имя класса: " + clazz);
        System.out.println("Поля класса: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Методы класса: " +  Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(clazz.getConstructors()));
    }
    public static void analyzeMethod(Object o){
        Class clazz = o.getClass();
        System.out.println("Методы класса: " + Arrays.toString(clazz.getDeclaredMethods()));;
    }

    public static void main(String[] args) {
        analyzeClass(new Man("Алиса", 20, "female"));
        analyzeMethod(new PrintHelloWorld());
    }

}
