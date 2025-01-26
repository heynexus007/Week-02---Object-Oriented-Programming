package com.hierarchicalinheritance.bankaccount;

// 'CheckingAccount' inherits 'BankAccount'
public class CheckingAccount extends BankAccount {
    int withdrawalLimit ;
    CheckingAccount(int accountNumber, int balance, int withdrawalLimit ){
        super(accountNumber, balance);
        this.withdrawalLimit =withdrawalLimit ;
    }
    void displayAccountType(){
        super.displayAccountType();
        System.out.println("Checking Account");
        System.out.println("Withdraw Limit : "+withdrawalLimit);
    }
}
