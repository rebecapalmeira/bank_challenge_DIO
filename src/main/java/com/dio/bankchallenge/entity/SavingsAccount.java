package com.dio.bankchallenge.entity;

import com.dio.bankchallenge.enums.AccountType;

    public class SavingsAccount extends Account {

    public SavingsAccount(Client clientName, AccountType type) {
        super(clientName);
        this.type = type;

    }

}
