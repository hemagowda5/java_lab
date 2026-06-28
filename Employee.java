public class Employee {

    String name;
    double salary;

    static int totalEmployees = 0;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    // Display Employee Details
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
        System.out.println();
    }

    // Static Method
    static void displayTotalEmployees() {
        System.out.println("Total Employees = " + totalEmployees);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Hema", 30000);
        Employee e2 = new Employee("Ravi", 40000);
        Employee e3 = new Employee("Anu", 35000);

        e1.display();
        e2.display();
        e3.display();

        Employee.displayTotalEmployees();
    }
}
