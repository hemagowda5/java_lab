public class MethodOverloadingDemo {

    // Method with one integer
    void display(int num) {
        System.out.println("Integer: " + num);
    }

    // Method with one string
    void display(String name) {
        System.out.println("String: " + name);
    }

    // Method with two integers
    void display(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        obj.display(10);
        obj.display("Hema");
        obj.display(20, 30);
    }
}
