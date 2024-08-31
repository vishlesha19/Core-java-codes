import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiDemo3 {
    public static <T> void main(String[] args) {

        List<Integer> nums = Arrays.asList(7, 3, 4, 6, 0);

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        // logic behind filter
        // Predicate<Integer> p = new Predicate<Integer>() {
        // public boolean test(Integer n) {
        // return n % 2 == 0;
        // }

        // };

        // after using lambda
        Predicate<Integer> p = n -> n % 2 == 0;

        // MAP
        // Function<Integer, Integer> fun = new Function<Integer, Integer>() {
        // public Integer apply(Integer n) {
        // return n * 2;
        // }

        // };

        Function<Integer, Integer> fun = n -> n * 2;

        // reduce

        // sorted
        Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();
        sortedValues.forEach(n -> System.out.println(n));

    }

}
