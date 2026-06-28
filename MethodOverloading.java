public class MethodOverloading {

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(int age) {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        obj.display("Hema");
        obj.display(20);
    }
}
