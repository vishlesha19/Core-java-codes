import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students> {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Students that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        List<Students> studs = new ArrayList<>();
        studs.add(new Students(18, "ritesh"));
        studs.add(new Students(34, "ritesh"));
        studs.add(new Students(18, "ritesh"));
        studs.add(new Students(18, "ritesh"));
        studs.add(new Students(18, "ritesh"));

        Collections.sort(studs);

        for (Students s : studs) {
            System.out.println(s);
        }
    }

}
