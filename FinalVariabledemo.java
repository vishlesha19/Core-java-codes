public class FinalVariabledemo {
    public static void main(String[] args) {
        {
            final int num = 100;
            final double pi = 7.14;

            // num = 8; will give error

            System.out.println("num");
        }
    }

}
