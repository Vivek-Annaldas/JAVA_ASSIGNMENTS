interface Login {
    boolean login(String username, String password);
}

abstract class Person {
    String name;
    String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract String getRole();

    void displayInfo() {
        System.out.println("Role: " + getRole());
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Student extends Person implements Login {
    Student(String name, String id) {
        super(name, id);
    }

    @Override
    public boolean login(String username, String password) {
        if(username.equals("abhijit") && password.equals("student123")) {
            System.out.println("Student Login Successful");
            return true;
        } else {
            System.out.println("Student Login Failed");
            return false;
        }
    }

    @Override
    String getRole() {
        return "Student";
    }
}

class Faculty extends Person implements Login {
    Faculty(String name, String id) {
        super(name, id);
    }

    @Override
    public boolean login(String username, String password) {
        if(username.equals("prof") && password.equals("faculty123")) {
            System.out.println("Faculty Login Successful");
            return true;
        } else {
            System.out.println("Faculty Login Failed");
            return false;
        }
    }

    @Override
    String getRole() {
        return "Faculty";
    }
}

public class Ass3_2 {
    public static void main(String[] args) {
        Person p;

        p = new Student("Abhijit", "S101");
        if(((Login)p).login("abhijit", "student123")) {
            p.displayInfo();
        }

        System.out.println();

        p = new Faculty("Dr. Sharma", "F202");
        if(((Login)p).login("prof", "faculty123")) {
            p.displayInfo();
        }
    }
}
