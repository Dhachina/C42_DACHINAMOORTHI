package com.bankingsystem.entities;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, Customer customer, double overdraftLimit) {
        super(accountNumber, customer);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " from current account: " + accountNumber);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

