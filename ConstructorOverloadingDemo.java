public class ConstructorOverloadingDemo {

    String name;
    int age;

    // Default Constructor
    ConstructorOverloadingDemo() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    ConstructorOverloadingDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        ConstructorOverloadingDemo obj1 = new ConstructorOverloadingDemo();

        ConstructorOverloadingDemo obj2 = new ConstructorOverloadingDemo("Hema", 20);

        obj1.display();
        obj2.display();
    }
}
