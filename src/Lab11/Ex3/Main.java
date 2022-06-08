package Lab11.Ex3;

public class Main {
    public static void main(String[] args) {
        HundredThreads.openHundredTreads();

        System.out.println(Counter.getCount());
        System.out.println(Counter.getCount());
        System.out.println(Counter.getCount());
        System.out.println(Counter.getCount());
    }
}
