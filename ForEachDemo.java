import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) //
    {

        List<Integer> nums = Arrays.asList(5, 3, 7, 8, 9, 6, 4);

        // by using lambda
        Consumer<Integer> con = n -> System.out.println(n);

        // intead of con we can directly use expression
        // nums.forEach(con); here
        nums.forEach(n -> System.out.println(n));

        // without using lambda
        // Consumer<Integer> con = new Consumer<Integer>() {
        // public void accept(Integer n) {
        // System.out.println(n);
        // }

        // };

    }

}
