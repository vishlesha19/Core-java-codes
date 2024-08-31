class Counter {
    private int count = 0;

    // Method to increment count with synchronization
    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

class Worker extends Thread {
    private Counter counter;

    public Worker(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizedThreadBlock {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Worker thread1 = new Worker(counter);
        Worker thread2 = new Worker(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
