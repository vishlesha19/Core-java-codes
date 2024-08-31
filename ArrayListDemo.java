import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList();
        nums.add(23);
        nums.add(8);
        nums.add(3);
        nums.add(5);
        nums.add(45);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(8));
        // System.out.println(nums);
        for (Integer n : nums) {
            System.out.println(n);
        }
    }

}
