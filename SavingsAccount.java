// SavingsAccount.java
public class SavingsAccount extends Account {

    private double interestRate = 0.02; // 2% interest

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    // override withdraw to enforce minimum balance
    @Override
    public void withdraw(double amount) {
        double minimumBalance = 500.0;
        if (balance - amount < minimumBalance) {
            System.out.println("Cannot withdraw. Minimum balance of " + minimumBalance + " must be maintained.");
            return;
        }
        super.withdraw(amount); // call parent implementation
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        transactions.add("Interest added: " + interest + " | New balance: " + balance);
        System.out.println("Interest applied.");
    }
}
