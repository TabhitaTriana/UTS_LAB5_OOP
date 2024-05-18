package no3;

public class Account {
    // Variabel instance dari kelas Account
    private String id;
    private String name;
    private int balance;

    // Constructur yang menerima semua parameter
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor akan menggunakan nilai saldo default
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

    // Method untuk menambahkan saldo
    public void credit(int amount) {
        balance += amount;
    }

    // Method untuk mengurangi saldo
    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Method untuk transfer saldo ke akun lain
    public void transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Method toString untuk menampilkan informasi akun
    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }



}

