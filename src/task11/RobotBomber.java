package task11;

public class RobotBomber implements RobotEngineer{
    private String model;
    private int powerConsumption;
    private String chassisNumber;
    private String material;
    private boolean isOn;

    public RobotBomber(){
    }

    public RobotBomber(String model, int powerConsumption, String chassisNumber, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.chassisNumber = chassisNumber;
        this.material = material;
    }

    @Override
    public void createRobot() {
        System.out.println("Creating a robot bomber: " + model);
    }

    @Override
    public void repairRobot() {
        System.out.println("Repairing robot bomber: " + model);
    }

    @Override
    public void replaceMainUnit() {
        System.out.println("Replacing main unit of robot bomber: " + model);
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Robot bomber " + model + " is switched on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Robot bomber " + model + " is switched off.");
    }

    @Override
    public String uniquePossibility() {
        return "Robot bomber " + model + " can disarm explosives.";
    }

    @Override
    public void solveEngineeringProblem() {
        System.out.println("Robot bomber " + model + " is solving an engineering problem related to explosives.");
    }
}
