package task10;

import javax.swing.plaf.PanelUI;

public abstract class Predator {
    public String habitat;

    public int speed;
    public String color;

    public abstract void hunting();
    public abstract void data();
    public abstract void voice();
    public abstract void moves();

    public Predator(){

    }
    public Predator (String habitat, int speed, String color){
        this.habitat = habitat;
        this.color = color;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Predator{" +
                "habitat='" + habitat + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
