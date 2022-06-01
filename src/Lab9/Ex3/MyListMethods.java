package Lab9.Ex3;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyListMethods {
    public static void addOneMillionElements(ArrayList<Integer> sourceArrayList) {
        for (int i = 0; i < 1000000; i++) {
            sourceArrayList.add((int) (Math.random() * 1000000));
        }
    }

    public static void addOneMillionElements(LinkedList<Integer> sourceArrayList) {
        for (int i = 0; i < 1000000; i++) {
            sourceArrayList.add((int) (Math.random() * 1000000));
        }
    }

    public static void chooseElementTenThsndTimes(ArrayList<Integer> sourceArrayList) {
        for (int i = 0; i < 10000; i++) {
            sourceArrayList.get((int) (Math.random() * sourceArrayList.size()));
        }
    }

    public static void chooseElementTenThsndTimes(LinkedList<Integer> sourceArrayList) {
        for (int i = 0; i < 10000; i++) {
            sourceArrayList.get((int) (Math.random() * sourceArrayList.size()));
        }
    }
}
