enum Status {
    Running, Failed, Pending, Success;
}

public class switchEnum {
    public static void main(String[] args) {

        Status s = Status.Pending;

        switch (s) {
            // we cant use other status which are not included in
            // ststus class and also it automatically assume
            // that this constants are of class ststus

            case Running:
                System.out.println("all good");
                break;

            case Failed:
                System.out.println("try again");
                break;

            case Pending:
                System.out.println("please wait");
                break;

            case Success:
                System.out.println("done");
                break;

        }
    }
}
