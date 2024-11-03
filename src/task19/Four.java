package task19;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Four {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd MMM yyyy, время: HH:mm:ss a");
        System.out.println(formatter.format(LocalDateTime.now()));
    }
}
