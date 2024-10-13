package task13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private final String name;

    private List<Group> groups;
    private StatusFaculty status;

    public Faculty(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);

    }

    public void  updateStatus() {
        int totalStudents = groups.stream().mapToInt(Group::getStudentCount).sum();
        if (totalStudents < 20) {
            status = StatusFaculty.NOT_ACTIVE; // Меняем статус на неактивный
        } else {
            status = StatusFaculty.ACTIVE; // Меняем статус на активный
        }
    }
    public StatusFaculty getStatus(){
        return status;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "Факультет = " + name + '\'' +
                ", Группа = " + groups +
                ", Статус = " + status +
                '}';
    }

}
