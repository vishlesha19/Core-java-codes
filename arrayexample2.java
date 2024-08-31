class student {
    int id;
    String name;
    String add;
}

public class arrayexample2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.id = 3;
        s1.name = "vish";
        s1.add = "sanpada";
        student s2 = new student();
        s2.id = 3;
        s2.name = "rit";
        s2.add = "jui";
        student s3 = new student();
        s3.id = 3;
        s3.name = "sakshi";
        s3.add = "nerul";

        student std[] = new student[3];
        std[0] = s1;
        std[1] = s2;
        std[2] = s3;

        for (int i = 0; i <= 2; i++) {
            System.out.println(std[i].id + " " + std[i].add + " " + std[i].name);
        }

    }
}
