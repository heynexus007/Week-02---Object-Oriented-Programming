package com.hierarchicalinheritance.bankaccount;

public class SavingsAccount extends BankAccount {
    int interestRate ;
    SavingsAccount(int accountNumber, int balance, int interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    void displayAccountType(){
        super.displayAccountType();
        System.out.println("Savings Account");
        System.out.println("Interest Rate : "+ interestRate+"%");
    }
}
