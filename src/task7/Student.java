package task7;

public class Student {
    public  int id;
    public String surname;
    public String firstname;
    public String birthday;
    public String faculty;
    public int course;
    public int group;

    public Student (){

    }

    public Student(int id,String surname, String firstname, String birthday, String faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.birthday = birthday;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
    public void information (){
        System.out.println("Id: " + id);
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + firstname);
        System.out.println("Дата рождения: " + birthday);
        System.out.println("Факультет " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа " + group);
    }
}
