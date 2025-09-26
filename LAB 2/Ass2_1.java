abstract class Shape {
    abstract void calculateArea(); 

    void display() { 
        System.out.println("Displaying shape area...");
    }
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class Ass2_1 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);   // radius = 5
        circle.display();
        circle.calculateArea();

        Shape rectangle = new Rectangle(4, 5);  // length=4, breadth=5
        rectangle.display();
        rectangle.calculateArea();
    }
}
