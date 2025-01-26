package com.encapsulation.bankingsystem;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        // Creating a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();
        SavingsAccount savingsAccount= new SavingsAccount("45647885745", "Lucy", 80000);
        CurrentAccount currAccount=new CurrentAccount("4549835459", "John Cartar", 50000);

        // Add SavingsAccount and CurrentAccount objects
        accounts.add(savingsAccount);
        accounts.add(currAccount);

        // Process accounts
        BankAccount.getProcessAccounts(accounts);
    }
}
