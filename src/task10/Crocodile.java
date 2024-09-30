package task10;
class Crocodile extends Predator {
    private String type; // Тип крокодила

    public Crocodile(String habitat, double maxSpeed, String color, String type) {
        super(habitat, maxSpeed, color);
        this.type = type;
    }

    @Override
    public void huntingMethod() {
        System.out.println("Крокодил прыгает на жертву.");
    }

    @Override
    public String makeSound() {
        return "Громкий хрип.";
    }

    @Override
    public String movementType() {
        return "Плавает и ползает.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}