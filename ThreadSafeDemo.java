class Counter {
    int count;

    public synchronized void increament() {
        count++;
    }
}

public class ThreadSafeDemo {

    public static void main(String args[]) throws InterruptedException // main Thread
    {
        Counter c = new Counter(); // getting object of Counter

        Runnable obj1 = () -> {

            for (int i = 1; i <= 10000; i++) {
                c.increament();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increament();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count); // calling count variable

    }
}

/*
 * An object-level lock is associated with a specific instance of a class. When
 * a synchronized
 * instance method or block is used, the lock is acquired on the specific
 * instance of the class.
 */

/*
 * eg.
 * Thread 1 and Thread 2 will acquire the lock on the same obj1 instance and
 * thus will run the
 * instanceMethod one after another.
 * Thread 3 has a different obj2 instance, so it can execute instanceMethod
 * independently of Thread 1 and Thread 2.
 */