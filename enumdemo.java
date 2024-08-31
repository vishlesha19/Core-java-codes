enum Status {
    Running, Failed, Pending, Success;
}

public class enumdemo {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Running;
        System.out.println(s);

        System.out.println(s.ordinal());

        Status[] ss = Status.values();
        System.out.println(ss[0]); // which give some address
        // so we used indexing to b b bbfetch exact value

        for (Status sss : ss) {
            System.out.println(sss + ":" + s.ordinal());
        }
    }
}
