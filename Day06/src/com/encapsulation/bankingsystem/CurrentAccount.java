package com.encapsulation.bankingsystem;

// Subclass 'CurrentAccount'
public class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; // 2% annual interest

    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}
