package task8;

public class CustomString {
    public static String text;

    public CustomString() {

    }

    public CustomString(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void charAt() {
        System.out.println("Последний символ строки: " + text.charAt(text.length() - 1));
    }
    public void endsWith() {
        System.out.println("Заканчивается ли ваша строка подстрокой “java!”: " + text.endsWith("java!"));
    }
    public void startsWith() {
        System.out.println("Начинается ли ваша строка подстрокой “Добро пож””: " + text.startsWith("Добро пож"));
    }
    public void contains() {
        System.out.println("Cодержит ли ваша строка подстроку Java: " + text.contains("Java"));
    }
    public void indexOf() {
        System.out.println("Найти позицию подстроки “Java”: " + text.indexOf("Java"));
    }
    public void replace() {
        System.out.println("Заменить все символы “а” на “о”: " + text.replace('a', 'o'));
    }
    public void toLowerCase() {
        System.out.println("Преобразование строки к нижнему регистру " + text.toLowerCase());
    }
    public void toUpperCase() {
        System.out.println("Преобразование строки к верхнему регистру " + text.toUpperCase());
    }
    public void substring() {
        System.out.println("Вырезать строку Java c помощью метода String.substring: " + text.substring(7, 11));
    }
    public void replaceAll() {
        String cleaned = text.replaceAll("[^а-яА-ЯёЁa-zA-Z ]+", "");
        System.out.println(cleaned);
    }
}
