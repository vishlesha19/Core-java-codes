interface InterfaceA {
    default void commonMethod() {
        System.out.println("InterfaceA default implementation");
    }
}

// In Java, the default keyword is used in interfaces to
// define methods with a default implementation.

interface InterfaceB {
    default void commonMethod() {
        System.out.println("InterfaceB default implementation");
    }
}

public class MultipleInheritanceInterface implements InterfaceA, InterfaceB {
    @Override
    public void commonMethod() {
        // Option 1: Provide own implementation
        System.out.println("MyClass implementation");

        // Option 2: Specify which default implementation to use
        InterfaceA.super.commonMethod(); // or InterfaceB.super.commonMethod();
    }

    public static void main(String[] args) {
        MultipleInheritanceInterface obj = new MultipleInheritanceInterface();
        obj.commonMethod(); // Outputs: MyClass implementation
    }
}
// output:
// MyClass implementation
// InterfaceA default implementation