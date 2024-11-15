package task20;

public class Man {

    public String name;
    public int age;
    public String gender;

    public Man(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    private void cook(){
        System.out.println(name +"Готовит");
    }
    private void fix(){
        System.out.println(name + "Ремонтирует ");
    }
    public void learn(){
        System.out.println(name + age + gender + "Ходит в школу");
    }
    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
