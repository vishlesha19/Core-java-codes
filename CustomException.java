class VishleshaException extends Exception {
    public VishleshaException(String string)
    // constructor
    {
        super(string);
    }
}

public class CustomException {
    public static void main(String args[]) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;

            if (j == 0)
                throw new VishleshaException("i dont want to print 0");
        }

        catch (VishleshaException e) {
            j = 18 / 1;
            System.out.println("this is default excetion " + e);
        } catch (Exception e) {
            System.out.println("something wrong " + e);
        }

        System.out.println(j);
    }

}
