interface FuelEfficient {
    void calculateMileage();
}

abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void start();

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle implements FuelEfficient {
    Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void start() {
        System.out.println("Car Started...");
    }

    @Override
    public void calculateMileage() {
        System.out.println("Mileage: 18 km/l");
    }
}

class Bike extends Vehicle implements FuelEfficient {
    Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void start() {
        System.out.println("Bike Started...");
    }

    @Override
    public void calculateMileage() {
        System.out.println("Mileage: 45 km/l");
    }
}

public class Ass3_1 {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Honda", 80);
        myCar.displayInfo();
        myCar.start();
        ((FuelEfficient)myCar).calculateMileage();

        System.out.println();

        Vehicle myBike = new Bike("Yamaha", 60);
        myBike.displayInfo();
        myBike.start();
        ((FuelEfficient)myBike).calculateMileage();
    }
}
