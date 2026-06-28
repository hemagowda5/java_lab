class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PersonUpdate {

    static Person updatePerson(Person p) {
        p.name = "Hema";
        p.age = 21;
        return p;
    }

    public static void main(String[] args) {

        Person p1 = new Person("Anu", 20);

        System.out.println("Before Update:");
        System.out.println("Name : " + p1.name);
        System.out.println("Age  : " + p1.age);

        p1 = updatePerson(p1);

        System.out.println("\nAfter Update:");
        System.out.println("Name : " + p1.name);
        System.out.println("Age  : " + p1.age);
    }
}
