package task13;

import java.util.ArrayList;
import java.util.List;

public class Group extends Function {
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
    private final int group;

    @Override
    public String toString() {
        return "Group{" +
                "group=" + group +
                ", students=" + students +
                '}';
    }

    private List<Student> students;
}

