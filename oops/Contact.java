import java.util.*;

class Contact {
    String name, phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }


    public String toString() {
        return "Name: " + name + ", Phone: " + phone;
    }
}

 class AddressBook {
    private static final List<Contact> contacts = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1 : 
                addContact(scanner);
                case 2 :
                 viewContacts();
                case 3 :
                 searchContact(scanner);
                case 4 : {
                    System.out.println("Exiting Address Book. Goodbye!");
                    scanner.close();
                    return;
                }
                default :
                 System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        
        contacts.add(new Contact(name, phone));
        System.out.println("Contact added successfully!");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("\nYour Contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    private static void searchContact(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        
        for (Contact contact : contacts) {
            if (contact.name.equalsIgnoreCase(name)) {
                System.out.println("Contact Found: " + contact);
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}
