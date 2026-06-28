import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {

        int a[] = {5,2,8};
        int b[] = {7,1,4};

        int c[] = new int[a.length+b.length];

        int k=0;

        for(int i=0;i<a.length;i++)
            c[k++] = a[i];

        for(int i=0;i<b.length;i++)
            c[k++] = b[i];

        Arrays.sort(c);

        System.out.println("Merged Array:");

        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");

    }

}
