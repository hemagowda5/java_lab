class Employee {

    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeObjectPassing {

    static void display(Employee e) {
        System.out.println("Employee ID : " + e.empId);
        System.out.println("Name        : " + e.name);
        System.out.println("Salary      : " + e.salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(201, "Rahul", 45000);

        display(e1);
    }
}
