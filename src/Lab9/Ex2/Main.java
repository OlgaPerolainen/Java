package Lab9.Ex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "world", "Java", "world", "Hello", "hello"};
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Sets.minusDoubles(stringArray));

        Integer[] integerArray = {1, 2, 3, 4, 3, 5, 4, 6, 2};
        System.out.println(Arrays.toString(integerArray));
        System.out.println(Sets.minusDoubles(integerArray));

        Double[] doubleArray = {1.2, 2.3, 3.5, 4.95, 3.5, 5.3, 4.1, 6.7, 2.3};
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Sets.minusDoubles(doubleArray));
    }
}
