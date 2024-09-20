package com.bankingsystem.entities;

import java.util.Date;

public class Transaction {
    private String transactionId;
    private Date transactionDate;
    private String transactionType;
    private double amount;
    private Account fromAccount;
    private Account toAccount;

    public Transaction(String transactionId, String transactionType, double amount, Account fromAccount, Account toAccount) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.transactionDate = new Date();
    }

    public void processTransaction() {
        switch (transactionType) {
            case "Transfer":
                fromAccount.transfer(toAccount, amount);
                break;
            case "Deposit":
                fromAccount.deposit(amount);
                break;
            case "Withdraw":
                fromAccount.withdraw(amount);
                break;
        }
        System.out.println("Transaction processed: " + transactionType + " of amount " + amount);
    }
}

