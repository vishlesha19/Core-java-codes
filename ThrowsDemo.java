class A {
    public void show() throws ClassNotFoundException {
        Class.forName("hehe");
    }
}

public class ThrowsDemo {
    static {
        System.out.println("just for check");
    }

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Please enter valid class" + e);
        }
    }
}
