package task11;

public class Exhibition {
    private String name;
    private Robot[] robots;

    public Exhibition(String name, Robot[] robots) {
        this.name = name;
        this.robots = robots;
    }
    public void showUniquePossibilities() {
        System.out.println("Exhibition: " + name);
        for (Robot robot : robots) {
            System.out.println(robot.uniquePossibility());
        }
        System.out.println();
    }

}
