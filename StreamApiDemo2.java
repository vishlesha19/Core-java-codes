import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // using stream
        Stream<Integer> s1 = nums.stream();
        // s1.forEach(n -> System.out.println(n));

        System.out.println("using filter");
        // using filter
        // Stream<Integer> s2 = s1.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // str1.forEach(n -> System.out.println(n));
        // coz cant reuse stream

        System.out.println("doubling the value");
        Stream<Integer> s3 = s2.map(n -> n * 2);
        // str2.forEach(n -> System.out.println(n));

        int result = s3.reduce(0, (c, e) -> c + e);
        System.out.println(result);

        // using stream in one line
        int res = nums.stream() // will give stream of values
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        // using basic logic to filter out even nos then get their
        // double and finally get their addition
        int sum = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                i = i * 2;
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

}
