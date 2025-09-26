package college.students;

public class Student {
    public String name = "Vivek";
    protected int roll = 101;
    private double marks = 89.5;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
}
