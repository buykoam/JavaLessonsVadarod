package task13;

import java.util.ArrayList;
import java.util.Arrays;

public class Group extends Student{
    private final int group;

    public Group(int group) {
        this.group = group;
    }
    ArrayList<Student> student = new ArrayList<>(Arrays.asList(getName(), getSurName(), getBirthday(), getCity(), getAverageBall()));
}
