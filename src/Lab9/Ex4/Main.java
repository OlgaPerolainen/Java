package Lab9.Ex4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем Map "пользователь: количество очков"
        Map<User, Integer> userScores = new HashMap<>();
        // Вызываем метод, который заполняет Map данными
        UserMethods.createUsersAndScores(userScores);

        // Считываем введенное имя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пользователя: ");
        String name = scanner.nextLine();

        // Вызываем метод, который выводит количество очков
        UserMethods.searchForUserScores(name, userScores);
    }
}
