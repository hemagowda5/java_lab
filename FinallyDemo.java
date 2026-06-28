import java.util.Scanner;

public class FinallyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero!");
        } finally {
            System.out.println("Finally Block Executed.");
        }

        sc.close();
    }
}
