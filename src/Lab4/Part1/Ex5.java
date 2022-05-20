package Lab4.Part1;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] myArray = new int[]{3, -3, 7, 4, 5, 4, 3};
        int numberToSearch = 3;
        boolean checkNumber = checkNumberIsFirstOrLast(myArray, numberToSearch);

        System.out.print("Массив: ");
        for (int ints : myArray
        ) {
            System.out.print(ints + " ");
        }
        System.out.println();
        System.out.println("Появляется ли число " + numberToSearch
                + " как первый или последний элемент массива: " + checkNumber);
    }

    public static boolean checkNumberIsFirstOrLast(int[] array, int number) {
        boolean result = false;
        if (array[0] == number || array[array.length - 1] == number) {
            result = true;
        }
        return result;
    }
}
