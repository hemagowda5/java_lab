import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        String str = sc.nextLine();

        try {
            int num = Integer.parseInt(str);
            System.out.println("Number = " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number Format!");
        }

        sc.close();
    }
}
