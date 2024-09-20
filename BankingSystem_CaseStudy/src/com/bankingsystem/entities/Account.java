package com.bankingsystem.entities;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected Customer customer;

    public Account(String accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " to account: " + accountNumber);
    }

    public abstract void withdraw(double amount);

    public void transfer(Account toAccount, double amount) {
        if (this.balance >= amount) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to account: " + toAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}
