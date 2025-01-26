package com.hierarchicalinheritance.bankaccount;

public class BankAccountMain {
    public static void main(String[] args) {
        // Creating objects of all subclasses and calling their methods
        // Displaying their result bank type
        BankAccount saving=new SavingsAccount(22376474,70000,9);
        saving.displayAccountType();

        BankAccount checking=new CheckingAccount(22376474,70000,5000);
        checking.displayAccountType();

        BankAccount fixedDeposit=new FixedDepositAccount(22376474,70000,10000);
        fixedDeposit.displayAccountType();
    }
}
