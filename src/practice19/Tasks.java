package practice19;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class Tasks {
    @Test
    //Создать объект класса LocalDate, представляющий собой дату 25.06.2020. Вывести полученную дату в консоль
    public void task1(){
        System.out.println(LocalDate.of(2020,6,25));
    }

    @Test
    //Создать объект LocalDate, представляющий собой сегодняшнюю дату. Используя этот объект, создать другой объект LocalDate, представляющий собой дату через 3 месяца после сегодняшней. Вывести эту дату в консоль.
    public void task2(){
        System.out.println(LocalDate.now().plus(3L, ChronoUnit.MONTHS));
    }
    @Test
    //Создать объект LocalDate, представляющий собой сегодняшнюю дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку в консоль
    public void task3(){
        LocalDate localDate = LocalDate.of(2017, 5, 5);
        System.out.println(String.format("%02d. %02d. %d",
                localDate.get(ChronoField.DAY_OF_MONTH),
                localDate.get(ChronoField.MONTH_OF_YEAR),
                localDate.get(ChronoField.YEAR)
        ));
    }
    @Test
    //Дана строка вида "26-03-2014". Получить объект LocalDate, представляющий собой дату, полученную из этой строки.
    public void task4(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(LocalDate.parse("26-03-2014", formatter));
    }
    @Test
    public void test5(){
       //Создать объект LocalDate, представляющий собой сегодняшнюю дату. Создать объект LocalDate, представляющий собой дату 25.06.2020. Используя созданные объекты, найти количество дней между этими двумя датами.
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2020,6,25);
        System.out.println(DAYS.between(startDate, endDate));
        System.out.println(Period.between(startDate,endDate).getDays());
    }
    @Test
    //Даны два объекта LocalDate из предыдущего задания. Подсчитать количество секунд между полуночью первой даты и полуночью второй даты.
    public void task6(){
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2024,11,2);
        Duration duration =Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay());
        System.out.println(duration.abs().getSeconds());

        System.out.println(LocalDateTime.of(startDate, LocalTime.MIDNIGHT));
    }
    @Test
    public void task7(){
        //Написать свою реализацию интерфейса TemporalAdjuster, которая бы прибавляла к дате 42 дня
        LocalDate now = LocalDate.now();
        System.out.println(now);
        TemporalAdjuster temporalAdjuster =
                date -> date.plus(42L, DAYS);
        System.out.println(now.with(temporalAdjuster));
    }
    @Test
    public void task8(){
        //Написать свою реализацию интерфейса TemporalAdjuster, которая бы изменяла дату на ближайшее (в днях) 1 января.
        TemporalAdjuster temporalAdjuster =
                date -> {
            long betweenNextYear = DAYS.between(date,date.with(TemporalAdjusters.firstDayOfNextYear()));
            long betweenCurrentYear = DAYS.between(date.with(TemporalAdjusters.firstDayOfYear()), date);
            return betweenCurrentYear < betweenNextYear ? date.with(TemporalAdjusters.firstDayOfYear())
                    : date.with(TemporalAdjusters.firstDayOfNextYear());
                };
        System.out.println(LocalDate.now().with(temporalAdjuster));
    }
}
