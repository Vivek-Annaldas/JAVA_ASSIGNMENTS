import java.util.LinkedList;
import java.util.Queue;

class OrderCounter {
    private Queue<String> orders = new LinkedList<>();
    private final int CAPACITY = 5;
    private int orderNumber = 1;

    public synchronized void placeOrder() throws InterruptedException {
        while (orders.size() == CAPACITY) {
            System.out.println("Chef waiting... Counter full!");
            wait();
        }
        String order = "Order #" + orderNumber++;
        orders.add(order);
        System.out.println("Chef prepared: " + order);
        notifyAll();
    }

    public synchronized void serveOrder() throws InterruptedException {
        while (orders.isEmpty()) {
            System.out.println("Waiter waiting... Counter empty!");
            wait();
        }
        String order = orders.poll();
        System.out.println("Waiter served: " + order);
        notifyAll();
    }
}

class Chef implements Runnable {
    private OrderCounter counter;

    Chef(OrderCounter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            while (true) {
                counter.placeOrder();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Waiter implements Runnable {
    private OrderCounter counter;

    Waiter(OrderCounter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            while (true) {
                counter.serveOrder();
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class RestaurantKitchen {
    public static void main(String[] args) {
        OrderCounter counter = new OrderCounter();
        Thread chef = new Thread(new Chef(counter));
        Thread waiter = new Thread(new Waiter(counter));

        chef.start();
        waiter.start();
    }
}
