package task9;

public class Demo {
    public static void main(String[] args) {

        Dog dog = new Dog("Рекс", "черного окраса");
        dog.bite();
        dog.play();
        dog.runs();
        dog.jumps();
        Bird bird = new Bird("Ястреб", "черный");
        bird.voice();
        bird.peck();
        bird.hatchesChicks();
    }
}
