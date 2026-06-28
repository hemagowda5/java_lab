class BankAccount {

    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class BankAccountReturn {

    static BankAccount createAccount() {
        return new BankAccount(12345, 50000);
    }

    public static void main(String[] args) {

        BankAccount b = createAccount();

        System.out.println("Account Number : " + b.accountNumber);
        System.out.println("Balance        : " + b.balance);
    }
}
