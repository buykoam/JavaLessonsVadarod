package task9;

public class Bird extends Animal{

    public String family;
    public double flightAltitude;
    public void peck(){
        System.out.println(family + " "+ color + " клюет");
    }
    public void hatchesChicks(){
        System.out.println(family + " " + color + " высиживыет птенцов");
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
    public double getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(double flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    @Override
    public void voice() {
        System.out.println(family + " " + color + " поет");
    }
    public Bird(){

    }
    public Bird(String family, String color){
        this.family = family;
        this.color = color;
    }
}
