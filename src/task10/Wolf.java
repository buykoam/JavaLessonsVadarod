package task10;

class Wolf extends Predator {
    public Wolf(String habitat, double maxSpeed, String color) {
        super(habitat, maxSpeed, color);
    }

    @Override
    public void huntingMethod() {
        System.out.println("Волк окружает жертву.");
    }

    @Override
    public String makeSound() {
        return "Воет.";
    }

    @Override
    public String movementType() {
        return "Бегает.";
    }
}
