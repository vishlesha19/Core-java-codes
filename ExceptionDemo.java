public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 9;
        int j = 0; // will throw arithmetic error

        int arr[] = new int[5]; // 2nd exception

        String vish = null; // other

        try {
            j = 18 / i;
            // System.out.println(arr[5]);
            System.out.println(vish.length());
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("stay in ur limits");
        } catch (ArithmeticException e) {
            System.out.println("dont divide by 0");
        } catch (Exception e) {
            System.out.println("something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("byee");

    }

}
