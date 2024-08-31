class MyDaemonThread implements Runnable {

    public void run() {
        try {
            while (true) {
                System.out.println("Daemon thread is running...");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Daemon thread interrupted.");
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new MyDaemonThread());
        daemonThread.setDaemon(true); // Set the thread as a daemon thread
        daemonThread.start();

        try {
            Thread.sleep(2000); // Main thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is ending...");
    }
}
