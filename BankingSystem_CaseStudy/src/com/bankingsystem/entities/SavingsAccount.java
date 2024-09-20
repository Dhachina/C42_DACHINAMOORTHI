package com.bankingsystem.entities;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, Customer customer, double interestRate) {
        super(accountNumber, customer);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " from savings account: " + accountNumber);
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }
}
