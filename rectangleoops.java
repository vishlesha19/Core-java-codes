import java.util.Scanner;

class Rectangle {
    public int length;
    public int breadth;

    public void area() {
        int area = length * breadth;
        System.out.println("area of rectangle: " + area);
    }

    public void perimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("area of rectangle: " + perimeter);
    }
}

public class rectangleoops {
    public static void main(String[] args) {

        Rectangle rc = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        rc.length = sc.nextInt();
        System.out.print("enetr breadth: ");
        rc.breadth = sc.nextInt();
        rc.area();
        rc.perimeter();

    }

}
