package test;
import college.students.Student;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Accessing public and protected members of Student.");
        System.out.println("Name: " + s.name);
    }
}
