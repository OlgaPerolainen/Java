package Lab6.Ex3;

public class Truck extends Car{
    private int wheelQuantity;
    private double maxWeight;

    public void newWheels(int newWheelQuantity){
        this.wheelQuantity = newWheelQuantity;
        System.out.println("Количество колес: " + wheelQuantity);
    }

    public Truck(){

    }

    public Truck(int weight, String model, char color, float speed, int wheelQuantity, double maxWeight){
        super(weight, model, color, speed);
        this.wheelQuantity = wheelQuantity;
        this.maxWeight = maxWeight;
    }
}
