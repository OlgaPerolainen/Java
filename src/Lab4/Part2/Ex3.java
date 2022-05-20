package Lab4.Part2;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] myArray = new int[]{5, 6, 7, 2};
        System.out.println("Array 1:" + Arrays.toString(myArray));
        swapFirstLastElem(myArray);
        System.out.println("Array 2:" + Arrays.toString(myArray));
    }

    public static int[] swapFirstLastElem(int[] array) {
        int firstElem = array[0];
        int lastElem = array[array.length - 1];
        array[0] = lastElem;
        array[array.length - 1] = firstElem;
        return array;
    }
}
