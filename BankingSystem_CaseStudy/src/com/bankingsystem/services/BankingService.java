package com.bankingsystem.services;

import java.util.List;

public interface BankingService {
    void createAccount(String customer, String accountType, String accountNumber);
    void deposit(String accountNumber, double amount);
    void withdraw(String accountNumber, double amount);
    void transfer(String fromAccountNumber, String toAccountNumber, double amount);
    double checkBalance(String accountNumber);
    List<Account> getCustomerAccounts(String customerId);
}

