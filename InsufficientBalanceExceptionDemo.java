import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class InsufficientBalanceExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        try {

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient Balance!");
            }

            balance = balance - amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + balance);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        }

        sc.close();
    }
}
