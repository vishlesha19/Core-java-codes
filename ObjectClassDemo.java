class Laptop {
    String model;
    int price;

    // system generated
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // system generated
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    // // OUR toString() method
    // public String toString() {
    // return "heyyy!";
    // }

    // // our equals method
    // public boolean equals(Laptop that) // that means object to compare
    // {
    // if (this.model.equals(that.model) && this.price == that.price) {
    // return true;
    // }

    // else {
    // return false;
    // }
    // }

}
//

public class ObjectClassDemo {
    public static void main(String[] args) {

        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 11000;

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 11000;

        System.out.println(obj.toString());

        boolean result = obj.equals(obj1);
        System.out.println(result);

    }
}
