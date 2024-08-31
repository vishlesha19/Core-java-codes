class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class AnnonymousInnerClass {
    public static void main(String[] args) { // Annonymous class
        A obj = new A() {
            public void show() {
                System.out.println("in NEW show");
            }

        };

        obj.show();

    }

}
