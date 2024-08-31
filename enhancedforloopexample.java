class student {
    int id;
    String name;
}

public class enhancedforloopexample {
    public static void main(String[] args) {
        student s = new student();
        s.id = 1;
        s.name = "vish";

        student s1 = new student();
        s1.id = 2;
        s1.name = "rit";

        student arr[] = new student[2];

        arr[0] = s;
        arr[1] = s1;

        // enhanced for loop   or ( foreach loop )
        for (student x : arr) {
            System.out.println(x.id + " " + x.name);
        }

    }
}