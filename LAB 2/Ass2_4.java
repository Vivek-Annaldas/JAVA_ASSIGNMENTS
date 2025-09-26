class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Ass2_4{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of 2 integers: " + calc.add(2, 3));
        System.out.println("Addition of 2 doubles: " + calc.add(3.5, 4.3));
        System.out.println("Addition of 3 integers: " + calc.add(3, 4, 5));
    }
}
