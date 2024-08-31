enum Laptop {

    // objects of type Laptop
    Macbook(2000), xps, surface(12000), thinkpad(15000);

    // instance variable should be private
    private int price;

    // our default constructor
    private Laptop() {
        price = 500; // assigned a default value
    }

    // parameterrized constructor
    private Laptop(int price) {
        this.price = price;
        System.out.println("in laptop" + this.name());
    }

    // to access private variable we generated getter setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String[] args) {

        Laptop lap = Laptop.Macbook;
        System.out.println(lap + ":" + lap.getPrice());

        // to change value
        Laptop lappy = Laptop.surface;
        lappy.setPrice(6000);

        // to fetch all values
        for (Laptop lp : Laptop.values()) {
            System.out.println(lp + ":" + lp.getPrice());
        }

    }

}
