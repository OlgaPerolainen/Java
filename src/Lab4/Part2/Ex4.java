package Lab4.Part2;

public class Ex4 {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 1, 2, 4};

        int firstUniqueNumber = findFirstUniqueNumber(myArray);
        System.out.println("First unique number: " + firstUniqueNumber);
    }

    public static int findFirstUniqueNumber(int[] array) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                number = array[i];
                break;
            }
        }
        return number;
    }
}
