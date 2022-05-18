package Lab3.Ex2;

public class Car {
    private String color;
    private String name;
    private double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Car(){}

    public Car(String color){
        this.color = color;
    }
    public Car(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public String printInfo() {
        return "Car:" + "\n" +
                "Color: " + color + "\n" +
                "Name: '" + name + '\'' + "\n" +
                "Weight: " + weight
                ;
    }
}
