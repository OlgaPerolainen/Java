package Lab6.Ex3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(20, "Truck", 'R', 190, 12, 168.5);
        truck.outPut();
        truck.newWheels(16);
    }
}
