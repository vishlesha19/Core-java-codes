final class Calc {
    public void show() {
        System.out.println("in vishlesha show");
    }

    public int add(int a, int b) {
        return a + b;
    }
}

// class AdvCalc extends Calc
// {

// } not possible as Calc is final class

public class FinalClassDemo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        int result = obj.add(6, 7);
        System.out.println(result);
    }
}
