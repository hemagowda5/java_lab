import java.util.Scanner;

public class NestedTryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10,20,30};

        try {

            System.out.print("Enter Index: ");
            int index = sc.nextInt();

            try {

                System.out.print("Enter Divisor: ");
                int d = sc.nextInt();

                System.out.println("Result = " + arr[index] / d);

            } catch (ArithmeticException e) {

                System.out.println("Cannot Divide by Zero!");

            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid Array Index!");

        }

        sc.close();
    }
}
