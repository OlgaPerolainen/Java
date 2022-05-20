package Lab4.Part2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        int arrayLength = scanner.nextInt();
        int[] userArray = new int[arrayLength];

        System.out.println("Enter numbers of array: ");
        for (int i = 0; i < arrayLength; i++){
            userArray[i] = scanner.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(userArray));
    }
}
