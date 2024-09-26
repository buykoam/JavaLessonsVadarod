package task8;

public class StringDemo {
    public static void main(String[] args) {
        CustomString customString = new CustomString("I like Java!!!");
        customString.charAt();
        customString.endsWith();
        customString.startsWith();
        customString.contains();
        customString.indexOf();
        customString.replace();
        customString.toLowerCase();
        customString.toUpperCase();
        customString.substring();
        CustomString customString2 = new CustomString("Да1та выпуска 8 декабря 1998 года[12]. Кодовое имя Playground. \n В данном случае встречается путаница. Выпускались книги, например, Beginning Java 2 by Ivor Horton (Mar 1999), \n фактически по J2SE 1.2 (бывшее название — Java 2). Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри.\n Технологии программирования на Java 2. Распределённые приложения (2011). В то время, когда, как известно, Java 2 была исторически заменена следующими релизами,\n подобные названия книг дезориентируют в понимании, о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK 7,\n это приводит к полной путанице.");
        customString2.replaceAll();
    }
}
