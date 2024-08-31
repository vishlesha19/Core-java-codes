sealed class A permits B, C {

}

non-sealed class B extends A {

}

final class C extends A {

}

class D extends B {

}

sealed interface X permits Y {

}

sealed interface Y extends X permits Z {

}

non-sealed interface Z extends Y {

}

public class SealedclassDemo {
    public static void main(String[] args) {

    }

}
