// Class with members having different access specifiers
class MyClass {
    public int publicVar; // Accessible from anywhere
    private int privateVar; // Accessible only within MyClass
    protected int protectedVar; // Accessible within the package and subclasses
    int defaultVar; // Accessible only within the package (default access)

    // Public method
    public void setPrivateVar(int value) {
        privateVar = value;
    }

    // Public method to access privateVar
    public int getPrivateVar() {
        return privateVar;
    }
}

// Another class to demonstrate access specifiers
public class AccessSpecifierExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Accessing public variable
        obj.publicVar = 10;
        System.out.println("Public Variable: " + obj.publicVar);

        // Accessing private variable (not directly accessible)
        // obj.privateVar = 20; // This would cause a compile-time error
        obj.setPrivateVar(20); // Accessing private variable through public method
        System.out.println("Private Variable: " + obj.getPrivateVar());

        // Accessing protected variable
        obj.protectedVar = 30;
        System.out.println("Protected Variable: " + obj.protectedVar);

        // Accessing default variable
        obj.defaultVar = 40;
        System.out.println("Default Variable: " + obj.defaultVar);
    }
}
// output
// Public Variable: 10
// Private Variable: 20
// Protected Variable: 30
// Default Variable: 40