package task13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final int group;
    private List<Student> students;

    public Group(int group) {
        this.group = group;
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    private void addStudent(Student student) {
    }

    public int getStudentCount() {
        return students.size();
    }

    public void deleteStudent() {
        students.removeIf(student -> student.getAverageBall() < 4.0);
    }

    public void transferStudents(Group targetGroup) {
        if (students.size() < 2) {
            for (Student student : new ArrayList<>(students)) {
                targetGroup.addStudent(student);
                students.remove(student);
            }
        }
    }

    public double calculateAverageScore() {
        if (students.isEmpty())
            return 0;
        double totalScore = 0;
        for (Student student : students) {
            totalScore += student.getAverageBall();
        }
        return totalScore / students.size();
    }
    @Override
    public String toString() {
        return "Group{" +
                "Группа = " + group +
                ", Студенты = " + students +
                '}';
    }
}

