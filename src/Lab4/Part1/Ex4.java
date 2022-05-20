package Lab4.Part1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstAnswer = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondAnswer = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int thirdAnswer = scanner.nextInt();

        boolean equals = checkBigger(firstAnswer, secondAnswer, thirdAnswer);
        System.out.print("Результат: " + equals);

    }

    public static boolean checkBigger(int firstNumber, int secondNumber, int thirdNumber) {
        boolean result = false;
        if (secondNumber > firstNumber && thirdNumber > secondNumber) {
            result = true;
        }
        return result;
    }
}
