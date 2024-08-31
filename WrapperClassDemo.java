public class WrapperClassDemo {
    public static void main(String[] args) {

        int num = 7; // primitive variable
        // Integer num1 = new Integer(8); //reference variable
        Integer num1 = num;// alternative way
        System.out.println(num1);

        // boxing
        int a = 20;
        Integer a1 = new Integer(a);
        System.out.println(a1);

        // autoboxing
        int b = 30;
        Integer b1 = b;
        System.out.println(b1);

        // unboxing
        int c = b1.intValue();
        System.out.println(c);

        // autounboxing
        int d = b1;
        System.out.println(d);

        // wrapperclass
        String str = "12";
        int num2 = Integer.parseInt(str);
        System.out.println(num2 * 8);

    }

}