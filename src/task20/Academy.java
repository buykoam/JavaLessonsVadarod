package task20;

public class Academy {
    @AcademyInfo(year = 2024)
    public void methodWithAnnotation() {
        System.out.println("Метод с аннотацией @AcademyInfo");
    }

    public void methodWithoutAnnotation() {
        System.out.println("Метод без аннотации");
    }
}
