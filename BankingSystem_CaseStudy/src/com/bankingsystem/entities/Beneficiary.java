package com.bankingsystem.entities;

public class Beneficiary {
    private String beneficiaryId;
    private String name;
    private String accountNumber;
    private String bankName;

    public Beneficiary(String beneficiaryId, String name, String accountNumber, String bankName) {
        this.beneficiaryId = beneficiaryId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }
}

