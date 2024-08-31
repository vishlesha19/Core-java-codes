public class Stringdemo {
    public static void main(String[] args) {

        String name = new String("vishlesha");

        System.out.println("hello " + name);

        System.out.println(name.charAt(2));

        String boyfriend = "ritesh";
        System.out.println(boyfriend.concat(" katkar"));

        String a = "vishlesha";
        // String a = "bhakti"; not possible
        a = a + " bhakti";
        System.out.println(a);
    }
}
