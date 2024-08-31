@FunctionalInterface
interface A {
    void show(int i);
}

public class LambdaDemo {
    public static void main(String[] args) {

        // A obj = new A() {
        // public void show(int i) {
        // System.out.println("in showw" + i);
        // }
        // };

        // A obj = (int i) -> System.out.println("in showw"); //here () is of method
        // brackets

        // as we r working with only one variable
        A obj = i -> System.out.println("in showw");
        // syntactical suger as we reducing code
        // -> is lambda
        // behind the scene compiler is doing all things mentioned above
        obj.show(5);
    }

}
