package com.bankingsystem.entities;

	import java.util.ArrayList;
	import java.util.List;

	public class Customer {
	    private String customerId;
	    private String name;
	    private String address;
	    private String contactDetails;
	    private List<Account> accounts;

	    public Customer(String customerId, String name, String address, String contactDetails) {
	        this.customerId = customerId;
	        this.name = name;
	        this.address = address;
	        this.contactDetails = contactDetails;
	        this.accounts = new ArrayList<>();
	    }

	    public String getCustomerId() {
	        return customerId;
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Account> getAccounts() {
	        return accounts;
	    }

	    public void addAccount(Account account) {
	        accounts.add(account);
	    }
	}


