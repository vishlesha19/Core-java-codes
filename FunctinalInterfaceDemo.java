@FunctionalInterface
// annotation makes sure interface can have only one method
interface A {
    void show(); // methods of interface r by default abstrat
}

public class FunctinalInterfaceDemo {
    public static void main(String[] args) {
        // not possible as we cant instantiate the interface
        // A obj = new A();
        // one way of doing this is implementing interface A in class b and then define
        // show there

        // another way is annonymous in class
        // instatiating own implementation of A and defining
        // abstract show method
        A obj = new A() {
            public void show() {
                System.out.println("in showwww");
            }
        };

    }

}