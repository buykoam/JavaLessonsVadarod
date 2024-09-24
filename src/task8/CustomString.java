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

}
