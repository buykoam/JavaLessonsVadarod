package task10;

abstract class Predator {
    private String habitat; // Среда обитания
    private double maxSpeed; // Максимальная скорость
    private String color; // Окрас

    public Predator(String habitat, double maxSpeed, String color) {
        this.habitat = habitat;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    // Абстрактные методы
    public abstract void huntingMethod();
    public abstract String makeSound();
    public abstract String movementType();

    @Override
    public String toString() {
        return "Habitat: " + habitat + ", Max Speed: " + maxSpeed + " km/h, Color: " + color;
    }
}