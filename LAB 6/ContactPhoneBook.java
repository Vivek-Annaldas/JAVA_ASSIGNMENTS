import java.util.*;

public class ContactPhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        String command;

        System.out.println("Simple Contact Phone Book");
        System.out.println("Commands: add, search, list, quit");

        while (true) {
            System.out.print("\nEnter command: ");
            command = sc.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter name: ");
                    String name = sc.nextLine().trim();
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine().trim();
                    if (phoneBook.containsKey(name)) {
                        System.out.println("Contact exists. Updating phone number...");
                    }
                    phoneBook.put(name, phone);
                    System.out.println("Contact saved successfully.");
                    break;

                case "search":
                    System.out.print("Enter name to search: ");
                    name = sc.nextLine().trim();
                    if (phoneBook.containsKey(name)) {
                        System.out.println("Phone number: " + phoneBook.get(name));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case "list":
                    System.out.println("\nAll Contacts:");
                    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case "quit":
                    System.out.println("Exiting phone book. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }
}
