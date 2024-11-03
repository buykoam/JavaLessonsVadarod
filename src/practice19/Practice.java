package practice19;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Practice {
    public static void main(String[] args) {

            ZonedDateTime now = ZonedDateTime.now();
            System.out.println(now);
        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Minsk")));
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(now.get(ChronoField.YEAR));
        System.out.println(now.minus(5L, ChronoUnit.DAYS));
        System.out.println(now.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(Instant.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(OffsetDateTime.now());

        LocalDate startSDate = LocalDate.now().minusDays(5L).minusMonths(1L);
        LocalDate endDate = LocalDate.now();
        Period between = Period.between(startSDate, endDate);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());
        System.out.println(ChronoUnit.DAYS.between(startSDate,endDate));

        LocalDateTime start = LocalDateTime.now().minus(12L, ChronoUnit.HOURS);
        LocalDateTime end = LocalDateTime.now();
        Duration between1 = Duration.between(start, end);
        System.out.println(between1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm a");
        System.out.println(formatter.format(LocalDateTime.now()));
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT));
    }
}
