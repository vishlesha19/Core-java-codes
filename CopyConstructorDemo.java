//example of deep copy

class Car {
    public String carName;

    // parameterize constructor
    public Car(String carName) {
        this.carName = carName;
    }

    // copy constructor
    public Car(Car c) {
        this.carName = c.carName; // ithe apan new object mdhe olde object chya carname la copy kelay

    }

}

public class CopyConstructorDemo {
    public static void main(String[] args) {

        Car obj = new Car("maruti");
        System.out.println("name of 1st object: " + obj.carName);

        Car obj1 = new Car(obj);
        System.out.println("name of 2nd object: " + obj1.carName);
    }
}
