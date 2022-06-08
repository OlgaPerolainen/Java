package Lab11.Ex2;

public class NewThread extends Thread {
    Thread thread;

    public NewThread() {
        thread = new Thread(this);
    }

    public static void startNewThread() {
        Thread thread = new Thread(new NewThread());

        // Thread is created (NEW)
        System.out.println(thread.getState());

        thread.start();

        // Thread is running (RUNNABLE)
        System.out.println(thread.getState());

        // Thread will be terminated
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Thread is terminated (TERMINATED)
        System.out.println(thread.getState());
    }

    @Override
    public void run() {
        System.out.println("This is a thread");
    }
}
