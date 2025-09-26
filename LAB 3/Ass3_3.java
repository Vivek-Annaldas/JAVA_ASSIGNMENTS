interface Sellable {
    void displayItemDetails();
    double getPrice();
}

abstract class Product {
    String name;
    String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    abstract double calculateDiscount();
}

class ElectronicItem extends Product implements Sellable {
    double price;

    ElectronicItem(String name, double price) {
        super(name, "Electronics");
        this.price = price;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Discounted Price: " + calculateDiscount());
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    double calculateDiscount() {
        return price * 0.9; // 10% discount
    }
}

class ClothingItem extends Product implements Sellable {
    double price;

    ClothingItem(String name, double price) {
        super(name, "Clothing");
        this.price = price;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Discounted Price: " + calculateDiscount());
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    double calculateDiscount() {
        return price * 0.85; // 15% discount
    }
}
public class Ass3_3 {
    public static void main(String[] args) {
        Sellable item1 = new ElectronicItem("Laptop", 50000);
        item1.displayItemDetails();

        System.out.println();

        Sellable item2 = new ClothingItem("T-Shirt", 1000);
        item2.displayItemDetails();
    }
}
