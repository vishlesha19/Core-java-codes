enum Status {
    Running, Failed, Pending, Success;
}

public class ifelseEnum {
    public static void main(String[] args) {

        Status s = Status.Pending; // we storing constant pending
        // in vriable s of type status
        if (s == Status.Running) {
            System.out.println("all good");
        } else if (s == Status.Failed) {
            System.out.println("try again");
        } else if (s == Status.Pending) {
            System.out.println("please wait");
        } else {
            System.out.println("Done");
        }
    }
}
