interface Computer {
    void code();
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run: faster");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Developer {
    public void devApp(Computer comp) {
        comp.code();
    }
}

public class NeedInterface {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer vishlesha = new Developer();
        vishlesha.devApp(desk); // loose coupling

    }

}
