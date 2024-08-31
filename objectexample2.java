class getpen {
    public void penbycost(int a) {
        if (a > 10) {
            System.out.println("pen");
        } else {
            System.out.println("nothing");
        }

    }

}

public class objectexample2 {

    public static void main(String[] args) {
        getpen gp = new getpen();
        gp.penbycost(0);

    }

}
