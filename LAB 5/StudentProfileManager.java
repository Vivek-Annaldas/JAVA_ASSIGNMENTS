import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int studentId;
    String name;
    double gpa;
    transient String password;

    public Student(int studentId, String name, double gpa, String password) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        this.password = password;
    }

    public String toString() {
        return "Student ID: " + studentId + "\nName: " + name + "\nGPA: " + gpa + "\nPassword: " + password;
    }
}

public class StudentProfileManager {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Vivek Annaldas", 8.7, "mypassword");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s1);
            System.out.println("Student object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Student loaded = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            loaded = (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nDeserialized Student Object:");
        System.out.println(loaded);
    }
}
