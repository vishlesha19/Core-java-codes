class mobile {
    // instance variables
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " " + price + " " + name);

    }

}

public class staticexample {
    public static void main(String[] args) {
        mobile obj = new mobile();
        obj.brand = "apple";
        obj.price = 23000;
        // static var should be called with class name
        mobile.name = "smartphone";

        mobile obj1 = new mobile();
        obj1.brand = "samsung";
        obj1.price = 23000;
        // static var should be called with class name but this is also possible
        obj1.name = "smartphone";

        // hence here we getting warning
        obj.name = "phone";
        obj.show();
        obj1.show();
    }
}
