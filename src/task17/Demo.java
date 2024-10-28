package task17;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<City> cities = Arrays.asList (new City (1, "Чунцин", 32000000, Сontinent.Азия),
                new City(2, "Токио", 40000000, Сontinent.Европа),
                new City(3, "Алжир",2364230,Сontinent.Африка),
                new City(4, "Осло",709037, Сontinent.Европа),
                new City(5, "Аккра",2721000, Сontinent.Африка),
                new City(6, "Баку",230300000, Сontinent.Азия)
        );
        // 1.2. Найти самый густонаселённый город на континенте (например, Европа)
        Optional<City> mostPopulousInEurope = cities.stream()
                .filter(city -> city.getContinent() == Сontinent.Европа)
                .max(Comparator.comparingLong(City::getPopulation));
        System.out.println("Грод с максимальным населением на континенте: ");
        mostPopulousInEurope.ifPresent(System.out::println);

        // 1.3. Найти город, с минимальным населением на континенте.
        Optional<City> leastPoplousEurope = cities.stream()
                .filter(city -> city.getContinent() == Сontinent.Европа)
                .min(Comparator.comparingLong(City ::getPopulation));
        System.out.println("Грод с минимальным населением на континенте: ");
        leastPoplousEurope.ifPresent(System.out::println);

        //1.4. Найти самый густонаселённый город
        Optional<City> mostPopulous = cities.stream()
                .max(Comparator.comparingLong(City::getPopulation));
        System.out.println("Самый густонаселённый город: ");
        mostPopulous.ifPresent(System.out::println);

        //1.5. Найти город с самым маленьким населением
        Optional<City> leastPopulous = cities.stream()
                .min(Comparator.comparingLong(City::getPopulation));
        System.out.println("Город с самым маленьким населением: ");
        leastPopulous.ifPresent(System.out::println);

        //1.6. Найти первый попавшиеся город, у которого население больше 1млн.
        Optional<City> MillionPopulation = cities.stream()
                .filter(city -> city.getPopulation() > 1000000)
                .findFirst();
        System.out.println("Первый попавшиеся город, у которого население больше 1млн.");
        MillionPopulation.ifPresent(System.out::println);

        //1.7. Отобрать города с населением больше 1 млн.
        List<City> citiesOverMillion = cities.stream()
                .filter(city -> city.getPopulation() > 1000000)
                .collect(Collectors.toList());
        System.out.println("Города с населением больше 1 млн.");
        citiesOverMillion.forEach(System.out::println);

        //Отсортировать города по населению по возрастанию. По убыванию.
        List<City> sortedAscending = cities.stream()
                .sorted(Comparator.comparingLong(City::getPopulation))
                .collect(Collectors.toList());
        System.out.println("Сортировка по возврастанию:");
        sortedAscending.forEach(System.out::println);

        List<City> sortedDescending = cities.stream()
                .sorted(Comparator.comparingLong(City::getPopulation).reversed())
                .collect(Collectors.toList());
        System.out.println("Сортировка по убыванию:");
        sortedDescending.forEach(System.out::println);

        // 1.9. Создать коллекцию из имён города
        List<String> cityNames = cities.stream()
                .map(City::getNameCity)
                .collect(Collectors.toList());
        System.out.println("City names: " + cityNames);

        // 1.10. Посчитать среднее количество населения среди всех городов.
        double averagePopulation = cities.stream()
                .mapToLong(City::getPopulation)
                .average()
                .orElse(0);
        System.out.println("Average population: " + averagePopulation);

        // 1.11. Проверить, есть ли город Осло в вашей коллекции
        boolean hasOslo = cities.stream()
                .anyMatch(city -> city.getNameCity().equalsIgnoreCase("Oslo"));
        System.out.println("Is Oslo present: " + hasOslo);

        // 1.12. Найти город Осло в коллекции и выбросить Exception, если такого нет.
        City oslo = cities.stream()
                .filter(city -> city.getNameCity().equalsIgnoreCase("Осло"))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("City Oslo not found"));
        System.out.println("Found city: " + oslo);


    }
}
