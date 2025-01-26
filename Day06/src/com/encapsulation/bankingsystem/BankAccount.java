package com.encapsulation.bankingsystem;

import java.util.List;

// Abstract class 'BankAccount'
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount + ", New Balance : " + balance);
        }
    }

    // Concrete method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew : " + amount + ", New Balance : " + balance);
        }
        else {
            System.out.println("Invalid!!! your account has insufficient balance!");
        }
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to process accounts and calculate interest dynamically
    public static void getProcessAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.println("Account Number : " + account.getAccountNumber());
            System.out.println("Holder Name : " + account.getHolderName());
            System.out.println("Balance : " + account.getBalance());

            double interest = account.calculateInterest();
            System.out.println("Calculated Interest : " + interest);

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility : " + loanable.calculateLoanEligibility());
            }

            System.out.println("-------------------------");
        }
    }
}