import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String, String> contacts;
    
    public PhoneBook() {
        contacts = new HashMap<>();
    }
    
    public void addContact(String name, String phone) {
        contacts.put(name, phone);
        System.out.println("Contact added: " + name);
    }
    
    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(name + ": " + contacts.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }
    
    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact deleted: " + name);
        } else {
            System.out.println("Contact not found");
        }
    }
    
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts");
            return;
        }
        
        System.out.println("\n--- All Contacts ---");
        for (String name : contacts.keySet()) {
            System.out.println(name + ": " + contacts.get(name));
        }
        System.out.println("-------------------\n");
    }
    
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        
        book.addContact("Jagan", "9876543210");
        book.addContact("Rahul", "8765432109");
        book.addContact("Priya", "7654321098");
        
        book.displayAllContacts();
        book.searchContact("Jagan");
        book.deleteContact("Rahul");
        book.displayAllContacts();
    }
}