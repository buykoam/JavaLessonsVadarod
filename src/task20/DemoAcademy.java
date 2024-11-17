package task20;

import java.lang.reflect.Method;

public class DemoAcademy {
    public static void main(String[] args) {
        Class<Academy> academyClass = Academy.class;

        // Получаем все методы класса
        Method[] methods = academyClass.getDeclaredMethods();

        for (Method method : methods) {
            // Проверяем наличие аннотации @AcademyInfo
            if (method.isAnnotationPresent(AcademyInfo.class)) {
                AcademyInfo academyInfo = method.getAnnotation(AcademyInfo.class);
                System.out.println("Метод: " + method.getName() +
                        ", Год: " + academyInfo.year());
            } else {
                System.out.println("Метод: " + method.getName() +
                        " не имеет аннотации @AcademyInfo");
            }
        }
    }
}


