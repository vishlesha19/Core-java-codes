class example {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b) {
        return a + b;
    }

    public void vishlesha(String name, int age) {
        System.out.println("name is :" + name + "age is: " + age);
    }

    public void vishlesha(int age, String name) {
        System.out.println("new name is  : " + name + "age is: " + age);
    }
}

public class methodoveloadingexample {
    public static void main(String[] args) {
        example ex = new example();
        double result = ex.add(2.0, 3);
        System.out.println(result);

        ex.vishlesha("vishlesha", 22);
        System.out.println(ex instanceof example);
    }
}
