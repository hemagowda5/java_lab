import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String sentence = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sentence);

        System.out.println("Total Words = " + st.countTokens());

        while (st.hasMoreTokens()) {

            String word = st.nextToken();

            System.out.println(word);
            System.out.println("Length = " + word.length());
        }
    }
}
