import java.util.Scanner;

public class scannerexample {
    public static void main(String[] args) throws Exception {

        System.out.println("enter a value:");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("value is :" + num);

    }

}
