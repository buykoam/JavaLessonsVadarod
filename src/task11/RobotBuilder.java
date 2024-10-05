package task11;

public class RobotBuilder implements RobotEngineer {
    private String model;
    private int powerConsumption;
    private String countryOfOrigin;
    private String constructionDevice;
    private String material;
    private boolean isOn;

    public RobotBuilder(String model, int powerConsumption, String countryOfOrigin, String constructionDevice, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.countryOfOrigin = countryOfOrigin;
        this.constructionDevice = constructionDevice;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void createRobot() {
        System.out.println("Creating a robot builder: " + model);
    }

    @Override
    public void repairRobot() {
        System.out.println("Repairing robot builder: " + model);
    }

    @Override
    public void replaceMainUnit() {
        System.out.println("Replacing main unit of robot builder: " + model);
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Robot builder " + model + " is switched on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Robot builder " + model + " is switched off.");
    }

    @Override
    public String uniquePossibility() {
        return "Robot builder " + model + " can construct buildings.";
    }

    @Override
    public void solveEngineeringProblem() {
        System.out.println("Robot builder " + model + " is solving a construction problem.");
    }
}
