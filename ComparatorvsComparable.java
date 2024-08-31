import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }
}

public class ComparatorvsComparable {
    public static void main(String[] args) //
    {

        // Comparator<Students> com = new Comparator<Students>() {
        // public int compare(Students i, Students j) {
        // if (i.age > j.age)
        // return 1;
        // else
        // return -1;
        // }

        // };

        Comparator<Students> com = (i, j) -> i.age > j.age ? 1 : -1;

        List<Students> studs = new ArrayList<>();
        studs.add(new Students(12, "vish"));
        studs.add(new Students(67, "Ritesh"));
        studs.add(new Students(43, "Ritvi"));
        studs.add(new Students(77, "Vishakha"));

        Collections.sort(studs, com);

        for (Students s : studs) {
            System.out.println(s);
        }
        // Comparator<Integer> com = new Comparator<Integer>() {
        // public int compare(Integer i, Integer j) {
        // if (i % 10 > j % 10) {
        // return 1; // swap
        // } else {
        // return -1; // no swap
        // }

        // }
        // };
        // List<Integer> nums = new ArrayList<>();
        // nums.add(90);
        // nums.add(12);
        // nums.add(31);
        // nums.add(77);

        // Collections.sort(nums, com);
        // System.out.println(nums);

    }

}
