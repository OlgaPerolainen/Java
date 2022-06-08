package Lab11.Ex4;

public class ThreadShowingName extends Thread {
    Thread thread;
    private final static Object lock = new Object();
    private static int threadsAmount;
    private static int currentThreadId;
    private final int threadId;

    public ThreadShowingName(String name) {
        thread = new Thread(this, name);
        threadId = threadsAmount++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (lock) {
                while (currentThreadId != threadId) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(this.thread.getName());

                if (threadId == threadsAmount - 1) {
                    currentThreadId = 0;
                } else {
                    currentThreadId = threadId + 1;
                }
                lock.notify();
            }
        }
    }
}
