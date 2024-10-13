package task14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Departament {
    public static void main(String[] args) {
        HashMap<Integer, String> departament = new HashMap<>();

        departament.put(100, "Разработка");
        departament.put(20, "Тестирование");
        departament.put(6, "ПМ");
        departament.put(5, "HR");
        departament.put(7, "Безопасность");
        departament.put(10, "Поддержка");
        departament.put(11, "Аналитика");
        departament.put(3, "Развитие");
        departament.put(4, "Бухгалтерия");
        departament.put(9, "Дизайнеры");

        Set<Integer> keys = departament.keySet();
        System.out.println("Количество отделов " + departament.size());

        departament.forEach((a,b) -> System.out.println("Количество сотрудников: " + a + ". Название отдела: " + b));
        System.out.println();

        // Находим строки с ключами > 5
        System.out.println("Строки с ключами > 5:");
        for (Map.Entry<Integer, String> entry :  departament.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        // Если ключ = 0, выводим строки через запятую
        if ( departament.containsKey(0)) {
            System.out.print("Строка с ключом 0: ");
            System.out.println( departament.get(0));
        }

        // Перемножаем все ключи, где длина строки > 5
        int product = 1;
        boolean hasLongString = false;

        for (Map.Entry<Integer, String> entry :  departament.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                hasLongString = true;
            }
        }

        // Выводим результат перемножения
        if (hasLongString) {
            System.out.println("Произведение ключей, где длина строки > 5: " + product);
        } else {
            System.out.println("Нет строк длиной более 5 символов.");
        }
    }
}

