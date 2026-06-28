import java.util.Scanner;

public class StudentMarksMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[3][3];

        System.out.println("Enter Marks of 3 Students in 3 Subjects:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double average = total / 3.0;

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Total Marks = " + total);
            System.out.println("Average Marks = " + average);
        }
    }
}
