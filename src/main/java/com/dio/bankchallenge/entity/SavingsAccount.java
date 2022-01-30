package com.dio.bankchallenge.entity;

import com.dio.bankchallenge.enums.AccountType;

    public class SavingsAccount extends Account {

    public SavingsAccount(AccountType type) {
        super();
        this.type = type;
    }

}
