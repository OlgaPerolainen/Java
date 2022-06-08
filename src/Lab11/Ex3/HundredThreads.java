package Lab11.Ex3;

public class HundredThreads {
    public static void openHundredTreads() {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int number = 0; number < 1000; number++) {
                    Counter.increment();
                }
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
