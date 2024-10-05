package task11;

public class RobotChef implements Robot{

    private String model;
    private int powerConsumption;
    private String countryOfOrigin;
    private String cookingDevice;
    private boolean isOn;

    public RobotChef(){
    }

    public RobotChef(String model, int powerConsumption, String countryOfOrigin, String cookingDevice) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.countryOfOrigin = countryOfOrigin;
        this.cookingDevice = cookingDevice;
    }

    @Override
    public void createRobot() {
        System.out.println("Creating a robot chef: " + model);
    }

    @Override
    public void repairRobot() {
        System.out.println("Repairing robot chef: " + model);
    }

    @Override
    public void replaceMainUnit() {
        System.out.println("Replacing main unit of robot chef: " + model);
    }

    @Override
    public void turnOn() {
        System.out.println("Robot chef " + model + " is turn on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Robot chef " + model + " is turn off");
    }

    @Override
    public String uniquePossibility() {
        return "Robot chef " + model + " can cook delicious meals.";
    }
}
