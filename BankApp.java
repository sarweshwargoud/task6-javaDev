// BankApp.java
import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // polymorphism: reference type = Account, object = SavingsAccount
        Account account = new SavingsAccount("ACC1001", 1000.0);

        while (true) {
            System.out.println("\n===== BANK ACCOUNT SIMULATION =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Apply Interest (Savings)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double amt = readDouble(sc);
                    account.deposit(amt);
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double amt = readDouble(sc);
                    account.withdraw(amt);
                }
                case 3 -> System.out.println("Current balance: " + account.getBalance());
                case 4 -> account.showHistory();
                case 5 -> {
                    if (account instanceof SavingsAccount sa) {
                        sa.applyInterest();
                    } else {
                        System.out.println("Interest only supported for SavingsAccount.");
                    }
                }
                case 6 -> {
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static double readDouble(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid amount: ");
            }
        }
    }
}
