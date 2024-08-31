class mobile {
    // instance variables
    String brand;
    int price;
    static String name;

    // nonstatice method
    public void show() {
        System.out.println(brand + " " + price + " " + name);

    }

    // static method
    public static void show2() {
        // System.out.println(brand + " " + price + " " + name);
        // we cannot use non static variable in static method

        System.out.println(name); // only static variable can be used
    }

    // static method
    public static void show3(mobile obj1) // we passing obj1 here
    {
        // indirect way of reffering nonstatic var in static method
        System.out.println(obj1.brand + " " + obj1.price + " " + name);

    }

}

public class staticmethodexample {
    public static void main(String[] args) {
        // for every nonstatic method we have to create object for it
        mobile obj = new mobile();
        obj.brand = "apple";
        obj.price = 23000;
        // static var should be called with class name
        mobile.name = "smartphone";

        mobile obj1 = new mobile();
        obj1.brand = "samsung";
        obj1.price = 23000;
        // static var should be called with class name
        mobile.name = "smartphone";

        // hence here we getting warning
        obj.name = "phone";
        obj.show();
        obj1.show();

        // but for static methods we can directly call them
        mobile.show2();
        mobile.show3(obj1);
    }
}

/*
 * Static initialization blocks are used to initialize static variables.
 * These blocks are executed when the class is loaded, allowing you to perform
 * complex initialization tasks.
 */