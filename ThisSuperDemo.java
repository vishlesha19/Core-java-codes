class A extends Object {

    public A() {
        // super();
        System.out.println("in A");

    }

    public A(int n) {
        // super();
        System.out.println("in A int");
    }
}

class B extends A {

    public B() {
        // super(n);
        System.out.println("in B");

    }

    public B(int n) {
        // this();
        System.out.println("in B int");
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {

        B obj = new B(5);

    }

}
