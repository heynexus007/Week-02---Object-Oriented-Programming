class BankAccount {
    // Instance variable
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    // Parameterized Constructor for bank account
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    // Public method to get balance
    public double getBalance() {
        return balance;
    }
    // Public method to set balance
    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
        
        else
            System.out.println("Invalid balance value.");
    }
}

// Creating a Subclass SavingsAccount for BankAccount
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    // Method to display Bank account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", "Bob", 5000.0);
        savingsAccount.displayAccountInfo();
        savingsAccount.setBalance(6000.0);
        System.out.println("Updated Balance: " + savingsAccount.getBalance());
    }
}
