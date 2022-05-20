package Lab4.Part1;

public class Ex6 {
    public static void main(String[] args) {
        int[] myArray = new int[]{-3, 7, 1, 4, 3, 5, 4};
        int firstNumberToSearch = 1;
        int secondNumberToSearch = 3;
        boolean checkNumbers = checkNumberInArray(myArray, firstNumberToSearch, secondNumberToSearch);

        System.out.print("Массив: ");
        for (int ints : myArray
        ) {
            System.out.print(ints + " ");
        }
        System.out.println();
        System.out.println("Содержит ли массив число  " + firstNumberToSearch
                + " или число " + secondNumberToSearch + ": " + checkNumbers);
    }

    public static boolean checkNumberInArray(int[] array, int firstNumber, int secondNumber) {
        boolean result = false;
        for (int ints : array
        ) {
            if (ints == firstNumber || ints == secondNumber) {
                result = true;
            }
        }
        return result;
    }
}
