package com.dio.bankchallenge.entity;

import com.dio.bankchallenge.enums.AccountType;

public class CheckingAccount extends Account {

    public CheckingAccount(Client clientName, AccountType type) {
        super(clientName);
        this.type = type;
    }

}
