import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();

        // Float
        System.out.print("Enter a Float: ");
        float f = sc.nextFloat();

        // Double
        System.out.print("Enter a Double: ");
        double d = sc.nextDouble();

        // Character
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        // Boolean
        System.out.print("Enter a Boolean (true/false): ");
        boolean b = sc.nextBoolean();

        // String
        sc.nextLine(); // Clears the newline character
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("\n----- Entered Values -----");
        System.out.println("Integer  : " + num);
        System.out.println("Float    : " + f);
        System.out.println("Double   : " + d);
        System.out.println("Character: " + ch);
        System.out.println("Boolean  : " + b);
        System.out.println("String   : " + str);

        sc.close();
    }
}
