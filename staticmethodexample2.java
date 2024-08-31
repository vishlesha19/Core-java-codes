/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class demo {
    public static int pagecount(int a, int b) {
        int x = a * b;
        return x;
    }
}

class staticmethodexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = demo.pagecount(a, b);
            System.out.println(x);
        }

    }
}
