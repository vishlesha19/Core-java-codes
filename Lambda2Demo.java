@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class Lambda2Demo {
    public static void main(String[] args) {
        // A obj = new A() {
        // public int add(int i, int j)
        // {
        // return i+j;
        // }
        // };

        A obj = (i, j) -> i + j; // i+j; automatically becomes returntype
        int result = obj.add(9, 10);
        System.out.println(result);

    }

}
