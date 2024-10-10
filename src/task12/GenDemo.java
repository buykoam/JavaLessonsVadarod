package task12;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer, String> gen = new Gen<>(88, "Generics");
        gen.toString();
        System.out.println("Значение T: " + gen.getOЬT());
        System.out.println("Значение S: " + gen.getObS());
    }
}
