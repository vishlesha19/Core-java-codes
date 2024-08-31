class BankAccount {
    private int balance;
    private int accountNo;
    private String accountHolder;

    // constructor
    public BankAccount(int accountNo, String accountHolder) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        balance = 0;
    }

    // deposit method
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited : $" + amount);
    }

    // withdraw method
    public void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Withdraw: $" + amount);
    }

    // 0account info method
    public void info() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Account Balance: " + balance);
    }

}

public class bankdemo {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount(123, "RiteshKatkar");
        obj.deposit(500000);
        obj.withdraw(200);
        obj.info();
    }

}
