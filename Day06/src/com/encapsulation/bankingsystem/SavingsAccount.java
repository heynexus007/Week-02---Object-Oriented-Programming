package com.encapsulation.bankingsystem;

// Subclass SavingsAccount
public class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest
    private static final double LOAN_ELIGIBILITY_FACTOR = 5; // 5 times the balance

    // Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    // Implement 'Loanable' methods
    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan applied for amount: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_ELIGIBILITY_FACTOR;
    }
}
