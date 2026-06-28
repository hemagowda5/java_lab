import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append(str1);
        sb.append(" ");
        sb.append(str2);

        System.out.println("After Append: " + sb);

        sb.insert(5, " Java");

        System.out.println("After Insert: " + sb);

        sb.reverse();

        System.out.println("After Reverse: " + sb);
    }
}
