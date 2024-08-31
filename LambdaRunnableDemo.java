public class LambdaRunnableDemo {

    public static void main(String args[]) {
        Runnable obj1 = () -> {
            // Annonymou run method
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
