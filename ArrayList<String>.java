import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter 5 Student Names:");

        for (int i = 0; i < 5; i++) {
            students.add(sc.nextLine());
        }

        Collections.sort(students);

        System.out.println("\nStudents in Alphabetical Order:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
