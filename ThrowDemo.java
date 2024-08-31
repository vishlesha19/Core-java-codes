public class ThrowDemo {
    public static void main(String args[]) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("i dont wanna print zero");
        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("default output " + e);
        } catch (Exception e) {
            System.out.println("something went w rong " + e);
        }

        System.out.println(j);
    }
}
