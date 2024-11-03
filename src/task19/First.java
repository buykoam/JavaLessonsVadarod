package task19;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class First {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat now;

        now = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Текущая дата " + now.format(date));
    }
}
