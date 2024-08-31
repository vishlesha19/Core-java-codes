/*
 * This code demonstrates inter-thread communication 
 * using the wait() and notify() methods in Java. 
 * It involves a producer-consumer scenario where 
 * the producer thread puts a number into a shared 
 * resource (Q class), and the consumer thread gets 
 * the number from the shared resource. The Q class 
 * manages synchronization to ensure that the producer 
 * and consumer operate correctly.
*/
class Q {
    int num;
    boolean valuset = false;

    // set value
    public synchronized void put(int num) {
        while (valuset) // true condition
        {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("put: " + num);
        this.num = num;
        valuset = true;
        notify(); // notifies consumer thread

    }

    // get value

    public synchronized void get() {
        while (!valuset) // false condition i.e if it is not set then wait
        {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("get: " + num);
        valuset = false;
        notify(); // wake up producer thread

    }

}

class Producer implements Runnable {

    Q q;

    // constructor
    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) // infinite loop
        {
            q.put(i++);
            try {
                Thread.sleep(1000); // 1 second sleep
            } catch (Exception e) {
            }
        }
    }

}

class Consumer implements Runnable {
    Q q;

    // constructor
    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}

public class InterThreadComunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }

}

/*
 * The shared instance q is passed to Producer and Consumer to allow both to
 * operate on the same data. The reference variable q in each class is necessary
 * to store this instance so that it can be used within the run method. This
 * ensures both threads are synchronizing on the same object.
 * 
 */

/*
 * Step-by-Step Explanation
 * Class Q:
 * 
 * This class represents the shared resource where the producer will put
 * numbers, and the consumer will get numbers.
 * java
 * Copy code
 * class Q {
 * int num;
 * boolean valueSet = false;
 * 
 * // set value
 * public synchronized void put(int num) {
 * while (valueSet) { // true condition
 * try {
 * wait();
 * } catch (Exception e) {
 * }
 * }
 * System.out.println("put: " + num);
 * this.num = num;
 * valueSet = true;
 * notify(); // notifies consumer thread
 * }
 * 
 * // get value
 * public synchronized void get() {
 * while (!valueSet) { // false condition i.e if it is not set then wait
 * try {
 * wait();
 * } catch (Exception e) {
 * }
 * }
 * System.out.println("get: " + num);
 * valueSet = false;
 * notify(); // notifies producer thread
 * }
 * }
 * Fields:
 * 
 * int num: The shared resource (a number).
 * boolean valueSet: A flag indicating if a value has been set by the producer
 * and not yet consumed.
 * Methods:
 * 
 * put(int num): Synchronized method used by the producer to put a number into
 * the shared resource.
 * If valueSet is true (indicating a value is already set and not yet consumed),
 * the producer thread waits.
 * When the producer can put the number, it sets num to the new number, sets
 * valueSet to true, and calls notify() to wake up the consumer thread.
 * get(): Synchronized method used by the consumer to get the number from the
 * shared resource.
 * If valueSet is false (indicating no value has been set), the consumer thread
 * waits.
 * When the consumer can get the number, it prints the number, sets valueSet to
 * false, and calls notify() to wake up the producer thread.
 * Class Producer:
 * 
 * Represents the producer thread that puts numbers into the shared resource.
 * java
 * Copy code
 * class Producer implements Runnable {
 * Q q;
 * 
 * // constructor
 * public Producer(Q q) {
 * this.q = q;
 * Thread t = new Thread(this, "Producer");
 * t.start();
 * }
 * 
 * public void run() {
 * int i = 0;
 * while (true) {
 * q.put(i++);
 * try {
 * Thread.sleep(1000);
 * } catch (Exception e) {
 * }
 * }
 * }
 * }
 * Constructor:
 * Takes an instance of Q and starts the producer thread.
 * run() Method:
 * Continuously puts numbers (incrementing i) into the shared resource, with a
 * 1-second sleep between each put operation.
 * Class Consumer:
 * 
 * Represents the consumer thread that gets numbers from the shared resource.
 * java
 * Copy code
 * class Consumer implements Runnable {
 * Q q;
 * 
 * // constructor
 * public Consumer(Q q) {
 * this.q = q;
 * Thread t = new Thread(this, "Consumer");
 * t.start();
 * }
 * 
 * public void run() {
 * while (true) {
 * q.get();
 * try {
 * Thread.sleep(1000);
 * } catch (Exception e) {
 * }
 * }
 * }
 * }
 * Constructor:
 * Takes an instance of Q and starts the consumer thread.
 * run() Method:
 * Continuously gets numbers from the shared resource, with a 1-second sleep
 * between each get operation.
 * Main Class (InterThreadComunication):
 * 
 * The entry point of the program.
 * java
 * Copy code
 * public class InterThreadComunication {
 * public static void main(String[] args) {
 * Q q = new Q();
 * new Producer(q);
 * new Consumer(q);
 * }
 * }
 * main() Method:
 * Creates an instance of Q.
 * Starts a producer thread and a consumer thread with the shared Q instance.
 * Execution Flow
 * The main() method creates an instance of Q and starts both the producer and
 * consumer threads.
 * The producer thread starts putting numbers into the shared resource:
 * It checks if a value has already been set (valueSet).
 * If valueSet is true, the producer waits.
 * If valueSet is false, the producer puts the number, sets valueSet to true,
 * and notifies the consumer.
 * The consumer thread starts getting numbers from the shared resource:
 * It checks if a value has been set (valueSet).
 * If valueSet is false, the consumer waits.
 * If valueSet is true, the consumer gets the number, sets valueSet to false,
 * and notifies the producer.
 * This process continues indefinitely, with the producer and consumer
 * coordinating through wait() and notify() to ensure proper synchronization.
 */