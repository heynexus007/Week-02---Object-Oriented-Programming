package com.hierarchicalinheritance.bankaccount;

// 'FixedDepositAccount' inherits 'BankAccount'
public class FixedDepositAccount extends BankAccount {
    int depositAmount;
    FixedDepositAccount(int accountNumber, int balance,int depositAmount){
        super(accountNumber,balance);
        this.depositAmount=depositAmount;
    }
    void displayAccountType(){
        super.displayAccountType();
        System.out.println("Fixed Deposit Account");
        System.out.println("Deposit Amount : "+depositAmount);
    }
}
