package task10;

class Leopard extends Predator {
    private String name; // Имя леопарда

    public Leopard(String habitat, double maxSpeed, String color, String name) {
        super(habitat, maxSpeed, color);
        this.name = name;
    }

    @Override
    public void huntingMethod() {
        System.out.println("Леопард догоняет жертву.");
    }

    @Override
    public String makeSound() {
        return "Рычит.";
    }

    @Override
    public String movementType() {
        return "Ловко передвигается по деревьям и земле.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Name: " + name;
    }
}