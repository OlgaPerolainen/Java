package Lab9.Ex3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        MyListMethods.addOneMillionElements(integerArrayList);
        long time = System.nanoTime();
        MyListMethods.chooseElementTenThsndTimes(integerArrayList);
        System.out.println("Выполнение метода с ArrayList заняло в секундах: " + (System.nanoTime() - time) / 1000000000.0);

        System.out.println("------------------------------------");
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        MyListMethods.addOneMillionElements(integerLinkedList);
        long time2 = System.nanoTime();
        MyListMethods.chooseElementTenThsndTimes(integerLinkedList);
        System.out.println("Выполнение метода с LinkedList заняло в секундах: " + (System.nanoTime() - time2) / 1000000000.0);
    }
}
