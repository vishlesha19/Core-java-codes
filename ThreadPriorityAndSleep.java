 class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("hi");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("hello");
    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj2.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // System.out.println(obj1.getPriority()); // get 5 default one

        // obj2.setPriority(10);
        // System.out.println(obj2.getPriority()); // now get 10

        // obj1.setPriority(Thread.MAX_PRIORITY); // ata 10 honar
        // System.out.println(obj1.getPriority());

    }

}
