package Lab4.Part1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int thirdNumber = scanner.nextInt();

        boolean result = false;
        if (secondNumber > firstNumber && thirdNumber > secondNumber) {
            result = true;
        }
        System.out.print("Результат: " + result);
    }
}
