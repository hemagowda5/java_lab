public class ArrayElements {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        int sum = 0;
        int largest = arr[0];
        int smallest = arr[0];

        System.out.println("Array Elements:");

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");

            sum += arr[i];

            if(arr[i] > largest)
                largest = arr[i];

            if(arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}
