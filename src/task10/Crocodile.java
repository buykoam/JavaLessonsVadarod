package task10;

public class Crocodile extends Predator {

    public String type;
    @Override
    public void hunting() {
        System.out.println("Прыгает на жертву. ");
    }

    @Override
    public String toString() {
        System.out.println("Живет в болоте. " + "Скорость 48 км/ч. " + "Зеленый окрас");
        return null;
    }

    @Override
    public void voice() {
        System.out.println("Крокодил издает скрипящие и хрюкающие звуки");

    }

    @Override
    public void moves() {
        System.out.println("На суше и в воде крокодилы могут высоко прыгать, отталкиваясь хвостом или задними конечностями.");
    }
    public Crocodile(){
    }
    public Crocodile(String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void type(){
        System.out.println(type);
    }
}
