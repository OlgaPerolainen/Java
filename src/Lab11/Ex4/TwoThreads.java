package Lab11.Ex4;

public class TwoThreads {
    public static void startTwoThreads() {
        Thread firstThread = new ThreadShowingName("thread1");
        Thread secondThread = new ThreadShowingName("thread2");

        firstThread.start();
        secondThread.start();
    }
}
