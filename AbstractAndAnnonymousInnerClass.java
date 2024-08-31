abstract class A {
    public abstract void show();

    public abstract void config();
}

public class AbstractAndAnnonymousInnerClass {
    public static void main(String[] args) {
        // abstract and annonymous inner class
        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in new config");
            }
        };

        obj.config();
        obj.show();
    }

}
