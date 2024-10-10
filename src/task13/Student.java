package task13;

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

    public String getCity() {
        return city;
    }

    public double getAverageBall() {
        return averageBall;
    }
}
