package com.encapsulation.bankingsystem;

// Interface Loanable
interface Loanable {
    // Apply for a loan
    void applyForLoan(double loanAmount);
    // Calculate loan eligibility
    double calculateLoanEligibility();
}
