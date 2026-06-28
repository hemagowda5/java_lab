import java.util.Scanner;

public class AgeValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new Exception("You are not eligible to vote.");
            } else {
                System.out.println("Eligible to Vote");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
