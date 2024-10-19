package task15;

import java.io.File;
import java.io.FileInputStream;

public class FileDemo {
    static void p (String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1 = new File("text.txt");
        p("Имя файла " + f1.getName());
        p("Путь " + f1.getPath());
        p(f1.exists() ? "существует" : "не существует");
        p("Последнее изменение файла " + f1.lastModified());
        p("Размер" + f1.length() + "байт");

    }
}
