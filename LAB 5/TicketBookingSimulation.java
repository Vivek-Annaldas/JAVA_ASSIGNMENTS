import java.util.Random;

class TicketBookingSystem {
    private int availableTickets;

    TicketBookingSystem(int totalTickets) {
        this.availableTickets = totalTickets;
    }

    public synchronized void bookTickets(String user, int numTickets) {
        if (numTickets <= availableTickets) {
            System.out.println(user + " booked " + numTickets + " tickets successfully.");
            availableTickets -= numTickets;
        } else {
            System.out.println(user + " failed to book " + numTickets + " tickets. Not enough tickets left.");
        }
        System.out.println("Tickets remaining: " + availableTickets);
    }
}

class User implements Runnable {
    private TicketBookingSystem system;
    private String userName;
    private Random random = new Random();

    User(TicketBookingSystem system, String userName) {
        this.system = system;
        this.userName = userName;
    }

    public void run() {
        int numTickets = random.nextInt(5) + 1;
        system.bookTickets(userName, numTickets);
    }
}

public class TicketBookingSimulation {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem(20);
        for (int i = 1; i <= 10; i++) {
            Thread userThread = new Thread(new User(system, "User" + i));
            userThread.start();
        }
    }
}
