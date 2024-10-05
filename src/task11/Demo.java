package task11;

public class Demo {
    public static void main(String[] args) {
        RobotChef chef = new RobotChef("ChefBot", 500, "Germany", "Oven");
        RobotBomber bomber = new RobotBomber("BomberBot", 600, "Chassis#123", "Material#155");
        RobotBuilder builder = new RobotBuilder("BuilderBot", 750, "USA", "Excavator", "Concrete");

        // Первая выставка - все виды роботов
        Robot[] allRobots = {chef, bomber, builder};
        Exhibition allRobotsExhibition = new Exhibition("All Robots Exhibition", allRobots);
        allRobotsExhibition.showUniquePossibilities();

        // Вторая выставка - только для инженерных роботов
        Robot[] engineeringRobots = {bomber, builder};
        Exhibition engineeringExhibition = new Exhibition("Engineering Robots Exhibition", engineeringRobots);
        engineeringExhibition.showUniquePossibilities();

        // Третья выставка - для роботов сапёров
        Robot[] bomberRobots = {bomber};
        Exhibition bomberExhibition = new Exhibition("Bomber Robots Exhibition", bomberRobots);
        bomberExhibition.showUniquePossibilities();
    }
}
