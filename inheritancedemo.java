
public class inheritancedemo {
    public static void main(String[] args) {
        VeryAdvCal obj = new VeryAdvCal();
        int a = obj.add(4, 6);
        int b = obj.sub(3, 8);
        int c = obj.multi(4, 6);
        int d = obj.div(9, 3);
        int e = (int) obj.pow(5, 3);
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
