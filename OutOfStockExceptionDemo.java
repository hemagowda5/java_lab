import java.util.Scanner;

// Custom Exception
class OutOfStockException extends Exception {

    OutOfStockException(String message) {
        super(message);
    }
}

public class OutOfStockExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stock = 20;

        System.out.print("Enter Required Quantity: ");
        int quantity = sc.nextInt();

        try {

            if (quantity > stock) {
                throw new OutOfStockException("Requested quantity exceeds available stock.");
            }

            System.out.println("Product Available");

        } catch (OutOfStockException e) {

            System.out.println(e.getMessage());

        }

        sc.close();
    }
}
