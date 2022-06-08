package Lab11.Ex1;

public class TenThreads {
    public static void openTenTreads() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int number = 0; number < 101; number++) {
                    System.out.println(number);
                }
            }).start();
        }
    }
}