import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bufferreader {
    public static void main(String[] args) throws Exception {

        System.out.println("enter  a num");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int n = Integer.parseInt(bf.readLine());
        System.out.println("the number is:" + n);

    }
}
