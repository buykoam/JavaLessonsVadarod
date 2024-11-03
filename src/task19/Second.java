package task19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Second {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm:ss a");
        System.out.println(formatter.format(LocalDateTime.now()));
    }
}
