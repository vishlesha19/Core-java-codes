public class RightTriangleStarPattern {

    public static void main(String[] args) {

        System.out.println("right angle trianle");

        int num = 4;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("reverse right angle trianle");
        for (int a = 1; a <= 4; a++) {
            for (int b = 4; b >= a; b--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
