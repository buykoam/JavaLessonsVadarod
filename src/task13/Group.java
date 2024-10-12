package task13;

import java.util.ArrayList;
import java.util.List;

public class Group  {
    private final int group;
    private List<Student> students;

    double bal = 0;
    public Group(int group) {
        this.group = group;
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
     return students;
    }

    public void deleteStudent(){
        students.removeIf(student -> student.getAverageBall() < 4.0);
    }

    public void transferStudents(Group targetGroup){
        if(students.size()< 2){
            for (Student student : new ArrayList<>(students)){
                targetGroup.addStudent(student);
                students.remove(student);
            }
        }
    }

    private void addStudent(Student student) {
    }

    public int getStudentCount(){
        return students.size();
    }
    
    @Override
    public String toString() {
        return "Group{" +
                "Группа = " + group +
                ", Студенты = " + students +
                '}';
    }
}

