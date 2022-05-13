package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        // Exercise 2
        double result = (46 + 10) * ((double)10 / 3);
        System.out.println(result);

        int result2 = 29 * 4 * (-15);
        System.out.println(result2);

        // Exercise 3
        double number = 10500;
        double result3 = (number / 10.0) / 10;
        System.out.println(result3);

        // Exercise 4
        double first = 3.6;
        double second = 4.1;
        double third = 5.9;
        double multiply = first * second * third;
        System.out.println(multiply);

        // Exercise 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int firstNumberEntry = scanner.nextInt();
        int secondNumberEntry = scanner.nextInt();
        int thirdNumberEntry = scanner.nextInt();
        System.out.println(firstNumberEntry + "\n" + secondNumberEntry + "\n" + thirdNumberEntry);

        // Exercise 6
        System.out.println("Введите число:");
        int b = scanner.nextInt();

        if ((b % 2 == 0) && (b > 100)) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 != 0){
            System.out.println("Нечетное");
        } else{
            System.out.println("Четное");
        }
    }
}
