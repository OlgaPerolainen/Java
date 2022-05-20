package Lab4.Part2;

public class Ex1 {
    public static void main(String[] args) {
        int[] myArray = new int[]{-1, -2, 2, 3, 4, 5, 6, 7};
        if (checkIsArraySortedAsc(myArray)) {
            System.out.println("Ok");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static boolean checkIsArraySortedAsc(int[] array) {
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
