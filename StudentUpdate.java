class Student {

    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class StudentUpdate {

    static void updateMarks(Student s) {
        s.marks = 95;
    }

    public static void main(String[] args) {

        Student s1 = new Student(80);

        System.out.println("Marks Before Update : " + s1.marks);

        updateMarks(s1);

        System.out.println("Marks After Update  : " + s1.marks);
    }
}
