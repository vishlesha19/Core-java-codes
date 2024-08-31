import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        // unordered
        Map<String, Integer> students = new HashMap<>();

        students.put("Vish", 12);
        students.put("sak", 56);
        students.put("roh", 43);

        System.out.println(students);

        System.out.println(students.get("sak"));

        // to get all values only
        System.out.println(students.values());

        // to remove key
        students.remove("roh");

        // will give all keys a this keys
        // are unique which makes them a set
        System.out.println(students.keySet());

        // to fetch each key at a time
        for (String key : students.keySet()) {
            System.out.println(key + ":" + students.get(key));
        }

    }

}
