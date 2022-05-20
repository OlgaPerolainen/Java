package Lab4.Part2;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(myArray));
        int[] mergedArray = mergeSort(myArray);
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = arr[mid + j];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] mergedSortedArray = new int[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int mergedPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    mergedSortedArray[mergedPointer++] = left[leftPointer++];
                } else {
                    mergedSortedArray[mergedPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                mergedSortedArray[mergedPointer++] = left[leftPointer++];
            } else {
                mergedSortedArray[mergedPointer++] = right[rightPointer++];
            }
        }
        return mergedSortedArray;
    }
}
