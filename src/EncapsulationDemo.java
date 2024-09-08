// Account.java
 class Account {
    // Private variable to store account balance
    private double balance;

    // Constructor to initialize the account balance
     Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
        }
    }

    // Public getter method to access balance
    public double getBalance() {
        return balance;
    }

    // Public setter method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public setter method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

// Main.java
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create an account object with an initial balance
        Account myAccount = new Account(500);

        // Access balance using the getter method
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Deposit money using the deposit method
        myAccount.deposit(200);
        System.out.println("Updated Balance: " + myAccount.getBalance());

        // Attempt to withdraw more than the available balance
        myAccount.withdraw(800); // Should print an error

        // Withdraw a valid amount
        myAccount.withdraw(300);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());
    }
}

