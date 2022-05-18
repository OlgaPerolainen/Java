package Lab2.Ex1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition");
        System.out.println(calculator.add(10, 9));
        System.out.println(calculator.add(10.0, 9.0));
        System.out.println(calculator.add(10.0, 9));
        System.out.println(calculator.add(1000000000000000L, 9000000000000000L));
        System.out.println(calculator.add(1000000000000000L, 9));
        System.out.println(calculator.add(1000000000000000L, 9.0));
        System.out.println("Distraction");
        System.out.println(calculator.distract(10, 9));
        System.out.println(calculator.distract(1000000000000000L, 9000000000000000L));
        System.out.println(calculator.distract(10.0, 9.0));
        System.out.println(calculator.distract(10, 9.0));
        System.out.println(calculator.distract(10.0, 9));
        System.out.println(calculator.distract(1000000000000000L, 9));
        System.out.println("Multiplication");
        System.out.println(calculator.multiply(10, 9));
        System.out.println(calculator.multiply(100000000L, 900000000L));
        System.out.println(calculator.multiply(10.0, 9.0));
        System.out.println(calculator.multiply(10.0, 9));
        System.out.println(calculator.multiply(10, 9.0));
        System.out.println(calculator.multiply(1000000000000000L, 9));
        System.out.println(calculator.multiply(1000000000000000L, 9.0));
        System.out.println("Division");
        System.out.println(calculator.divide(10, 9));
        System.out.println(calculator.divide(1000000000000000L, 9000000000000000L));
        System.out.println(calculator.divide(10.0, 9.0));
        System.out.println(calculator.divide(10, 9.0));
        System.out.println(calculator.divide(10.0, 9));
        System.out.println(calculator.divide(1000000000000000L, 9.0));
        System.out.println(calculator.divide(4, 5));
        System.out.println(calculator.divide(5, 4));
        System.out.println(Math.round(calculator.divide(5, 1)));
    }
}
