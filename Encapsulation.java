// A simple class that models a bank account
class BankAccount {
    // private field: stores the account balance and is hidden from other classes
    private double balance;

    // Constructor: used to create a new BankAccount with an initial balance
    public BankAccount(double initialBalance) {
        // initialize the balance field with the value passed to the constructor
        balance = initialBalance;
    }

    // Public getter: allows other classes to read the balance (but not modify it directly)
    public double getBalance() {
        // return the current balance value
        return balance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        // Only accept positive deposit amounts — ignore zero or negative values
        if (amount > 0) {
            // Add the deposit amount to the current balance (same as balance = balance + amount)
            balance += amount;
        }
        // If amount <= 0, the method does nothing (silently rejects invalid deposit)
    }
}

// Class that contains the program entry point (main method)
public class Encapsulation {
    // main is the method the JVM calls to start the program
    // String[] args receives command-line arguments (not used here)
    public static void main(String[] args) {
        // Create a new BankAccount object with initial balance 1000
        // 'acc' is a reference to that BankAccount object
        BankAccount acc = new BankAccount(1000);

        // Call deposit to add 500 to the account balance
        acc.deposit(500);

        // Print the current balance to the console:
        // - "Balance: " is a String
        // - acc.getBalance() returns a double (1500.0)
        // - the + operator concatenates them into one String for printing
        System.out.println("Balance: " + acc.getBalance());
    }
}
