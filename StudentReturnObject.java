class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentReturnObject {

    static Student getStudent() {
        Student s = new Student(101, "Hema");
        return s;
    }

    public static void main(String[] args) {

        Student s1 = getStudent();

        System.out.println("Student ID   : " + s1.id);
        System.out.println("Student Name : " + s1.name);
    }
}
