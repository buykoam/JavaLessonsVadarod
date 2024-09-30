package task10;

public class Demo {
    public static void main(String[] args) {

        Crocodile crocodile = new Crocodile(" Нильский крокодил");
        crocodile.type();
        crocodile.hunting();
        crocodile.toString();
        crocodile.voice();
        crocodile.moves();
        System.out.println("_____________");
        Leopard leopard = new Leopard("Леопард Барс");
        leopard.name();
        leopard.hunting();
        leopard.toString();
        leopard.voice();
        leopard.moves();
    }

}
