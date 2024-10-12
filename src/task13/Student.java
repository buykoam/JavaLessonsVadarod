package task13;

import java.util.List;

public class Student {
    private final String name;
    private final String surName;
    private final String birthday;
    private final String city;
    private final int average;
    List<Integer> averageBall;

    public Student(String name, String surName, String birthday, String city, List<Integer> averageBall, int average) {
        this.name = name;
        this.surName = surName;
        this.birthday = birthday;
        this.city = city;
        this.averageBall = averageBall;
        this.average = calculateAverage();
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCity() {
        return city;
    }

    public int getAverage() {
        return average;
    }

    private double calculatesAverage() {
        int sum = 0;
        for (int average : averageBall) {
            sum += averageBall;
        }
        return (double) sum / averageBall.size();
    }
}
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", city='" + city + '\'' +
                ", averageBall=" + averageBall +
                '}';
}
