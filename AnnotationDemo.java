class A {
    public void showTheDataWhichBelongsToThisClassokay() {
        System.out.println("in A show");
    }

}

class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClassokay() {
        System.out.println("in B show");
    }

}

public class AnnotationDemo {

    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClassokay();
    }

}
