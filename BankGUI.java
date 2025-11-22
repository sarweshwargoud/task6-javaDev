import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BankGUI extends JFrame {

    private SavingsAccount account;
    private JLabel balanceLabel;
    private JTextField amountField;
    private DefaultTableModel tableModel;

    public BankGUI() {
        account = new SavingsAccount("ACC1001", 1000.0);

        setTitle("Bank Account Simulation - Swing UI");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top balance display
        balanceLabel = new JLabel("Balance: ₹" + account.getBalance());
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 20));
        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(balanceLabel, BorderLayout.NORTH);

        // Input + buttons panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4, 10, 10));

        amountField = new JTextField();
        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");
        JButton interestBtn = new JButton("Apply Interest");

        panel.add(amountField);
        panel.add(depositBtn);
        panel.add(withdrawBtn);
        panel.add(interestBtn);

        add(panel, BorderLayout.CENTER);

        // Transaction table
        tableModel = new DefaultTableModel(new Object[]{"Type", "Amount", "Balance After"}, 0);
        JTable historyTable = new JTable(tableModel);
        add(new JScrollPane(historyTable), BorderLayout.SOUTH);

        // Action Listeners
        depositBtn.addActionListener(e -> depositAction());
        withdrawBtn.addActionListener(e -> withdrawAction());
        interestBtn.addActionListener(e -> interestAction());
    }

    private double getAmount() {
        try {
            return Double.parseDouble(amountField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter a valid amount");
            return -1;
        }
    }

    private void depositAction() {
        double amt = getAmount();
        if (amt > 0) {
            account.deposit(amt);
            tableModel.addRow(new Object[]{"Deposit", amt, account.getBalance()});
            updateBalance();
        }
    }

    private void withdrawAction() {
        double amt = getAmount();
        if (amt > 0) {
            account.withdraw(amt);
            tableModel.addRow(new Object[]{"Withdraw", amt, account.getBalance()});
            updateBalance();
        }
    }

    private void interestAction() {
        account.applyInterest();
        tableModel.addRow(new Object[]{"Interest", "-", account.getBalance()});
        updateBalance();
    }

    private void updateBalance() {
        balanceLabel.setText("Balance: ₹" + account.getBalance());
        amountField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BankGUI().setVisible(true));
    }
}
