package no3;

public class Account {
    // Instance variables
    private String id;
    private String name;
    private int balance;

    // Constructor with all parameters
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor with default balance
    public Account(String id, String name) {
        this(id, name, 0); // Default balance is 0
    }

    // Getter methods
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Method to credit (add) an amount to the balance
    public void credit(int amount) {
        balance += amount;
    }

    // Method to debit (subtract) an amount from the balance
    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Method to transfer an amount to another account
    public void transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // toString method to display account information
    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Test constructor and toString()
        Account a1 = new Account("A101", "Ligma", 88);
        System.out.println(a1); // toString();
        Account a2 = new Account("A102", "Deezma"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500); // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}

