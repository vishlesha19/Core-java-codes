class human {
    private int age = 21;
    private String name = "vishlesha";

    // getters nd setters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setName(String n) {
        this.name = n;
    }
}

public class encapsulationdemo {
    public static void main(String[] args) {
        human obj = new human();

        // setting usig methods
        obj.setAge(19);
        obj.setName("vishlesha");

        // accsesing using methods
        System.out.println(obj.getName() + ":" + obj.getAge());

    }

}
