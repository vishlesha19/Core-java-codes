import java.util.Arrays;
import java.util.List;

public class StreamApiForEachDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 5, 6, 7, 8, 9);

        System.out.println("normal for loop");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println("enhanced for loop");
        for (int i : nums) {
            System.out.println(i);
        }

        System.out.println("forEach loop");
        nums.forEach(n -> System.out.println(n));
    }

}
