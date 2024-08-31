class mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("in show");
    }

    public mobile() {
        String brand = " ";
        int price = 234;
        System.out.println("in constructor");

    }

    static {
        String name = "phone";
        System.out.println("in staticblock");
    }

}

public class staticblockexample {
    public static void main(String[] args) {
        mobile obj = new mobile();
        obj.brand = "apple";
        obj.price = 12123;
        mobile.name = " samrtphone";

        mobile obj2 = new mobile();

    }
}
