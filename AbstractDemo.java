abstract class Car // abstract class
{
    public abstract void drive(); // abstract methods

    public abstract void airBgs(); // abstract methods

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class Maruti extends Car {
    public void drive() {
        System.out.println("driving car");
    }
}

class WagonR extends Maruti // concrete class
{
    public void airBgs() {
        System.out.println("airbags are provided");
    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        // dynamic method dispatch
        Car obj = new WagonR(); // object can be of concrete class only
        obj.drive();
        obj.playMusic();
        obj.airBgs();

    }
}
// output
// driving car
// play music
// airbags are provided