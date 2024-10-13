package task13;

import java.util.List;

public class Student {
    private final String name;
    private final String surName;
    private final String birthday;
    private final String city;
    private final double averageBall;

    public Student(String name, String surName, String birthday, String city, double averageBall) {
        this.name = name;
        this.surName = surName;
        this.birthday = birthday;
        this.city = city;
        this.averageBall = averageBall;
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
    public double getAverageBall() {
        return averageBall;
    }

    public String getCity() {
        return city;
    }
    @Override
    public String toString() {
        return "Student{" +
                "Имя = " + name + '\'' +
                ", Фамилия = " + surName + '\'' +
                ", День рождения = " + birthday + '\'' +
                ", Город = " + city + '\'' +
                ", Средний бал = " + averageBall +
                '}';
    }

}

