package task13;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов", "10.11.94", "Жодино", 9.9);
        Student student2 = new Student("Лариса", "Дорош", "13.09.93", "Смолевичи", 10.0);
        Student student3 = new Student("Лариса2", "Дорош", "13.09.93", "Смолевичи", 5.9);
        Student student4 = new Student("Лариса3", "Дорош", "13.09.93", "Смолевичи", 7.9);
        Student student5 = new Student("Лариса4", "Дорош", "13.09.93", "Смолевичи", 8.9);
        Student student6 = new Student("Лариса5", "Дорош", "13.09.93", "Смолевичи", 3.9);
        Student student7 = new Student("Лариса6", "Дорош", "13.09.93", "Смолевичи", 2.9);
        Student student8 = new Student("Лариса7", "Дорош", "13.09.93", "Смолевичи", 1.0);
        Student student9 = new Student("Лариса8", "Дорош", "13.09.93", "Смолевичи", 6.9);
        Student student10 = new Student("Лариса9", "Дорош", "13.09.93", "Смолевичи", 7.9);
        Student student11 = new Student("Лариса10", "Дорош", "13.09.93", "Смолевичи", 9.9);
        Student student12 = new Student("Лариса11", "Дорош", "13.09.93", "Смолевичи", 2.9);
        Student student13 = new Student("Лариса12", "Дорош", "13.09.93", "Смолевичи", 10.0);
        Student student14 = new Student("Лариса13", "Дорош", "13.09.93", "Смолевичи", 5.5);
        Student student15 = new Student("Лариса14", "Дорош", "13.09.93", "Смолевичи", 7.3);
        Student student16 = new Student("Лариса15", "Дорош", "13.09.93", "Смолевичи", 2.1);
        Student student17 = new Student("Лариса16", "Дорош", "13.09.93", "Смолевичи", 2.9);
        Student student18 = new Student("Лариса17", "Дорош", "13.09.93", "Смолевичи", 7.9);
        Student student19 = new Student("Лариса18", "Дорош", "13.09.93", "Смолевичи", 8.9);
        Student student20 = new Student("Лариса19", "Дорош", "13.09.93", "Смолевичи", 9.9);
        Student student21 = new Student("Лариса20", "Дорош", "13.09.93", "Смолевичи", 5.9);
        Student student22 = new Student("Лариса21", "Дорош", "13.09.93", "Смолевичи", 7.9);
        Student student23 = new Student("Лариса22", "Дорош", "13.09.93", "Смолевичи", 8.9);

        Group group = new Group(3425);
        Group group1 = new Group(2224);
        Group group2 = new Group(8675);

        Faculty faculty = new Faculty("Факультет информационных технологий");

        faculty.addGroup(group);
        faculty.addGroup(group1);
        faculty.addGroup(group2);

        group.addStudents(student);
        group.addStudents(student2);
        group.addStudents(student3);
        group.addStudents(student4);
        group.addStudents(student5);
        group.addStudents(student6);
        group.addStudents(student7);
        group.addStudents(student8);
        group.addStudents(student9);
        group.addStudents(student10);
        group.addStudents(student11);
        group.addStudents(student12);
        group.addStudents(student13);
        group.addStudents(student14);
        group.addStudents(student15);
        group.addStudents(student16);
        group.addStudents(student17);
        group.addStudents(student18);
        group.addStudents(student19);
        group.addStudents(student20);
        group.addStudents(student21);
        group1.addStudents(student22);
        group2.addStudents(student23);

        group.deleteStudent();
        group2.transferStudents(group);
        group1.transferStudents(group);
        faculty.updateStatus();
        System.out.println(faculty);
        System.out.println("Статус факультета: " + faculty.getStatus());
        System.out.println("Средний балл группы 1: " + group.calculateAverageScore());
        System.out.println("Средний балл группы 2: " + group1.calculateAverageScore());
        System.out.println("Средний балл группы 3: " + group2.calculateAverageScore());
    }
}
