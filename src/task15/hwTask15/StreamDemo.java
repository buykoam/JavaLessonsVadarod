package task15.hwTask15;

import java.io.*;

public class StreamDemo {
    public static void main(String[] args) throws IOException {


        File absolute = new File("D:\\JAVA\\JAVAVADAROD\\JavaLessonsVadarod\\text.txt");
        File relative = new File("text.txt");
        InputStream ab = null;
        InputStream re = null;

        try {
            ab = new FileInputStream(absolute);
            re = new FileInputStream(relative);

            byte[] bytes= new byte[1080];
            int len = ab.read(bytes);
            int len2 = re.read(bytes);
            System.out.println("Содержимое первого файла: " + new String(bytes));
            System.out.println(" ");
            System.out.println("Содержимое второго файла: " + new String(bytes));

        } catch (FileNotFoundException e) {
            System.out.println("Файла не существует");
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        } finally {
            ab.close();
            re.close();
        }
    }
}
