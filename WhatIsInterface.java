interface A {
    // variables are final and static by default
    int age = 21;
    String name = "Ritvi";

    // methods are public and abstract by default
    void show();

    void config();
}

class B implements A {

    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("in config");
    }

}

public class WhatIsInterface {

    public static void main(String[] args) {

        A obj = new B();
        obj.config();
        obj.show();

        System.out.println(A.name); // possible coz static variable

        // A.age = 20; not possible as variable are final
    }

}
