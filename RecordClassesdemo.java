record Alien(int id, String name) {
}

public class RecordClassesdemo {
    public static void main(String[] args) {

        Alien a1 = new Alien(1, "ritesh");
        Alien a2 = new Alien(1, "ritesh");
        System.out.println(a1);

    }

}

// class Alien {
// private final int id;
// private final String name;

// public Alien(int id, String name) {
// this.id = id;
// this.name = name;
// }

// public int getId() {
// return id;
// }

// public String getName() {
// return name;
// }

// public String toString() {
// return "Alien{" + "id=" + id +
// ",name='" + name + "\'" +
// "}";
// }

// }
