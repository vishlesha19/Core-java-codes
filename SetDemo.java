import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        // orderwise
        Set<Integer> nums = new TreeSet();
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(12);
        System.out.println(nums);

        // unordered
        Set<Integer> nums1 = new HashSet<Integer>();
        nums1.add(3);
        nums1.add(4);
        nums1.add(5);
        nums1.add(6);
        nums1.add(12);
        System.out.println(nums1);

        // Iterator Interface
        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }

}
