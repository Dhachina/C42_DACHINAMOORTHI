package com.bankingsystem.main;

import com.bankingsystem.entities.Customer;

public class Main {
    public static void main(String[] args) {
        // Create Banking Service
        BankingService bankingService = new BankingServiceImpl();

        // Create customers
        Customer customer1 = new Customer("C001", "John Doe", "123 Elm St", "555-1234");
        Customer customer2 = new Customer("C002", "Jane Smith", "456 Oak St", "555-5678");

        // Create accounts for customer 1
        bankingService.createAccount(customer1, "Savings", "A001");
        bankingService.createAccount(customer1, "Current", "A002");

        // Create account for customer 2
        bankingService.createAccount(customer2, "Savings", "A003");

        // Perform operations
        bankingService.deposit("A001", 500);
        bankingService.withdraw("A001", 200);
        bankingService.transfer("A001", "A002", 100);
        
        // Check balances
        System.out.println("Balance of A001: " + bankingService.checkBalance("A001"));
        System.out.println("Balance of A002: " + bankingService.checkBalance("A002"));
    }

