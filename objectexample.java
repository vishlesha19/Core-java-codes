class calculator {

    public int add(int a, int b) {
        int r = a + b;
        return r;

    }

}

public class objectexample {
    public static void main(String[] args) {
        calculator calc = new calculator();
        int result = calc.add(3, 5);
        System.out.println(result);

    }

}
