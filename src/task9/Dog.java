package task9;

public class Dog extends Animal{
    public String name;

    public Dog(){

    }
    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void bite(){
        System.out.println(name + " " + color + " кусает");
    }
    public void runs(){
        System.out.println(name + " " + color +" бегает");
    }
    public void jumps(){
        System.out.println(name + " " + color + " прыгает");
    }

    @Override
    public void play() {
        System.out.println(name + " " + color + " играет с мячом");
    }
}
