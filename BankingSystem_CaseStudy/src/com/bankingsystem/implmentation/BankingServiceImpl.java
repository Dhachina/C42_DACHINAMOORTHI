package com.bankingsystem.implmentation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bankingsystem.services.BankingService;

public class BankingServiceImpl implements BankingService {
    private Map<String, Account> accountMap;

    public BankingServiceImpl() {
        this.accountMap = new HashMap<>();
    }

    @Override
    public void createAccount(Customer customer, String accountType, String accountNumber) {
        Account account = null;
        if ("Savings".equalsIgnoreCase(accountType)) {
            account = new SavingsAccount(accountNumber, customer, 3.5);
        } else if ("Current".equalsIgnoreCase(accountType)) {
            account = new CurrentAccount(accountNumber, customer, 1000.0);
        }

        if (account != null) {
            accountMap.put(accountNumber, account);
            customer.addAccount(account);
            System.out.println(accountType + " account created with account number: " + accountNumber);
        }
    }

    @Override
    public void deposit(String accountNumber, double amount) {
        Account account = accountMap.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    @Override
    public void withdraw(String accountNumber, double amount) {
        Account account = accountMap.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    @Override
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = accountMap.get(fromAccountNumber);
        Account toAccount = accountMap.get(toAccountNumber);
        if (fromAccount != null && toAccount != null) {
            fromAccount.transfer(toAccount, amount);
        } else {
            System.out.println("One or both accounts not found.");
        }
    }

    @Override
    public double checkBalance(String accountNumber) {
        Account account = accountMap.get(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account not found.");
            return 0.0;
        }
    }

    @Override
    public List<Account> getCustomerAccounts(String customerId) {
        // This method would typically access the customer's accounts from a database
        return null; // Return list of accounts (not implemented here)
    }
}

