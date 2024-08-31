class human {
    private int age;
    private String name;

    // getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // default constructor
    public human() {
        age = 21;
        name = "vishlesha";
    }

    // parameterized constructor
    public human(int a, String n) {
        age = a;
        name = n;
    }

    // parameterize with name only
    public human(String n) {
        name = n;
        age = 19;

    }

}

public class constructordemo {
    public static void main(String args[]) {
        // human obj = new human();
        // human obj = new human(18, "ritvi");
        human obj = new human();
        System.out.println(obj.getAge() + ":" + obj.getName());

    }
}
