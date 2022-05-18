package Lab3.Ex2;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("black", 1.6);
        bmw.setName("X1");

        Car toyota = new Car("blue");
        toyota.setName("Rav4");
        toyota.setWeight(1.7);

        System.out.println(bmw.printInfo());
        System.out.println(toyota.printInfo());
    }
}
