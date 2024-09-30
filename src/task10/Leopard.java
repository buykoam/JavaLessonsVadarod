package task10;

public class Leopard extends Predator {

    public String name;
    @Override
    public void hunting() {
        System.out.println(name  + " Догоняет жертву. ");
    }

    @Override
    public String toString() {
        System.out.println("Живет в  джунглях. " + "Скорость 58 км/ч. " + "Золотистый окрас");
        return null;
    }

    @Override
    public void voice() {
        System.out.println("Леопард издает рычащие звуки");

    }

    @Override
    public void moves() {
        System.out.println("Леопард передвигается на четырех лапах.");
    }
    public Leopard(){
    }
    public Leopard(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void name(){
        System.out.println(name);
    }
}
