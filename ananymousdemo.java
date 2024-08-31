class A {
    // constructor
    public A() {
        System.out.println("object created");
    }

    // method
    public void show() {
        System.out.println("in show");
    }
}

public class ananymousdemo {
    public static void main(String[] args) {

        new A(); // ananymous object

        new A().show(); // calling method with ananymous object

        // A obj = new A(); here we assign object to ref vsr obj.
    }
}
