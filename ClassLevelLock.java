class Counter {
    static int count; // Static variable for class-level lock demonstration

    public void increment() {
        synchronized (Counter.class) { // Class-level lock
            count++;
        }
    }
}

public class ClassLevelLock {

    public static void main(String args[]) throws InterruptedException {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c1.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c2.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count from c1: " + c1.count); // Should print 10000
        System.out.println("Count from c2: " + c2.count); // Should print 10000
        System.out.println("Total count: " + Counter.count); // Should print 20000 (sum of c1.count + c2.count)
    }
}

/*
 * Explanation:
 * Counter Class:
 * 
 * count is a static variable, demonstrating class-level state.
 * increment() method is modified to use a synchronized block with Counter.class
 * as the lock object.
 * This ensures that only
 * one thread can execute the increment() method at a time across all instances
 * of Counter.
 * ClassLevelLock Class:
 * 
 * main() method creates two instances of Counter, c1 and c2.
 * Two Runnable instances (obj1 and obj2) are created using lambda expressions.
 * Each Runnable instance increments its
 * respective Counter instance (c1 or c2) in a loop 10,000 times.
 * Threads and Execution:
 * 
 * Thread t1 and Thread t2 are created with obj1 and obj2, respectively, and
 * started.
 * The main thread (main()) waits for t1 and t2 to complete using t1.join() and
 * t2.join().
 * After both threads complete, it prints the values of c1.count and c2.count,
 * which should both be 10,000 since
 * each thread increments its respective counter 10,000 times.
 * It also prints the Counter.count, which should be the sum of c1.count and
 * c2.count, demonstrating that Counter.
 * count maintains state across all instances.
 * This example effectively demonstrates class-level locking using a static
 * variable (count) and synchronized block
 * with Counter.class as the lock object, ensuring thread-safe access to shared
 * resources at the class level.
 */