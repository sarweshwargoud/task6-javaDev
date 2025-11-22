// Account.java
import java.util.ArrayList;

public class Account {
    protected String accountNumber;
    protected double balance;
    protected ArrayList<String> transactions = new ArrayList<>();

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
        transactions.add("Account opened with balance: " + openingBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }
        balance += amount;
        transactions.add("Deposited: " + amount + " | New balance: " + balance);
        System.out.println("Deposit successful.");
    }

    // withdraw method (can be overridden)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        transactions.add("Withdrawn: " + amount + " | New balance: " + balance);
        System.out.println("Withdrawal successful.");
    }

    public void showHistory() {
        System.out.println("\n--- Transaction History (" + accountNumber + ") ---");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}
