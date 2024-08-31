import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinallyResource {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = 0;
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(bf.readLine());
            System.out.println(n);
        } finally {
            bf.close();
            System.out.println("closse o gaya");
        }

        // orrrrrrr
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);

        }

    }

}
