class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentObjectPassing {

    static void display(Student s) {
        System.out.println("Student ID   : " + s.id);
        System.out.println("Student Name : " + s.name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Hema");

        display(s1);
    }
}
