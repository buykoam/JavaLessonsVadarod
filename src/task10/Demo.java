package task10;

public class Demo {
        public static void main(String[] args) {
            Predator[] predators = new Predator[0]; // Изначально пустой массив

            // Метод для добавления нового хищника в массив
            predators = addPredator(predators, new Crocodile("Болото", 25.0, "Зеленый", "Простой крокодил"));
            predators = addPredator(predators, new Wolf("Лес", 50.0, "Серый"));
            predators = addPredator(predators, new Leopard("Джунгли", 58.0, "Споттед", "Лео"));

            // Вывод информации о хищниках
            for (Predator predator : predators) {
                System.out.println(predator);
                predator.huntingMethod();
                System.out.println("Звук: " + predator.makeSound());
                System.out.println("Способ передвижения: " + predator.movementType());
                System.out.println();
            }
        }

        // Метод для добавления нового хищника в массив
        public static Predator[] addPredator(Predator[] array, Predator newPredator) {
            Predator[] newArray = new Predator[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[array.length] = newPredator;
            return newArray;
        }
    }

