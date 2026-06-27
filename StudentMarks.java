import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];
        int sum = 0;
        int highest = 0;

        for(int i=0;i<5;i++) {
            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();

            sum += marks[i];

            if(marks[i] > highest)
                highest = marks[i];
        }

        double avg = sum / 5.0;

        int count = 0;

        for(int i=0;i<5;i++) {
            if(marks[i] > avg)
                count++;
        }

        System.out.println("Average = " + avg);
        System.out.println("Highest = " + highest);
        System.out.println("Students above average = " + count);

        sc.close();
    }
}
