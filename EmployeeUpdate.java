class Employee {

    double salary;

    Employee(double salary) {
        this.salary = salary;
    }
}

public class EmployeeUpdate {

    static void increaseSalary(Employee e) {
        e.salary = e.salary + (e.salary * 10 / 100);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(50000);

        System.out.println("Salary Before Increment : " + e1.salary);

        increaseSalary(e1);

        System.out.println("Salary After Increment  : " + e1.salary);
    }
}
