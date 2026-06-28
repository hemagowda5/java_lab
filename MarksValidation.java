import java.util.Scanner;

public class MarksValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        try {

            if (marks < 0 || marks > 100) {
                throw new Exception("Invalid Marks!");
            }

            System.out.println("Valid Marks = " + marks);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        sc.close();
    }
}
