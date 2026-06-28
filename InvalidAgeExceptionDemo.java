import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidAgeExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        try {

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }

            System.out.println("Eligible to Vote");

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }

        sc.close();
    }
}
