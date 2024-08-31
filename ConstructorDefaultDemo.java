class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        name = "vishleshaa";
    }

}

public class ConstructorDefaultDemo {
    public static void main(String[] args) {

        Student obj = new Student("vishle");
        // Student obj = new Student("vish");
        System.out.println(obj.name);

    }

}
