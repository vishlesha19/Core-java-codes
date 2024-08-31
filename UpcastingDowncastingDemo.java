class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show1() {
        System.out.println("in B show");
    }
}

public class UpcastingDowncastingDemo {
    public static void main(String[] args) {

        // UpCasting
        A obj = (A) new B();
        obj.show();

        // DownCasting
        B obj1 = (B) obj;
        obj1.show1();

        // TypeCasting
        Double d = 4.5;
        // int a = (int) d;

    }
}
