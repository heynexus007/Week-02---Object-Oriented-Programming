package com.hierarchicalinheritance.bankaccount;

// It is the Superclass
public class BankAccount{
    int accountNumber,balance;
    BankAccount(int accountNumber, int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void displayAccountType(){
        System.out.println("\nAccount Number : "+accountNumber);
        System.out.println("Account Balance : "+balance);
        System.out.println("----Bank Account Type----");
    }
}
