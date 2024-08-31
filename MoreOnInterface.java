//A class can implement 2 interface just it have to implement all abstract methods
interface A {
    void show();
}

interface B {
    void config();
}

class C implements A, B {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

// a interface can also extend another interface using extend keyword
interface x {
    void car();
}

interface y extends x {
    void bike();
}

class z implements y {

    public void car() {
        System.out.println("car running");
    }

    public void bike() {
        System.out.println("bike running");
    }

}

public class MoreOnInterface {
    public static void main(String[] args) {

        // no inheritance
        C obj = new C();
        obj.show();
        obj.config();

        // inheritance
        y obj1 = new z();
        obj1.bike();
        obj1.car();

    }

}
