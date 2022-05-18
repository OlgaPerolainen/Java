package Lab3.Ex3;

public class Main {
    public static void main(String[] args) {
        Building firstBuilding = new Building();
        firstBuilding.createBuilding(8, 2007, "Great Palace");

        Building secondBuilding = new Building();
        secondBuilding.createBuilding(10, 2000, "Horizon");

        System.out.println(firstBuilding.buildingInfo());
        System.out.println("Years passed: " + firstBuilding.yearsPassed());
        System.out.println(secondBuilding.buildingInfo());
        System.out.println("Years passed: " + secondBuilding.yearsPassed());
    }
}
