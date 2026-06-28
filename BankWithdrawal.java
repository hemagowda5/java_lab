import java.util.Scanner;

public class BankWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient Balance!");
            } else {
                balance = balance - withdraw;
                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance = " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
