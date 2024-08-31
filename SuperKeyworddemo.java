class A {
    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in A config");
    }
}

class B extends A {
    public void show() {
        super.show(); // Calls show() method of class A
        System.out.println("in B show");
    }
}

public class SuperKeyworddemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // Calls show() method of class B, which in turn calls show() of class A
        obj.config(); // Calls config() method of class A
    }
}

// output
// in A show
// in B show
// in A config
