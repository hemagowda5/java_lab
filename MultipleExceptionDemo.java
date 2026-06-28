import java.util.Scanner;

public class MultipleExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        System.out.print("Enter Array Index: ");
        int index = sc.nextInt();

        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        try {
            int result = arr[index] / divisor;
            System.out.println("Result = " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero!");
        }

        sc.close();
    }
}
