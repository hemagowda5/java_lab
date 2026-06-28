class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }
}

public class BankAccountUpdate {

    static void deposit(BankAccount b, double amount) {
        b.balance = b.balance + amount;
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(10000);

        System.out.println("Balance Before Deposit : " + b1.balance);

        deposit(b1, 5000);

        System.out.println("Balance After Deposit  : " + b1.balance);
    }
}
