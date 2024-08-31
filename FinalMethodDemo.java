class Calc {
    public final void show() {
        System.out.println("in vishlesha show");
    }

    public int add(int a, int b) {
        return a + b;
    }
}

class AdvCalc extends Calc {
    // public void show()
    // {
    // System.out.println("am trynna override hehe!!!");
    // }
    // we stopped it from being overriden by using final method
}

public class FinalMethodDemo {
    public static void main(String[] args) {

    }
}
